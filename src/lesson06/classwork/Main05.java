package lesson06.classwork;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();

        if ((int)num == num){
            System.out.println("Whole");
        } else {
            System.out.println("Fractional");
        }
    }
}
