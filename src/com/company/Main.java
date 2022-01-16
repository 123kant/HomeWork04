package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSizeArray();
        int [][] array  = createArray(size);
        System.out.println("Матрица рандомных чисел: ");
        printArray(array);
        int [][] backArray = changeArray(array);
        System.out.println("Матрица с измененными числами главной диагонали: ");
        printBackArray(backArray);
    }
    public static int inputSizeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int sizeArray = scanner.nextInt();
        return sizeArray;
    }
    public static int[][] createArray(int size) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нижний предел элементов матрицы: ");
        int boundA = scanner.nextInt();
        System.out.print("Введите верхний предел элементов матрицы: ");
        int boundB = scanner.nextInt();
        int [][] arrayRandom = new int[size][size];
        for (int i=0; i<arrayRandom.length; i++) {
            for (int j=0; j<arrayRandom[i].length; j++) {
                arrayRandom[i][j] = random.nextInt(boundA,boundB+1);
            }
        }
        return arrayRandom;
    }
    public static void printArray(int [][] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.printf("%3d",array[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] changeArray(int [][] array) {
        for (int i=0; i<array.length; i++) {

            int b = array[i][i];
            array[i][i] = array[i][array.length-i-1];
            array[i][array.length-i-1] = b;
            for (int j = 0; j < array[i].length; j++) {
            }
        }
        return array;
    }
    public static void printBackArray(int[][] backArray) {
        for (int i=0; i<backArray.length; i++) {
            for (int j=0; j<backArray[i].length; j++) {
                System.out.printf("%3d", backArray[i][j]);
            }
            System.out.println();
        }
    }
}
