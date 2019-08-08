package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int enteredValue = scanner.nextInt();

            for (int i = 2; i <= enteredValue; i++) {
                for (int z = 2; z <= i; z++) {
                    if (z == i) {
                        System.out.print("Prime number \n " + i);
                    }

                    if (i % z == 0) {
                        break;
                    }
                }

            }

        }catch(InputMismatchException e) {
            System.out.print("Please enter an number");


        }

    }
}
