// Crie um vetor de 20 números inteiros ordenados. Mostre o passo a passo da execução da busca binária para encontrar o valor 35.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 3, 7, 11, 14, 18, 21, 25, 29, 34, 35, 38, 42, 47, 53, 58, 62, 68, 73, 79, 85 };

        int inicio = 0;
        int fim = vetor.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == 35) {
                encontrado = true;
                break;
            } else if (vetor[meio] < 35) {
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
