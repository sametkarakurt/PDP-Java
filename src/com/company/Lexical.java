package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Lexical {

    String relationalOperators = "<=|>=|==|!=|<(?!=)|>(?!=)";
    String logicalOperators = "\\|{2}|&&|!(?!=)";
    String unaryOperators = "\\+{2}|\\-{2}|!(?!=)";
    String binaryOperators = "(?<!\\+)\\+(?!\\+|=)|(?<!\\-)\\-(?!-|=)|(?<!\\+|<|>|!|=|-|/|\\*|%|\\||&|\\^)=(?!=)|/(?!=)|\\*(?!=)|%(?!=)";
    String arithmeticalOperators = "\\+=|-=|/=|\\*=|%=|&=|\\|=|\\^=|\\++|\\+|--|-|\\*|/|%|(?<!&)&(?!&)|(?<!\\|)\\|(?!\\|)|\\^|(?<!<|>|!|=)=(?!=)";
    String totalOperand = "<=|>=|==|!=|<(?!=)|>(?!=)|\\|{2}|&&|\\+=|-=|/=|\\*=|%=|&=|\\|=|\\^=|(?<!\\+)\\+(?!\\+|=)|(?<!\\-)\\-(?!-|=)|\\*|/|%|(?<!&)&(?!&)|(?<!\\|)\\|(?!\\|)|\\^|(?<!<|>|!|=)=(?!=)";
    public int isRelationalOperators(String value){
        int count = 0;


        Pattern pattern = Pattern.compile("<=|>=|==|!=|<(?!=)|>(?!=)");
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

        Pattern pattern = Pattern.compile("\\+{2}|\\-{2}|!(?!=)");
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


    public int totalOperand(String value) {
        int count = 0;

        Pattern pattern = Pattern.compile("<=|>=|==|!=|<(?!=)|>(?!=)|\\|{2}|&&|\\+=|-=|/=|\\*=|%=|&=|\\|=|\\^=|(?<!\\+)\\+(?!\\+|=)|(?<!\\-)\\-(?!-|=)|\\*|/|%|(?<!&)&(?!&)|(?<!\\|)\\|(?!\\|)|\\^|(?<!<|>|!|=)=(?!=)");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;
        return count;
    }


}

