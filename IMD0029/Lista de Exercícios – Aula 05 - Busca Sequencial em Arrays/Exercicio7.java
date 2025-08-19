// Crie um vetor de 6 notas (valores decimais). Imprima a primeira nota maior que 7.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = { 5.0, 10.0, 6.5, 2.5, 4.0, 8.5 };
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 7.0) {
                posicao = i;
                break;
            }
        }
        System.out.println("A primeira nota maior que 7 é: " + vetor[posicao]);
        
        scanner.close();
    }
}