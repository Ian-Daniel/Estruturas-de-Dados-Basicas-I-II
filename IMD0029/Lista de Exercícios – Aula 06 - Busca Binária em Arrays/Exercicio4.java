// Crie um vetor de nomes ordenados em ordem alfabética. Implemente a busca binária para localizar se o nome “Maria” existe no vetor.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = { "Ana", "Beatriz", "Carlos", "Fernanda", "João", "Maria", "Pedro", "Rafael", "Sofia",
                "Vinicius" };
        String nome = "Maria";

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nome)) {
                encontrado = true;
                break;
            }
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == nome) {
                encontrado = true;
                break;
            } else if (vetor[meio] != nome) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (encontrado)

        {
            System.out.println("O nome 'Maria' existe no vetor.");
        } else {
            System.out.println("O nome 'Maria' não existe no vetor.");
        }

        scanner.close();
    }

}