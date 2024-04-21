package lesson07.classwork;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        /*
        A 100 - 90
        B 90 - 75
        C 75 - 60
        D 60 - 30
        F 30-0
         */
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if ( mark < 30){
            System.out.println("F");
        }else if (mark <60){
            System.out.println("D");
        } else if (mark <75 ){
            System.out.println("C");
        } else if (mark < 90) {
            System.out.println("B");
        } else if (mark <100) {
            System.out.println("A");
        }
    }
}
