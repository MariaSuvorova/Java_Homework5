/*Реализовать алгоритм пирамидальной сортировки (HeapSort). */
package Homework5;

import java.util.Random;

public class Task3 {
    public static void sort(int array[]) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapTree(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapTree(array, i, 0);
        }
      }
    
    public static void heapTree(int array[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
    
        if (left < n && array[left] > array[largest])
            largest = left;
        if (right < n && array[right] > array[largest])
            largest = right;
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapTree(array, n, largest);
        }
      }
    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
        System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Random random = new Random();
        int numbers [] = new int[random.nextInt(10,20)];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        printArray(numbers);
        sort(numbers);
        printArray(numbers);
    }
}
