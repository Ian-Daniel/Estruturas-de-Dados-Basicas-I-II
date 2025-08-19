public class Exemplo3 {
    public static void main(String[] args) {
        int[] idade = { 23, 33, 27, 14, 9, 56 };
        int idadeEncontrada = Busca.buscaSequencial(idade, 14);
        System.out.println("Idade encontrada: " + idadeEncontrada);
    }
}