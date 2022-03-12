package com.company;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        //create lexical object
        Lexical lexical = new Lexical();

        FileRead fileRead = new FileRead();

        String text = fileRead.readFile("*.java");

        lexical.countOfOperators(text);

    }
}
