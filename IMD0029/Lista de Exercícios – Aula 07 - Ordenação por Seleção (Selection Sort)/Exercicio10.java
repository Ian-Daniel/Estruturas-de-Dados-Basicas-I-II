// Escreva um programa que leia notas de alunos, armazene em um vetor e exiba as notas ordenadas.

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja inserir? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        Arrays.sort(notas); // ordenação crescente

        System.out.println("\nNotas ordenadas:");
        for (double nota : notas) {
            System.out.printf("%.2f ", nota);
        }

        scanner.close();
    }
}