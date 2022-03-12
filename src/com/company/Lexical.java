package com.company;

public class Lexical {

    //All operators

    String [] relationalOperators = {"==","!=",">","<",">=","<="};

    String [] logicalOperators = {"&&","||","!"};

    String [] arithmeticOperators = {"+","-","*","/","%","++","--","&","|","^","+=","-=","/=","/=","*=","%=","&=","|=","!="};

    String [] allOperators = {"+","-","*","/","%","++","--","&","|","^","+=","-=","/=","/=","*=","%=","&=","|=","!=","&&","||","!","==","!=",">","<",">=","<="};


    private void isRelationalOperators(String value){
        int count = 0;

        for (String operator : relationalOperators) {
            String copyText = value;
            while (copyText.contains(operator)){
                count++;
                copyText = copyText.substring(copyText.indexOf(operator)+2,copyText.length());

            }
        }

        System.out.println("İlişkisel Operatör Sayısı: "+count);

    }
    private void isLogicalOperators(String value) {
        int count = 0;

        for (String operator : logicalOperators) {
            String copyText = value;

            while (copyText.contains(operator)) {
                if (copyText.charAt(copyText.indexOf(operator) + 1) != '=') {
                    count++;
                }
                copyText = copyText.substring(copyText.indexOf(operator) + 2, copyText.length());
            }
        }
        System.out.println("Mantıksal Operatör Sayısı: "+count);
    }

    private void isAritmetical(String value) {
        int count = 0;

        for (String operator : arithmeticOperators) {
            String copyText = value;


            while (copyText.contains(operator)) {

                if(operator == "+" || operator== "-" || operator=="*" || operator=="%" || operator=="|" || operator=="^" || operator=="&" || operator=="/" || operator=="="){
                    if (copyText.charAt(copyText.indexOf(operator) + 1) == '+' || copyText.charAt(copyText.indexOf(operator) + 1) == '-' || copyText.charAt(copyText.indexOf(operator) + 1) == '=' || copyText.charAt(copyText.indexOf(operator) + 1) == '&' || copyText.charAt(copyText.indexOf(operator) + 1) == '|' || copyText.charAt(copyText.indexOf(operator) + -1) == '!') {
                        copyText = copyText.substring(copyText.indexOf(operator) + 2, copyText.length());
                    }else{
                        copyText = copyText.substring(copyText.indexOf(operator) + operator.length(), copyText.length());
                        count++;
                    }
                }else{

                    copyText = copyText.substring(copyText.indexOf(operator) + operator.length(), copyText.length());
                    count++;
                }

            }

        }

        System.out.println("Sayısal Operatör Sayısı: "+count);
    }


    public void countOfOperators(String text){
        isAritmetical(text);
        isRelationalOperators(text);
        isLogicalOperators(text);
    }


}


