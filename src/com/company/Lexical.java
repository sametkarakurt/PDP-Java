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

    public int count(String value,String operators){
        int count = 0;
        Pattern pattern = Pattern.compile(operators);
        Matcher matcher = pattern.matcher(value);
        while (matcher.find())
            count++;
        return count;
    }
}