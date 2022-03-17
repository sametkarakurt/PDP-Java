package com.company;
import java.io.*;

public class FileRead {
    public void readFile (String fileName) throws IOException{

        int aritmeticCount = 0;
        int relationCount = 0;
        int logicalCount = 0;
        int unaryCount = 0;
        int binaryCount = 0;
        int haveTwoOperands = 0;
        int totalOperands;

        Lexical lexical = new Lexical();

        File file = new File(fileName);
        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while ((line=bReader.readLine()) != null){

                line = line.trim();
                if(line.isEmpty() || line.contains("/*")  || line.startsWith("*") || line.contains("*/") || line.contains("//") ){

                }else{
                    relationCount += lexical.count(line,lexical.relationalOperators);
                    logicalCount += lexical.count(line,lexical.logicalOperators);
                    aritmeticCount += lexical.count(line,lexical.arithmeticalOperators);
                    unaryCount += lexical.count(line,lexical.unaryOperators);
                    binaryCount += lexical.count(line,lexical.binaryOperators);
                    haveTwoOperands += lexical.count(line,lexical.totalOperand);
                }

        }
        totalOperands = (haveTwoOperands*2)+unaryCount;
        System.out.println("Operatör Bilgisi");
        System.out.println("    Tekli Operatör Sayısı: "+unaryCount);
        System.out.println("    İkili Operatör Sayısı: "+binaryCount);
        System.out.println("    Sayısal Operatör Sayısı: "+aritmeticCount);
        System.out.println("    İlişkisel Operatör Sayısı: "+relationCount);
        System.out.println("    Mantıksal Operatör Sayısı: "+logicalCount);
        System.out.println("Operand Bilgisi");
        System.out.println("    Toplam Operand Sayısı: "+(totalOperands));

    }
}
