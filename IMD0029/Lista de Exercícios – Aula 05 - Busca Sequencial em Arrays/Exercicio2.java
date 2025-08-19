//  Crie um vetor de 8 números inteiros. Leia um número do usuário e imprima a posição da primeira ocorrência do número no vetor (ou -1 se não existir).

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }
        System.out.println("A posição da primeira ocorrência é: " + posicao);

        scanner.close();
    }
}