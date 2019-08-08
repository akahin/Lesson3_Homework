package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hi-Low!");

        System.out.println("What is your name");
      String userName =   scanner.nextLine();
        System.out.println("OK, " + userName + ", here are the rules:");

        System.out.println("Please enter a number to guess");
        int guessedNumber = scanner.nextInt();

        int counter = 0;
        do{
            if(guessedNumber < randomNumber){
                System.out.print("Too low");
                System.out.println("Please enter a number to guess");
                guessedNumber = scanner.nextInt();
                counter++;

            }else if(guessedNumber > randomNumber){
                System.out.println("Too high");
                System.out.println("Please enter a number to guess");
                guessedNumber = scanner.nextInt();
                counter++;
            }

        }while(guessedNumber != randomNumber);

        System.out.println("Congratulations, " + userName + "! You win!");
        System.out.print("It took you " + counter + " guesses to find my number!");



    }
}
