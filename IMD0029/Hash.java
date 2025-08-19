public class Main {
    static int hashTable(String texto) {
        int hash = 0;
        int base = 31;
        for (int i =0; i < texto.length(); i++) {
            int peso = texto.charAt(i);
            hash = hash * base + peso;
        }
        return hash;
    }

    public static void main(String[] args) {
        String ian = "Ian";
        String weskley = "Weskley";
        String esteva = "Estevã";
        System.out.println(hashTable(ian));
        System.out.println(hashTable(weskley));
        System.out.println(hashTable(esteva));
    }
}