package lesson12.claswork;

import java.util.Scanner;

public class Main05 {
    /*
    de verificat daca numarul e simplu.
    nr.simplu sunt care se impart le el singur si la 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long start = System.nanoTime();
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;

            }
        }
        long finish = System.nanoTime();
        System.out.println("Time took: " + (finish - start) + "ns");
        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }}
