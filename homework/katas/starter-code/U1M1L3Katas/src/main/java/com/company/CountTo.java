package com.company;
import java.util.Scanner;
public class CountTo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("please enter a number");
        int userInput = myScan.nextInt();

        for (int i = 0; i <= userInput; i++){
            System.out.println(i);
        }

    }
}
