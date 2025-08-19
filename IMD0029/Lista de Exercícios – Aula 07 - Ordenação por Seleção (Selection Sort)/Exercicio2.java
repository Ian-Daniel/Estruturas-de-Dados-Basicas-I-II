// Faça o algoritmo imprimir o vetor a cada iteração da ordenação (passo a passo).
public class Exercicio2 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[indiceMenor];
            arr[indiceMenor] = temp;

            System.out.print("Passo " + (i + 1) + ": ");
            imprimirVetor(arr);
        }
    }

    public static void imprimirVetor(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = { 42, 17, 8, 33, 5, 91, 23, 67, 14, 60 };

        System.out.print("Vetor original: ");
        imprimirVetor(vetor);

        selectionSort(vetor);

        System.out.print("Vetor ordenado com Selection Sort: ");
        imprimirVetor(vetor);
    }
}