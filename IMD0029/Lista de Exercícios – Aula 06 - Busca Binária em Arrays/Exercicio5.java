// Escreva um programa que, usando busca binária, encontre o menor valor maior que 50 em um vetor ordenado de inteiros.

public class Exercicio5 {
    public static void main(String[] args) {

        int[] vetor = { 3, 7, 11, 14, 18, 21, 25, 29, 34, 35, 38, 42, 47, 53, 58, 62, 68, 73, 79, 85 };

        int inicio = 0;
        int fim = vetor.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] > 50) {
                resultado = vetor[meio];
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (resultado != -1) {
            System.out.println("O menor valor maior que 50 é: " + resultado);
        } else {
            System.out.println("Não há valor maior que 50 no vetor.");
        }

    }
}