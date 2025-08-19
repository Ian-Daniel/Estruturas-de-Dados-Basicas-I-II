// Dado um vetor de strings ordenado, implemente a busca binária e imprima a quantidade de letras comparadas até encontrar (ou não) a string buscada.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        String[] nomes = { "Ana", "Bruno", "Daniel", "Eduarda", "Felipe", "Gabriela", "Heitor", "Ian",
                "Joana", "Lucas", "Kauã", "Leonardo", "Maria", "Nicolas", "Otavio", "Rafael", "Sofia", "Tiago", "Vanessa",
                "Yasmin" };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome que deseja buscar: ");
        String alvo = scanner.nextLine();

        int inicio = 0;
        int fim = nomes.length - 1;
        int totalComparacoesDeLetras = 0;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            String atual = nomes[meio];
            int minLength = Math.min(alvo.length(), atual.length());
            int comparacoesLetras = 0;

            for (int i = 0; i < minLength; i++) {
                comparacoesLetras++;
                if (alvo.charAt(i) != atual.charAt(i)) {
                    break;
                }
            }

            totalComparacoesDeLetras += comparacoesLetras;

            int resultadoComparacao = alvo.compareTo(atual);

            if (resultadoComparacao == 0) {
                System.out.println("\nNome encontrado na posição " + meio + ".");
                encontrado = true;
                break;
            } else if (resultadoComparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("\nNome não encontrado.");
        }

        System.out.println("Total de letras comparadas: " + totalComparacoesDeLetras);
        scanner.close();
    }
}