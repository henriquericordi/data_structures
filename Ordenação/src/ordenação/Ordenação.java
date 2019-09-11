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
        
        System.out.print("Antes: \n");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        
        bubbleSort(v, v.length);
        
        System.out.println();
        System.out.print("Depois: \n");
        for (int j = 0; j < 10; j++) {
            System.out.print(v[j] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] v, int n) {
        if (n < 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            if (v[i - 1] > v[i]) {
                int temp = v[i];
                v[i] = v[i - 1];
                v[i - 1] = temp;
            }
        }
        bubbleSort(v, n - 1);
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
