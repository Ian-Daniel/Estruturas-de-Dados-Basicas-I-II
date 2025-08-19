// Modifique o algoritmo para ordenar em ordem decrescente.

import java.util.Scanner;

public class Exercicio4 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMaior = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[indiceMaior];
            arr[indiceMaior] = temp;
        }
    }

    public static void imprimirVetor(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Digite oito números inteiros... ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        selectionSort(vetor);

        System.out.print("Vetor ordenado com Selection Sort: ");
        imprimirVetor(vetor);

        scanner.close();
    }
}