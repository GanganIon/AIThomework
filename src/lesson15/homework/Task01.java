package lesson15.homework;

import java.util.Scanner;

public class Task01 {

    public static void printMenu(String[] currencies) {
        System.out.println("Alegeti valuta:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        System.out.println("0. Exit");
    }

    public static double readNumber(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double n;
        do {
            System.out.println(message);
            n = scanner.nextDouble();
        } while (n < min || n >max);
        return n;
    }

    public static double exchange(int initialCurrency, double amount, int targetCurrency ){
        double[] coefficients = {1, 1.06, 34.42};
        amount /= coefficients[initialCurrency - 1];
        amount *= coefficients[targetCurrency - 1];

        return amount;
    }

    public static void main(String[] args) {
        System.out.println(" Salut in CurrencyConverter!");
        String[] currencies = {"EURO", "USD", "TL"};
        while (true) {
            printMenu(currencies);
            int initialCurrency = (int) readNumber("",1, currencies.length);
            if (initialCurrency == 0) {
                return;
            }
            double amount = readNumber("Introduceti suma:" , 0, 10000000);
            int targetCurrency = (int) readNumber("Alegeti valuta dorita:",1, currencies.length);
            amount = exchange(initialCurrency, amount, targetCurrency );



            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);
        }
    }
}
