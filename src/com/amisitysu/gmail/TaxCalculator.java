package com.amisitysu.gmail;

public class TaxCalculator {
    public static void main(String[] args) {
        double income = 11000; // Ваш дохід

        double tax;
        if (income <= 10000) {
            tax = income * 0.025;

        } else if (income <= 25000) {
            tax = (income - 10000) * 0.043; // Податок для другого діапазону

        } else {
            tax = (income - 25000) * 0.067; // Податок для третього діапазону

        }
        System.out.println("Сума податку: " + tax);
        System.out.println("Сума доходу: " + income);

    }
}