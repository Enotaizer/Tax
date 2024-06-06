package com.amisitysu.gmail;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = 11100;


        double tax;
        if (income <= 10000) {
            tax = income * 0.025;

        } else if (income <= 25000) {
            tax = income * 0.043;

        } else {
            tax = income * 0.067;

        }
        System.out.println("Сума доходу: " + income);
        System.out.printf("Сума податку: %.2f", tax);

        scanner.close();

    }
}