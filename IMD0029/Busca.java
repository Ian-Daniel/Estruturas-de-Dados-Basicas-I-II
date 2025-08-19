public class Busca {
    public static int buscaSequencial(int[] vetor, int procurado){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == procurado){
                return vetor[i];
            }
        }
        return -1;
    }
}