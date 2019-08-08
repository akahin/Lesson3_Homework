package com.company;

import java.util.Scanner;

public class FavoriteProgrammingLanguage {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("What is your Favorate programming language");
             name = reader.nextLine();
             if(name.equals("Java")){
                break;
            }
        }
        while (!name.isEmpty());
           System.out.println("That's what I was looking for! Java is definitely the answer!");

        }
    }
