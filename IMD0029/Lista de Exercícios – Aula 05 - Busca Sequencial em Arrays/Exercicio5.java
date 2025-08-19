// Crie um vetor com 10 números inteiros e imprima quantas vezes o número 0 aparece no vetor.

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int zeros = 0;

        for (int i = 0; i < vetor.length; i++) {
            String numeroString = String.valueOf(Math.abs(vetor[i]));
            for (int j = 0; j < numeroString.length(); j++) {
                if (numeroString.charAt(j) == '0') {
                    zeros++;
                }
            }
        }

        System.out.println("O número 0 aparece " + zeros + " vezes no vetor.");
    }
}