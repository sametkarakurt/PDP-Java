package com.company;

public class Lexical {
    String [] singleOperators = {"-","+","++","--","!"};

    String [] dualOperators = {"--","++"};

    String [] relationalOperators = {"==","!=",">","<",">=","<="};

    String [] logicalOperators = {"&&","||","!"};

    String [] arithmeticOperators = {"+","-","*","/","%","++","--"};

    

    String[] allOperators = {"singleOperators","dualOperators","relationalOperators","logicalOperators","arithmeticOperators"};

    public void isRelationalOperators(String value){
        int count = 0;

        for (String x : relationalOperators) {
            String z = value;
            while (z.contains(x)){
                count++;
                z = z.substring(z.indexOf(x)+2,z.length());

            }
        }

        System.out.println("İlişkisel Operatör Sayısı: "+count);

    }
    public void isLogicalOperators(String value) {
        int count = 0;

        for (String x : logicalOperators) {
            String z = value;



            while (z.contains(x)) {
                if (z.charAt(z.indexOf(x) + 1) != '=') {
                    count++;
                }
                z = z.substring(z.indexOf(x) + 2, z.length());

            }


        }

        System.out.println("Mantıksal Operatör Sayısı: "+count);
    }

    public void isAritmetical(String value) {
        int count = 0;

        for (String x : arithmeticOperators) {
            String z = value;


            while (z.contains(x)) {
                if(x == "+" || x== "-"){
                    if (z.charAt(z.indexOf(x) + 1) == '+' || z.charAt(z.indexOf(x) + 1) == '-') {
                        z = z.substring(z.indexOf(x) + 2, z.length());
                    }else{
                        z = z.substring(z.indexOf(x) + x.length(), z.length());
                        count++;
                    }
                }else{

                    z = z.substring(z.indexOf(x) + x.length(), z.length());
                    count++;
                }

            }



        }

        System.out.println("Sayısal Operatör Sayısı: "+count);
    }

    public void isUnary(String value) {
        int count = 0;

        for (String x : singleOperators) {
            String z = value;


            while (z.contains(x)) {
                if(x == "+" || x== "-"){
                    if (z.charAt(z.indexOf(x) + 1) == '+' || z.charAt(z.indexOf(x) + 1) == '-') {
                        z = z.substring(z.indexOf(x) + 2, z.length());
                    }else{
                        z = z.substring(z.indexOf(x) + x.length(), z.length());
                        count++;
                    }
                }else{
                    if (z.charAt(z.indexOf(x) + 1) != '=') {
                        count++;
                    }
                    z = z.substring(z.indexOf(x) + x.length(), z.length());
                }

            }



        }

        System.out.println("Tekli Operatör Sayısı: "+count);
    }


}


