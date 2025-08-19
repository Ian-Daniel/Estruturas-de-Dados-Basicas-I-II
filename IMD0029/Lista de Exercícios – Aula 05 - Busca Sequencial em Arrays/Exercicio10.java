// Dado um vetor com 8 números inteiros, imprima o índice do menor valor presente no vetor. 

public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetor = { 65, 12, 3, 77, 30, 109, 23, 73 };

        int menor = vetor[0];
        int indiceMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                indiceMenor = i;
            }
        }

        System.out.println("O menor valor está no índice: " + indiceMenor);
    }
}