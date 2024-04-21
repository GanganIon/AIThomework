package lesson12.claswork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];
        int [] listTime = new int [10];

        int amount = 0;
        for (int i = 0; i < list.length; i++) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("end")){
                break;
            }
            listTime[i] = scanner.nextInt();
            scanner.nextLine();
            list[i] = item;
            amount++;
        }
        int totalTime = 0;
        for (int i =0; i < amount; i++) {
            totalTime += listTime[i];
        }
        System.out.println("Timpul comun: " + totalTime);

        for (int i = 0; i < amount; i++) {
            System.out.println((i +1 ) + ". " + list[i] + "(" + listTime[i] + "min.)");
        }
        int maxIndex = 0;
        for (int i = 0; i< amount; i++) {
            if (listTime[maxIndex] < listTime[i]) {
                maxIndex =i;
            }
        }
        System.out.println("Cel mai mult timp este acordat: " + list[maxIndex]);
    }
}
