package by.epam.training.group34.task03.ex2.mikulich;

import java.util.ArrayList;

public class JuggedArray {
    public static int[][] sortElementsSum(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] a : array) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    public static int[][] swap(int[][] array, int str1, int str2) {
        int[] temp = array[str1];
        array[str1] = array[str2];
        array[str2] = temp;
        return array;
    }

    public static int[][] sortByMax(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int maxStr1 = array[i][array[i].length - 1];
                int maxStr2 = array[i + 1][array[i + 1].length - 1];
                if ((maxStr1 > maxStr2)) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static int[][] sortByMin(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int minStr1 = array[i][0];
                int minStr2 = array[i + 1][0];
                if ((minStr2 < minStr1)) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static int[][] sortBySum(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            int sumStr1 = 0;
            int sumStr2 = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int k = 0; k < array[i].length; k++) {
                    sumStr1 += array[i][k];
                    sumStr2 += array[i + 1][k];
                }
                if ((sumStr1 < sumStr2)) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

}
