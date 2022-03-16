package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Lexical {

    //All operators

    String [] relationalOperators = {"==","!=",">","<",">=","<="};

    String [] logicalOperators = {"&&","||","!"};





    public int isRelationalOperators(String value){
        int count = 0;


        Pattern pattern = Pattern.compile("<=|>=|==|!=|^<$|^>$");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;

        return count;

    }
    public int isLogicalOperators(String value) {
        int count = 0;

        Pattern pattern = Pattern.compile("\\|{2}|&&|!(?!=)");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;
        return count;
    }

    public int isUnary(String value) {
        int count = 0;

        Pattern pattern = Pattern.compile("\\+{2}|\\-{2}");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;
        return count;
    }

    public int isBinary(String value) {
        int count = 0;

        Pattern pattern = Pattern.compile("(?<!\\+)\\+(?!\\+|=)|(?<!\\-)\\-(?!-|=)|(?<!\\+|<|>|!|=|-|/|\\*|%|\\||&|\\^)=(?!=)|/(?!=)|\\*(?!=)|%(?!=)");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;
        return count;
    }



    public int isAritmetical(String value) {
        int count = 0;


        Pattern pattern = Pattern.compile("\\+=|-=|/=|\\*=|%=|&=|\\|=|\\^=|\\++|\\+|--|-|\\*|/|%|(?<!&)&(?!&)|(?<!\\|)\\|(?!\\|)|\\^|(?<!<|>|!|=)=(?!=)");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
             count++;
        return count;
    }




}

