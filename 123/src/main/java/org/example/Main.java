package org.example; // Определяет пакет, в котором находится данный класс.

import java.util.Random; // Импортируем класс Random для генерации случайных чисел.

class nptv23task5 { // Объявление класса nptv23task5
    public static void main(String[] args) { // Главный метод, точка входа в программу
        // Создаём рваный двумерный массив, где каждая строка имеет разную длину
        int[][] array = new int[][]{
                new int[3], new int[4], new int[5], new int[7], new int[8], new int[9]
        };

        Random random = new Random(); // Создаём объект Random для генерации случайных чисел

        // Заполняем массив случайными числами от 50 до 100
        for (int i = 0; i < array.length; i++) { // Проходим по строкам массива
            for (int j = 0; j < array[i].length; j++) { // Проходим по элементам строки
                array[i][j] = random.nextInt(51) + 50; // Генерируем случайное число от 50 до 100
            }
        }

        // Выводим неотсортированный массив
        System.out.println("Неотсортированный массив: ");
        for (int[] ints : array) { // Перебираем строки массива
            for (int anInt : ints) { // Перебираем элементы внутри строки
                System.out.printf("%4d", anInt); // Выводим число с отступом в 4 символа
            }
            System.out.println(); // Переход на новую строку
        }

        // Сортируем весь массив по убыванию (очень неэффективный метод)
        for (int i = 0; i < array.length; i++) { // Перебираем строки
            for (int j = 0; j < array[i].length; j++) { // Перебираем элементы строки
                for (int k = 0; k < array.length; k++) { // Перебираем все строки заново
                    for (int l = 0; l < array[k].length; l++) { // Перебираем все элементы заново
                        if (array[i][j] < array[k][l]) { // Если текущий элемент меньше другого
                            int temp = array[i][j]; // Меняем местами элементы
                            array[i][j] = array[k][l];
                            array[k][l] = temp;
                        }
                    }
                }
            }
        }

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив: ");
        for (int[] ints : array) { // Перебираем строки массива
            for (int anInt : ints) { // Перебираем элементы строки
                System.out.printf("%4d", anInt); // Выводим число с отступом
            }
            System.out.println(); // Переход на новую строку
        }
    }
}
