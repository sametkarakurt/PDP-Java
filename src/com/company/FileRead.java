package com.company;
import java.io.*;

public class FileRead {
    public void readFile (String fileName) throws IOException{

        int aritmeticCount = 0, relationCount = 0, logicalCount = 0, unaryCount = 0, binaryCount = 0,haveTwoOperands = 0, totalOperands = 0;
        int exclamationCount = 0;

        Lexical lexical = new Lexical();

        File file = new File(fileName);
        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        boolean haveCommentLine = false;


        while ((line=bReader.readLine()) != null){

                boolean commentLineFirst = false;

                line = line.trim();
                if(line.contains("//")){
                    line = line.substring(0,line.indexOf("//"));
                }
                while(line.contains("/*") && line.contains("*/")){
                String linePart1 = line.substring(0,line.indexOf("/*"));
                String linePart2 = line.substring(line.indexOf("*/")+2,line.length());
                line = linePart1 + linePart2;

                }
                if(line.contains("/*")){
                    String linePart1 = line.substring(0,line.indexOf("/*"));
                    line = linePart1;
                    commentLineFirst = true;

                }else if(line.contains("*/")){
                    haveCommentLine = false;
                    String linePart2 = line.substring(line.indexOf("*/")+2,line.length());
                    line = linePart2;
                }

                if(line.isEmpty() ){
                    continue;
                }
                if(!haveCommentLine) {
                    haveCommentLine = commentLineFirst;
                    relationCount += lexical.count(line,lexical.relationalOperators);
                    logicalCount += lexical.count(line,lexical.logicalOperators);
                    aritmeticCount += lexical.count(line,lexical.arithmeticalOperators);
                    unaryCount += lexical.count(line,lexical.unaryOperators);
                    binaryCount += lexical.count(line,lexical.binaryOperators);
                    haveTwoOperands += lexical.count(line,lexical.totalOperand);
                    exclamationCount += lexical.count(line,lexical.exclamationOperator);
                }
        }

        totalOperands = (haveTwoOperands*2)+unaryCount+exclamationCount;
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