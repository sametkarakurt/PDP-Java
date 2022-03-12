package com.company;
import java.io.*;


public class FileRead {
    public String readFile (String fileName) throws IOException{
        File file = new File(fileName);

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        String textWithoutCommentLine = "";
        String textWithoutSpace = "";

        while ((line=bReader.readLine()) != null){
            line = line.trim();
            if(line.isEmpty() || line.contains("/*")  || line.charAt(0) == '*'|| line.contains("*/") || line.contains("//") ){
                //pass
            }else{
                textWithoutCommentLine+=line;
                System.out.println(textWithoutCommentLine);
            }


        }


        String [] arrayOfText = textWithoutCommentLine.split(" ");

        //Adding each line to variable without space.
        for (String item : arrayOfText) {
            textWithoutSpace += item;
        }
        return textWithoutSpace;
    }
}
