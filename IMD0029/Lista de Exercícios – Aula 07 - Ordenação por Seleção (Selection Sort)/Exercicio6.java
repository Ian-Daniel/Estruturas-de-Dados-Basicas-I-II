//Faça um programa que leia 5 nomes e os ordene com selection sort sem usar Arrays.sort().

// Este é o mesmo código do programa anterior, uma vez que não foi utilizado o Arrays.sort() em nenhum deles.

import java.util.Scanner;

public class Exercicio6 {
    public static void selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[indiceMenor]) < 0) {
                    indiceMenor = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[indiceMenor];
            arr[indiceMenor] = temp;
        }
    }

    public static void imprimirVetor(String[] arr) {
        System.out.println(String.join(", ", arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[8];

        System.out.println("Digite oito nomes:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            vetor[i] = scanner.nextLine();
        }

        selectionSort(vetor);

        System.out.print("Vetor ordenado em ordem alfabética: ");
        imprimirVetor(vetor);

        scanner.close();
    }
}