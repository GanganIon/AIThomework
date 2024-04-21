package lesson12.claswork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    /*
    de ghicit numarul de la 1 la 10
    Programa alege nr., iar utilizatorul trebuie sa ghiceasca
    daca e ghicit nr. programa felicita cu kistigul
    daca nu , programa spune e mai mare sau mic
    de numarat de kite ori au fost nevoie de ghicit
     */
    public static void main(String[] args) {
        Random random =new Random();
        // de la 1 la 10
        int min = 1;
        int max = 10;
        int number = min + random.nextInt(max-min + 1);

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Guess the number between 1 and 10");
        while (true) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess == number){
                System.out.println("This is correct!");
                System.out.println("Attempts: " + attempts);
                break;
            } else if (guess > number) {
                System.out.println("Too large number! Try again:");
            }else {
                System.out.println("Too small number! Try again:");
            }
        }
    }



}
