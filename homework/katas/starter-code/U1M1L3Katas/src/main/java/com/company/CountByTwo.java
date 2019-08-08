package com.company;

import java.util.Scanner;

public class CountByTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int userInput = scan.nextInt();

        for (int i = 0; i <= userInput; i+=2) {
            System.out.println(i);
        }

    }
}
