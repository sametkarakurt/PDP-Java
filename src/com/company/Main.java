package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Lexical lexical = new Lexical();

        int countArithmeticOperators = 0;

        //Read file
	    File file = new File("*.java");

        FileReader fReader = new FileReader(file);
        String line;

        BufferedReader bReader = new BufferedReader(fReader);
        String z = "";
        String p = "";
        while ((line=bReader.readLine()) != null){

            if(line.contains("/*") || line.contains("*/") || line.contains("//")){

            }else{
                z+=line;
            }


        }

        String [] arr = z.split(" ");

        for (String k : arr) {

            p += k;
        }


        lexical.isRelationalOperators(p);
        lexical.isLogicalOperators(p);
        lexical.isAritmetical(p);
        lexical.isUnary(p);

    }
}
