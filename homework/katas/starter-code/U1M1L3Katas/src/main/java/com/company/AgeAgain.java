package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        int userAge =0 ;
        String userInput= " ";

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age");
        userAge = scan.nextInt();
        if( userAge < 14){
            System.out.println("What grade are you in");
            scan.nextLine();
            userInput = scan.nextLine();
            System.out.println("Wow! "+ userInput + " grade - that sounds exciting!");

        }else if (userAge >= 14 && userAge <= 18) {
            System.out.println("are you planning to go to college");
            scan.nextLine();
            userInput = scan.nextLine();
            if (userInput.toLowerCase().equals("yes")){
                System.out.println("what college ");
                userInput = scan.nextLine();
                System.out.println(userInput + " is a great school!");
            } else if (userInput.toLowerCase().equals("no")) {
                System.out.print("What do you want to do after high school ");
                userInput = scan.nextLine();
                System.out.print("Wow, " + userInput + " sounds like a plan!");
            }

        }else if(userAge > 18){
            System.out.println("what is your job");
            scan.nextLine();
            userInput = scan.nextLine();
            System.out.println("\"" + userInput + " sounds like a great job!\"");
        }


        }
}
