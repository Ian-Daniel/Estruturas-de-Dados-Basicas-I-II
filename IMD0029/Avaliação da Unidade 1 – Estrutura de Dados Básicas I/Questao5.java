// Uma empresa precisa cadastrar os nomes dos clientes em ordem alfabética. Os dados chegam em lotes diários com cerca de 50 nomes. Como a entrada já vem quase ordenada, escolha o algoritmo de ordenação mais adequado para essa tarefa.

// b) Implemente-o em Java para ordenar um vetor de nomes.

public class Questao5 {
    public static void main(String[] args) {
        String[] nomes = { "Maria", "João", "Pedro", "Ana", "Carlos", "Ian", "Leonardo", "Weskley", "Isabele", "Kauã",
                "Millene", "Ielmo", "Nailda", "Jean", "Lucas", "Daniel", "Emanuel", "Alex", "Gabriel", "Gustavo", "Levi",
                "Neto", "Bolsonaro", "Brandão", "Clériton", "Whindersson", "Neymar", "Madson", "Davi", "Kaio", "Lucas", "Rafaela",
                "Figueiredo", "Xavier", "Núbia", "Jéssica", "Breno", "Brenda", "Garibaldo", "Fagner", "Eduarda", "Leandro", "Marcos",
                "Monark", "Agostinho", "Vinícius", "Lydianna", "Rickelme", "Heitor", "Jackson", "Ednaldo", "Mário", "Lúcia", "Renan",
                "Ubirajara", "Sandra", "Verônica", "Geromel", "Antônio", "Daniel" };

        insertionSort(nomes);

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void insertionSort(String[] array) {
        int tamanho = array.length;

        for (int i = 1; i < tamanho; i++) {
            String chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(chave) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }
}