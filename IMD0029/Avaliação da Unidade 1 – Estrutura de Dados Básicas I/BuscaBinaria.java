// Implemente o algoritmo de Busca Binária na linguagem de sua preferência (Java, C ou C++). Em seguida, desenvolva um programa que:

// Leia um vetor de 10 números inteiros em ordem crescente; 
// Solicite ao usuário um número a ser procurado; 
// Exiba uma mensagem indicando se o número foi encontrado e, em caso positivo, informe a posição no vetor.


import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = { 3, 7, 11, 14, 18, 21, 25, 29, 34, 35 };

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
            System.out.println("O número existe no vetor e está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O número não existe no vetor.");
        }

        scanner.close();
    }

}