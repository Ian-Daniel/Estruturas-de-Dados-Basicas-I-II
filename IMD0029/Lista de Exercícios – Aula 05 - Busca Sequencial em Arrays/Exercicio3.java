// Crie um vetor com 10 números inteiros. Imprima SIM se o número 25 estiver no vetor e NÃO caso contrário.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 25) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        scanner.close();
    }
}
