// Altere o algoritmo da busca binária para também retornar quantos elementos foram eliminados da busca após cada iteração.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] vetor = { 2, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51,
                53, 55, 57, 59, 61 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja buscar: ");
        int numero = scanner.nextInt();

        int inicio = 0;
        int fim = vetor.length - 1;
        int comparacoes = 0;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;

            System.out.println(
                    "Comparação #" + comparacoes + ": analisando posição " + meio + " (valor = " + vetor[meio] + ")");

            if (vetor[meio] == numero) {
                System.out.println("\nValor encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (vetor[meio] < numero) {
                int eliminados = meio - inicio + 1;
                System.out.println("-> Eliminando " + eliminados + " elemento(s) à esquerda.");
                inicio = meio + 1;
            } else {
                int eliminados = fim - meio + 1;
                System.out.println("-> Eliminando " + eliminados + " elemento(s) à direita.");
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("\nValor não encontrado no vetor.");
        }

        System.out.println("Total de comparações feitas: " + comparacoes);
        scanner.close();
    }
}