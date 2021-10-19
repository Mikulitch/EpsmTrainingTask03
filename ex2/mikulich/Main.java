package by.epam.training.group34.task03.ex2.mikulich;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][]  jugArray = { {12,43,56,76},
                            {45,23,142},
                            {3,67,342,12},
                            {12,56}
                            };

        //1
        JuggedArray.sortElementsSum(jugArray);
        JuggedArray.printArray(jugArray);
        JuggedArray.sortByMin(jugArray);
        JuggedArray.printArray(jugArray);
        JuggedArray.sortByMax(jugArray);
        JuggedArray.printArray(jugArray);
        JuggedArray.sortBySum(jugArray);
        JuggedArray.printArray(jugArray);
    }
}
