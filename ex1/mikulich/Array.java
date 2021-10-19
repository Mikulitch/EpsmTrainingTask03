package by.epam.training.group34.task03.ex1.mikulich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static int nums[]= new int[10];
    private static ArrayList<Integer> simpleNum= new ArrayList<>();
    private static ArrayList<Integer> fibonacciNum= new ArrayList<>();
    private static ArrayList<Integer> uniqNumbers= new ArrayList<>();
    private static int userNumChoise;
    private static int minNumber, maxNumber;

    public Array() {
    }

    public Array(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(nums, array.nums);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(nums);
    }

    @Override
    public String toString() {
        return "Array{" +
                "nums=" + Arrays.toString(nums) +
                '}';
    }
    public static int[] addNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i< nums.length;i++) {
        nums[i] = scanner.nextInt();}
        return nums;
    }

    public static int userChoise() {
        Scanner scanner = new Scanner(System.in);
        userNumChoise = scanner.nextInt();
        return userNumChoise;
    }
    public static int[] BubbleSort(int[] nums) {
               boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = tmp;
                    needIteration = true;
                }
            }
        }
        return nums;
    }
    public static  int[] SelectionSort(int[] nums) {


        for (int left = 0; left < nums.length; left++) {
            int minInd = left;
            for (int i = left; i < nums.length; i++) {
                if (nums[i] < nums[minInd]) {
                    minInd = i;
                }
            }
            int tmp = nums[left];
            nums[left] = nums[minInd];
            nums[minInd] = tmp;
        }
     //   System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static int[] InsertionSort(int[] nums) {

        for (int left = 0; left < nums.length; left++) {
            int value = nums[left];
            int i = left - 1;
            for (; i >= 0; i--) {
               if (value < nums[i]) {
                    nums[i + 1] = nums[i];
                } else {
                 break;
                }
            }
           nums[i + 1] = value;
        }

        return nums;
    }
    public static int binarySearch(int[]nums, int userNumChoise) {
        int firstIndex=0;
        int lastIndex = nums.length-1;
        int result=0;
        while(firstIndex <= lastIndex) {
            result =-1;
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (nums[middleIndex] == userNumChoise) {
                result =middleIndex;
                break;
            }
            else if (nums[middleIndex] < userNumChoise)
                firstIndex = middleIndex + 1;
            else if (nums[middleIndex] > userNumChoise)
                lastIndex = middleIndex - 1;
        }
        return result;
    }
    public static int minSearch(int[] nums) {
        minNumber = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < minNumber) {
                minNumber = nums[i];
            }
           }
        return minNumber;
    }
    public static int maxSearch(int[] nums) {
        maxNumber = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
           }
        return maxNumber;
    }
    public static ArrayList<Integer> findSimpleNumbers(int[] nums) {
        int count;
        int z=0;
           for (int i =0;i <nums.length;i++) {
           {
                count = 0;
                int j = 1;

                while(j <= nums[i])
                {
                    if(nums[i] % j == 0)
                    {
                        count++;
                    }
                    j++;
                }
                if (count == 2)
                {
                   simpleNum.add(nums[i]);
                   z++;
                }
            }
        }
        return simpleNum;
    }

    public static boolean isFibonacci(int number) {
        return (Math.sqrt(Math.pow(number, 2) * 5 - 4)) % 1 == 0
                || (Math.sqrt(Math.pow(number, 2) * 5 + 4)) % 1 == 0;
    }
    public static  ArrayList<Integer> findFibonacciNumbers(int[] nums) {
        ArrayList<Integer> tmp = new ArrayList<>();

        for (int number : nums) {
            if (isFibonacci(number)) {
                fibonacciNum.add(number);
            }
        }
        return fibonacciNum;
    }

    public static ArrayList<Integer> findUniqNumbers (int[] nums) {
        int tmp1, tmp2, tmp3;
        for(int i = 0; i < nums.length; i++){
            tmp1 = nums[i]/1000;
            if(tmp1>0) {continue;}
            tmp1 = nums[i]/100;
            if(tmp1<1) {continue;}
            tmp2 = (nums[i]%100)/10;
            tmp3 = nums[i]%10;
            if (tmp1 != tmp2 && tmp1 != tmp3 && tmp2 != tmp3) {
               uniqNumbers.add(nums[i]);}
        }
         return uniqNumbers;
    }

}
