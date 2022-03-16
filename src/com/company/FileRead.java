package com.company;
import java.io.*;


public class FileRead {
    public void readFile (String fileName) throws IOException{

        int aritmeticCount = 0;
        int relationCount = 0;
        int logicalCount = 0;
        int unaryCount = 0;
        int binaryCount = 0;
        Lexical lexical = new Lexical();

        File file = new File(fileName);

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);


        while ((line=bReader.readLine()) != null){

                relationCount += lexical.isRelationalOperators(line);
                logicalCount += lexical.isLogicalOperators(line);
                aritmeticCount += lexical.isAritmetical(line);
                unaryCount += lexical.isUnary(line);
                binaryCount += lexical.isBinary(line);

        }
        System.out.println("Tekli Operatör Sayısı: "+unaryCount);
        System.out.println("İkili Operatör Sayısı: "+binaryCount);
        System.out.println("İlişkisel Operatör Sayısı: "+relationCount);
        System.out.println("Mantıksal Operatör Sayısı: "+logicalCount);
        System.out.println("Sayısal Operatör Sayısı: "+aritmeticCount);


    }
}
