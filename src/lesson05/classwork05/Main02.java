package lesson05.classwork05;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are too young! Return later when you are over 13");
        } else {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();

            System.out.println("Successfully registered user");
            System.out.println("Lpgin:" + login );
            System.out.println("Pasword:" + password);
        }
    }
}
