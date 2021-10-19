package by.epam.training.group34.task03.ex1.mikulich;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers;
        ArrayList<Integer> simpleNumbers ;
        ArrayList<Integer> fibonacciNumbers ;
        ArrayList<Integer> uniqNumbers ;
        int userChoiceNumber;
        int searchIndex;
        int minElement, maxElement;
        System.out.println("Введите 10 чисел для заполнения массива");
        numbers=Array.addNumbers();
  /*      System.out.println(" Выберите какое действие над массивом необходимо выполнить" +
                "1. Сортировка массива" +
                "2. Осуществить поиск элемента" +
                "3. Найти максимальны и минимальный элемент" +
                "4. Получить все простые числа в массиве" +
                "5. Получить все числа Фибоначи" +
                "6. Получить все трехзначные числа, в десятичной записи которых нет одинаковых цифр" +
                "7. Заполнение элементов массива и с консоли, и с файла и с помощью генерации случайных цифр");
   */
        System.out.println("Теперь отсортируем массив. Выберите способ сортировки.");
        System.out.println("1: Пузырьковая, 2: Сортировка выбором, 3: Сортировка вставками");
        userChoiceNumber = Array.userChoise();
        switch (userChoiceNumber) {
            case 1: Array.BubbleSort(numbers);
            break;
            case 2: Array.SelectionSort(numbers);
            break;
            case 3: Array.InsertionSort(numbers);
           break;
            default:
                System.out.println("Выбор не верен");
        }
        System.out.println("Поиск элемента в массиве. Введите целое число: ");
        userChoiceNumber = Array.userChoise();
        searchIndex=Array.binarySearch(numbers, userChoiceNumber);
        if (searchIndex ==-1) {
            System.out.println("В масcиве не обнаружено такое число");
        }
        else System.out.println("Число "+userChoiceNumber + " найдено под индексом " +searchIndex);

        System.out.println("Поиск Максимального и минимального числа");
        minElement=Array.minSearch(numbers);
        maxElement=Array.maxSearch(numbers);
        System.out.println("Минимальный элемент массива :"+ minElement);
        System.out.println("Максимальный элемент массива :"+ maxElement);
        System.out.println("Найдем все простые числа в массиве");
        simpleNumbers=Array.findSimpleNumbers(numbers);
        System.out.println(simpleNumbers);
        System.out.println("Найдем все числа Фибоначи");
        fibonacciNumbers = Array.findFibonacciNumbers(numbers);
        System.out.println(fibonacciNumbers);
        System.out.println("Найдем Трехзначные числа,в десятичной записи которых нет одинаковых цифр");
        uniqNumbers = Array.findUniqNumbers(numbers);
        System.out.println((uniqNumbers));

    }

}
