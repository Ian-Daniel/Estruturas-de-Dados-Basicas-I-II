// Crie um vetor com nomes de produtos. Imprima todos os produtos cujo nome começa com a letra “M”.

public class Exercicio9 {
    public static void main(String[] args) {
        String[] vetor = {
                "Mouse Logitech M170",
                "Teclado Mecânico Redragon",
                "Monitor LG 24''",
                "Fone de Ouvido JBL",
                "Carregador Turbo USB-C",
                "Webcam Full HD"
        };

        System.out.println("Produtos que começam com a letra 'M':");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].charAt(0) == 'M') {
                System.out.println("Posição " + i + " -> produto: " + vetor[i]);
            }
        }
    }
}