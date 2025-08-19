// Crie um vetor de 30 inteiros ordenados. Implemente a busca binária e conte quantas comparações são feitas até encontrar um valor.

import java.util.Scanner;

public class Exercicio8 {
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

            if (vetor[meio] == numero) {
                System.out.println("Valor encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado no vetor.");
        }

        System.out.println("Comparações feitas: " + comparacoes);
        scanner.close();
    }
}