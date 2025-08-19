// Em vez de int[], utilize double[] e ordene números com casas decimais.

import java.util.Random;

public class Exercicio9 {

    public static double[] gerarVetorAleatorio(int tamanho) {
        Random random = new Random();
        double[] vetor = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextDouble() * 10000;
        }
        return vetor;
    }

    public static double[] copiarVetor(double[] original) {
        double[] copia = new double[original.length];
        System.arraycopy(original, 0, copia, 0, original.length);
        return copia;
    }

    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndice]) {
                    menorIndice = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[menorIndice];
            arr[menorIndice] = temp;
        }
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
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

        double[] original = gerarVetorAleatorio(tamanho);
        double[] vetor1 = copiarVetor(original);
        double[] vetor2 = copiarVetor(original);

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