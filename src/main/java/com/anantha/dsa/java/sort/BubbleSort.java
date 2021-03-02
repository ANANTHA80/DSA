package com.anantha.dsa.java.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        step1_Swap_Two_Elements_of_Array();
        step2_Swap_Two_Elements_Conditionally();
        step3_Swap_Two_Elements_Conditionally_Whole_Array();
        step4_Swap_Two_Elements_Conditionally_Whole_Array_Twice_AKA_Bubble_Sort();
        step5_Bubble_Sort_Optimization_1_Omit_Checking_Last_Element();
        step6_Bubble_Sort_Optimization_2_NO_Swaps_Array_Alredy_Sorted();
    }

    // Utility to print start and end of method.
    public static void printStartEnd(String methodName, boolean end) {
        if (!end) {
            System.out.println("-".repeat(100));
            System.out.println("BEGIN: " + methodName);
            System.out.println("-".repeat(100));
        }

        if (end) {
            System.out.println("-".repeat(100));
            System.out.println("END: " + methodName);
            System.out.println("-".repeat(100));
            System.out.println("<==>".repeat(25));
            System.out.println();
        }
    }

    //Utility to Print the Array
    public static void printArray(int[] arr, String text) {
        System.out.printf("%30s ", text);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Swap Two Elements of an Array
     */
    public static void step1_Swap_Two_Elements_of_Array() {
        printStartEnd("step1_Swap_Two_Elements_of_Array", false);
        int[] arr = new int[]{2, 4};
        printArray(arr, "Before:");
        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
        printArray(arr, "After:");
        printStartEnd("step1_Swap_Two_Elements_of_Array", true);
    }

    /**
     * Swap two consecutive elements in an array if left element is greater than last element.
     */
    public static void step2_Swap_Two_Elements_Conditionally() {
        printStartEnd("step2_Swap_Two_Elements_Conditionally", false);
        int[] arr = new int[]{4, 2};
        printArray(arr, "Before:");
        if (arr[0] > arr[1]) {
            int temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        printArray(arr, "After:");
        printStartEnd("step2_Swap_Two_Elements_Conditionally", true);
    }

    /**
     * Swap two consecutive elements in an array if left element is greater than last element.
     * Repeat for the whole Array.
     * NOTE: Largest element of the array gets placed a last element of the array.
     */
    public static void step3_Swap_Two_Elements_Conditionally_Whole_Array() {
        printStartEnd("step3_Swap_Two_Elements_Conditionally_Whole_Array", false);
        int[] arr = new int[]{2, 4, 9, 8, 7, 6};
        printArray(arr, "Before:");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        printArray(arr, "After:");
        printStartEnd("step3_Swap_Two_Elements_Conditionally_Whole_Array", true);
    }


    /**
     * Swap two consecutive elements in an array if left element is greater than last element.
     * Repeat for the whole Array.
     * Repeat the process twice for an array
     */
    public static void step4_Swap_Two_Elements_Conditionally_Whole_Array_Twice_AKA_Bubble_Sort() {
        printStartEnd("step4_Swap_Two_Elements_Conditionally_Whole_Array_Twice_AKA_Bubble_Sort", false);
        int[] arr = new int[]{2, 4, 9, 8, 7, 6};
        printArray(arr, "Before:");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        printArray(arr, "After:");
        printStartEnd("step4_Swap_Two_Elements_Conditionally_Whole_Array_Twice_AKA_Bubble_Sort", true);
    }

    /**
     * Swap two consecutive elements in an array if left element is greater than last element.
     * Repeat for the whole Array.
     * Repeat the process twice for an array
     * Note: Optimization. No Need to check last element of the array as highest element is places at the last.
     */
    public static void step5_Bubble_Sort_Optimization_1_Omit_Checking_Last_Element() {
        printStartEnd("step5_Bubble_Sort_Optimization_1_Omit_Checking_Last_Element", false);
        int[] arr = new int[]{2, 4, 9, 8, 7, 6};
        printArray(arr, "Before:");

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            printArray(arr, "Iteration: " + j);
        }

        printArray(arr, "After:");
        printStartEnd("step5_Bubble_Sort_Optimization_1_Omit_Checking_Last_Element", true);
    }

    /**
     * Swap two consecutive elements in an array if left element is greater than last element.
     * Repeat for the whole Array.
     * Repeat the process twice for an array
     * Note: Optimization. If there are no Swaps Elements are already Sorted.
     */
    public static void step6_Bubble_Sort_Optimization_2_NO_Swaps_Array_Alredy_Sorted() {
        printStartEnd("step6_Bubble_Sort_Optimization_2_NO_Swaps_Array_Alredy_Sorted", false);
        int[] arr = new int[]{2, 4, 9, 8, 7, 6};
        printArray(arr, "Before:");
        for (int j = 0; j < arr.length; j++) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                printArray(arr, "Loop Break at Iteration: " + j);
                break;
            }
        }
        printArray(arr, "After:");
        printStartEnd("step6_Bubble_Sort_Optimization_2_NO_Swaps_Array_Alredy_Sorted", true);
    }
}
