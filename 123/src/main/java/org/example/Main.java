package org.example;

import java.util.Random;

class nptv23task5 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                new int[3], new int[4], new int[5], new int[7], new int[8], new int[9]
        };

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51)+50;
            }
        }

        System.out.println("Неотсортированный массив: ");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if (array[i][j] < array[k][l]) {
                            int temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }
}