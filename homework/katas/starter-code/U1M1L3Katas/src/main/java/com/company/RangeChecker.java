package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String rangeInput;
        int rangeInt;

        do {

            System.out.println("Enter a number between 15 and 32");
            rangeInput = myScanner.nextLine();
            rangeInt = Integer.parseInt(rangeInput);

        } while (rangeInt < 16 || rangeInt > 33);
          System.out.println(rangeInt);

    }
}
