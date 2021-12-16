/**
 * Java 1. Homework #3
 *
 * @author Nazarenko Nadezhda
 * @version 14.12.2021
 */
package homework3;

import java.util.Arrays;

public class HomeWork3 {
    // 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] ar0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив " + Arrays.toString(ar0));
        invertArray(ar0);
        System.out.println("Новый массив " + Arrays.toString(ar0));

        //2 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
        // его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] ar = new int[100];
        System.out.println(Arrays.toString(ar));
        fillArray(ar);

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход
        // массив и умножающий числа меньше 6 на 2;
        int[] ar1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив " + Arrays.toString(ar1));
        changeArray(ar1);
        System.out.println("Новый массив  " + Arrays.toString(ar1));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];


        //6 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        int[] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Одномерный массив " + Arrays.toString(ar2));
        System.out.println("Минимальный элемент: " + searchMin(ar2));
        System.out.println("Максимальный элемент: " + searchMax(ar2));
    }

 /*   public static void fillDiagonal(int[][] arr) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i = j) {System.out.print(arr[i][j] = 0);
                }

                else{
                    System.out.print(arr[i][j] = 0);
                }
            }
           //     if i != j System.out.print(("vfccbd"" + arr[i][j] = 1); }
            }
    }
    /*
  */

    public static int searchMax(int[] ar2) {
        int max = ar2[0];
        for (int oneElementOfThisArray : ar2)
            if (oneElementOfThisArray > max)
                max = oneElementOfThisArray;
        return max;

    }

    public static int searchMin(int[] ar2) {
        int min = ar2[0];
        for (int oneElementOfThisArray : ar2)
            if (oneElementOfThisArray < min)
                min = oneElementOfThisArray;
        return min;

    }

    public static void changeArray(int[] ar1) {
        for (int i = 0; i < ar1.length; i++)
            if (ar1[i] < 6)
                ar1[i] *= 2;
    }

    public static void fillArray(int[] ar) {
        int j = 1;
        for (int i = 0; i < ar.length; i++, j = j + 1) {
            ar[i] = j;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void invertArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
    }

}
