package lesson04.homework04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income");
        int income = scanner.nextInt();
        float socialTax = income * 0.03f;
        float incomeTax = income * 0.15f;

        System.out.println("Pension fund tax:" + socialTax);
        System.out.println("Income tax:" + incomeTax);
        System.out.println("Total profit:" + (income - incomeTax - socialTax));

    }
}
