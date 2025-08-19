// Compare a performance de selection sort com bubble sort em vetores com 100, 1.000 e 10.000 elementos gerados aleatoriamente.

import java.util.Random;

public class Exercicio8 {
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }
        return vetor;
    }

    public static int[] copiarVetor(int[] original) {
        int[] copia = new int[original.length];
        System.arraycopy(original, 0, copia, 0, original.length);
        return copia;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndice]) {
                    menorIndice = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[menorIndice];
            arr[menorIndice] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public static void comparar(int tamanho) {
        System.out.println("\nComparando com vetor de tamanho " + tamanho);

        int[] original = gerarVetorAleatorio(tamanho);
        int[] vetor1 = copiarVetor(original);
        int[] vetor2 = copiarVetor(original);

        long inicio, fim;

        inicio = System.nanoTime();
        selectionSort(vetor1);
        fim = System.nanoTime();
        System.out.printf("Selection Sort: %.3f ms%n", (fim - inicio) / 1e6);

        inicio = System.nanoTime();
        bubbleSort(vetor2);
        fim = System.nanoTime();
        System.out.printf("Bubble Sort: %.3f ms%n", (fim - inicio) / 1e6);
    }

    public static void main(String[] args) {
        comparar(100);
        comparar(1000);
        comparar(10000);
    }
}