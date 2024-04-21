package lesson09.homework09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialValue = scanner.nextDouble();
        double step = scanner.nextDouble();
        int amount = scanner.nextInt();

        double[] sequence =  new double[amount];
        sequence [0] =initialValue;
        for (int i = 0; i < amount - 1; i++){
            sequence [i + 1] = sequence [i] + step;
        }
        double sum = 0;
        for (int i= 0; i < sequence.length; i++){
        }
        System.out.println("Sum: " + sum);
    }
}
