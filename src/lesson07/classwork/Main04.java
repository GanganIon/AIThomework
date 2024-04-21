package lesson07.classwork;

import java.util.Scanner;
/*
Identificati pot trei numere introduse sa creeze un triunghi
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( a+b>c && b+c>a && c+a>b){
            System.out.println("This is a triangle !");
        } else {
            System.out.println("This is not a triangle !");
        }
    }
}
