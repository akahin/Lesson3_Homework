package com.company;

import java.util.Locale;
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mortgage");
        int loanAmountGiven = scanner.nextInt();

        System.out.println("Please enter the term of the mortgage");
        int term = scanner.nextInt();

        System.out.println("Please enter the annual interest rate");
        double interestRate = scanner.nextDouble();

        // convert interest rate into decimal
        interestRate = interestRate/100;

        // monthly interest rate
        double monthlyInterestRate = interestRate / 12.0;

        // term in months
        int monthTerm = term * 12;

        double monthlyPayment = (loanAmountGiven * monthlyInterestRate) / ( 1 - Math.pow(1 + monthlyInterestRate, -monthTerm));
        String decimalValue = String.format(Locale.US, "%.2f", monthlyPayment);
        System.out.print("Your monthly interest rate is " + decimalValue);
//
    }
}
