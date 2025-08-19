// Crie um vetor de 10 inteiros ordenados manualmente. Leia um número do usuário e diga se ele existe no vetor utilizando busca binária.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };

        System.out.print("Digite um número para buscar: ");
        int numero = scanner.nextInt();

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
            System.out.println("O número existe no vetor.");
        } else {
            System.out.println("O número não existe no vetor.");
        }

        scanner.close();
    }
}