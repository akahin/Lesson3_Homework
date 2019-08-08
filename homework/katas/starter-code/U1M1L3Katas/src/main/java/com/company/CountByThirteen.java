package com.company;
import java.util.Scanner;
public class CountByThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = myScanner.nextInt();
        for(int i=0; i <=userInput; i += 13){
            System.out.println(i);
        }

    }
}