package com.company;

import java.util.Scanner;

public class YourAgeCan {
    //int age = 0;
    public static void main(String[] args) {
        Scanner ageScan = new Scanner(System.in);
        System.out.println("what is your age");
        int age = ageScan.nextInt();


        if (age >= 18 && age < 21 ){
        System.out.println(" you can vote");
    }
    else if (age >= 21 && age < 35 ) {
        System.out.println("can drink alcohol");
    }
    else if(age >= 35 && age < 55 ) {
        System.out.println(" you can be president");
    }
    else if(age >= 55 && age < 65 ) {
        System.out.println("your are eligible for aarp");
    }
    else if(age >= 65 && age < 80 ){
        System.out.println("you can retire");
    }
    else if(age >= 80 && age < 90) {
        System.out.println("you are an octogenarian");
    }

    else if(age > 100) {
        System.out.println("you are more than a century old");
        }
    }

    }

