// Crie um vetor de 10 números inteiros e leia um valor de referência. Imprima a soma de todos os números maiores que esse valor.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Digite um número: ");
        int valor = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                soma += vetor[i];
            }
        }

        if (soma == 0) {
            System.out.println("Não há números maiores que " + valor + " no vetor.");
        } else {
            System.out.println("A soma de todos os números maiores que esse valor é: " + soma);
        }

        scanner.close();
    }
}