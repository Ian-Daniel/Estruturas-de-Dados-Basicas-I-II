// Modifique o exercício anterior para imprimir as posições onde o número 0 aparece no vetor.

public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        System.out.println("Posições onde o número contém o dígito '0':");

        for (int i = 0; i < vetor.length; i++) {
            String numeroString = String.valueOf(Math.abs(vetor[i]));
            boolean temZero = false;

            for (int j = 0; j < numeroString.length(); j++) {
                if (numeroString.charAt(j) == '0') {
                    temZero = true;
                    break;
                }
            }

            if (temZero) {
                System.out.println("Posição " + i + " -> valor: " + vetor[i]);
            }
        }
    }
}