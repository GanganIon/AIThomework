package lesson13.homework;

import java.util.Scanner;

public class Task03 {

    public static  int readNumber(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float toMeters(int cm){
        return cm/ 100f;
    }

    public static float calculateBMI(float height, int weight) {
        return (float) (weight / Math.pow(height, 2));
    }

    public static void printResult(float bmi) {
        System.out.println("BMI: " + bmi + ", you are ");

        if (bmi < 15) {
            System.out.println("anorexic");
        } else if (bmi < 20) {
            System.out.println("uderweight");
        } else if (bmi < 20) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }

    public static void main(String[] args) {
        int weight = readNumber("Enter your weight in kg");
        float height = toMeters(readNumber("Enter your height in cm"));

        float bmi = calculateBMI(height, weight);
        printResult(bmi);
    }
}
