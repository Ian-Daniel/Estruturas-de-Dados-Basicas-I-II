// Crie um vetor de strings com 6 nomes. Leia um nome e informe se ele está presente no vetor.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = { "Zezinho", "Raimunda", "Chico", "Maria", "Lurdes", "João" };

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome está presente no vetor.");
        } else {
            System.out.println("O nome não está presente no vetor.");
        }

        scanner.close();
    }
}