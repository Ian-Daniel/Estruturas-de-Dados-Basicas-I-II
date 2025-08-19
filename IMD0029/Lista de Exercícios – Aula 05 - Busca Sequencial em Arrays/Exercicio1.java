// Crie um vetor de 5 inteiros e leia um número do usuário. Verifique se esse número existe no vetor usando estrutura for e imprima o resultado.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5 };

        System.out.print("Digite um número para verificar se está no vetor: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número está no vetor.");
        } else {
            System.out.println("O número não está no vetor.");
        }

        scanner.close();
    }
}