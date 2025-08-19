public class AlgoritmosDeOrdenacao {
    public static void main(String[] args) {
        int[] vetorOriginal = {5, 2, 9, 1, 5, 6};
        int[] vetorSelection = vetorOriginal.clone();
        int[] vetorInsertion = vetorOriginal.clone();
        int[] vetorBubble = vetorOriginal.clone();

        selectionSort(vetorSelection);
        insertionSort(vetorInsertion);
        bubbleSort(vetorBubble);

        System.out.print("Vetor original, sem ordenações: ");
        imprimir(vetorOriginal);

        System.out.print("Selection Sort: ");
        imprimir(vetorSelection);

        System.out.print("Insertion Sort: ");
        imprimir(vetorInsertion);

        System.out.print("Bubble Sort: ");
        imprimir(vetorBubble);
    }

    static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorIndice]) {
                    menorIndice = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menorIndice];
            vetor[menorIndice] = temp;
        }
    }

    static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    static void imprimir(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
