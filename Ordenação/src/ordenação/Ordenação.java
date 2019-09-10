/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

/**
 *
 * @author Henrique Ricordi
 */
public class Ordenação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }
        bubbleSort(v, v.length);
        for (int j = 0; j < 10; j++) {
            System.out.println(v[j]);
        }        
    }

    public static void swap(int a, int b){ 
        int temp = a;
        a = b;
        b = temp;
    }

    public static void bubbleSort(int v[], int n) {
        if (n < 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (v[i] > v[i+1]) {
                swap(v[i], v[i+1]);
            }
        }
        bubbleSort(v, n-1);
    }

    public static void selectionSort() {

    }

    public static void insertionSort() {

    }

    public static void quickSort() {

    }

    public static void shellSort() {

    }

    public static void combSort() {

    }

    public static void mergeSort() {

    }

    public static void heapSort() {

    }

    public static void radixSort() {

    }

    public static void gnomeSort() {

    }

    public static void countingSort() {

    }

    public static void bucketSort() {

    }

    public static void cocktailSort() {

    }

    public static void timSort() {

    }
}
