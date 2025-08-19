// Dado um vetor ordenado com números repetidos, implemente a busca binária para retornar a primeira posição do número 20.

public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetor = { 5, 10, 15, 20, 20, 20, 25, 30, 35, 40 };
        int numero = 20;

        int inicio = 0;
        int fim = vetor.length - 1;
        int posicao = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numero) {
                posicao = meio;
                fim = meio - 1;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (posicao != -1) {
            System.out.println("A primeira ocorrência de " + numero + " está na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}