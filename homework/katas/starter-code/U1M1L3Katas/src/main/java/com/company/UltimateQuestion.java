package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int rangeInput;
        System.out.println("Please enter number between 1 and 100");
        rangeInput = myScanner.nextInt();
        boolean flag = true;

        while (flag) {
            if (rangeInput == 42) {
                System.out.print("That's the number I was looking for! 42 is definitely the answer!");
                flag = false;

            }else if(rangeInput >= 1 && rangeInput <= 100) {
                System.out.println("Enter a number between 1 and 100");
                myScanner.nextLine();
                rangeInput = myScanner.nextInt();
            }else{
                break;
            }
        }



        }
    }
