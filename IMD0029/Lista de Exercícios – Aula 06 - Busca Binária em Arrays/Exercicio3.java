// Crie um programa que receba um número do usuário e retorne a posição onde ele aparece no vetor usando busca binária. Se não for encontrado, imprima “valor não encontrado”.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 3, 7, 11, 14, 18, 21, 25, 29, 34, 35, 38, 42, 47, 53, 58, 62, 68, 73, 79, 85 };

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }

        int inicio = 0;
        int fim = vetor.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numero) {
                encontrado = true;
                break;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (encontrado)

        {
            System.out.println("O número existe no vetor e está na posição " + posicao + " .");
        } else {
            System.out.println("O número não existe no vetor.");
        }

        scanner.close();
    }

}