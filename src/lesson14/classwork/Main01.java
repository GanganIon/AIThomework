package lesson14.classwork;

import java.util.Random;

public class Main01 {
    /*
    de tiparit masivul array in consola peste loc liber (space ) in linie
     */
    public static void printArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
/*
de alcatuit cod care creaza masivul marimii size si il
umple cu cifre intimplatoare de la min la max.
de intors acest masiv ca rezultat(return array)
 */
    public static int[] generateRandoArray(int min, int max, int size) {
        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }
/*
de deskis masivul array in ordine inversa
 */
    public static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            array [i] = reversedArray[i];
        }
        }

        public static void main(String[] args) {
        // de creat masiv din 10 numere intimplatoere de la 1 la 100
            int[] array  = generateRandoArray(1, 100, 10);
            // de afisat acest masiv
            printArray(array);
            // de intors invers acest masiv
            reverseArray(array);
            // de afisat inca o data acest masiv
            printArray(array);

        }
    }
