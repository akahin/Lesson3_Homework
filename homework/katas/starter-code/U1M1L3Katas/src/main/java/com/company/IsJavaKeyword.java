package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {

        Scanner mySanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String userInput = mySanner.nextLine();



        String[] reservedWords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch",
                "char", "class", "const", "default", "do", "double", "else", "enum", "extends",
                "false", "final", "finally", "float", "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private",
                "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
                "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while", "continue"};

        for(int i=0; i < reservedWords.length; i++){
            if (userInput.equals(reservedWords[i])){
            System.out.println("is a java keyword");
            }else{
                System.out.print("not a java keyword");
            }
        }

    }

}



