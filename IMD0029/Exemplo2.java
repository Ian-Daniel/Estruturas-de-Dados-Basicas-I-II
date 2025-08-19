public class Exemplo2 {
    public static void main(String[] args) {
        int[] notas = { 7, 5, 9, 10, 3 };
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / (double) notas.length;
        System.out.println("A média das notas é igual a: " + media);
        System.out.print("As notas maiores que a média são: ");
        for (double nota : notas) {
            if (nota > media) {
                System.out.print(nota + " ");
            }
        }
    }
}