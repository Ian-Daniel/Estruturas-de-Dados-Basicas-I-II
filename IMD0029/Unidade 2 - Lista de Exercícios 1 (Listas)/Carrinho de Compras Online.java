class Item {
    String nome;
    int quantidade;
    double precoUnitario;
    Item proximo;
    Item anterior;

    public Item(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.proximo = null;
        this.anterior = null;
    }
}

class Carrinho {
    Item inicio;
    Item fim;

    public void adicionarItem(String nome, int quantidade, double preco) {
        Item novo = new Item(nome, quantidade, preco);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void removerItem(String nome) {
        Item atual = inicio;

        while (atual != null) {
            if (atual.nome.equals(nome)) {
                if (atual == inicio && atual == fim) {
                    inicio = fim = null;
                } else if (atual == inicio) {
                    inicio = atual.proximo;
                    inicio.anterior = null;
                } else if (atual == fim) {
                    fim = atual.anterior;
                    fim.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public void NavegarParaFrente() {
        Item atual = inicio;
        System.out.println("Itens do carrinho (ordem normal):");
        while (atual != null) {
            System.out
                    .println(atual.nome + " - Quantidade: " + atual.quantidade + " - Preço: R$ " + atual.precoUnitario);
            atual = atual.proximo;
        }
    }

    public void NavegarParaTras() {
        Item atual = fim;
        System.out.println("Itens do carrinho (ordem inversa):");
        while (atual != null) {
            System.out
                    .println(atual.nome + " - Quantidade: " + atual.quantidade + " - Preço: R$ " + atual.precoUnitario);
            atual = atual.anterior;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Carrinho carrinho = new Carrinho();

            // Adicionando itens
            carrinho.adicionarItem("Arroz", 2, 5.50);
            carrinho.adicionarItem("Feijão", 1, 7.80);
            carrinho.adicionarItem("Macarrão", 3, 4.20);

            // Exibindo o carrinho para frente
            carrinho.NavegarParaFrente();

            System.out.println("\nExibindo o carrinho ao contrário:");
            carrinho.NavegarParaTras();

            System.out.println("\nRemovendo 'Feijão'...");
            carrinho.removerItem("Feijão");

            carrinho.NavegarParaFrente();
        }
    }
}

// Uso da lista duplamente encadeada me permite navegar em dois sentidos (ir e voltar), além da fácil remoção de itens em qualquer posição, como também não haver a necessidade de circularidade no problema.