class Pedido {
    int numero;
    String nomeCliente;
    double valorTotal;
    Pedido proximo;

    public Pedido(int numero, String nomeCliente, double valorTotal) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.proximo = null;
    }
}

class HistoricoPedidos {
    Pedido inicio;

    public void adicionarPedido(int numero, String nomeCliente, double valorTotal) {
        Pedido novo = new Pedido(numero, nomeCliente, valorTotal);

        if (inicio == null) {
            inicio = novo;
        } else {
            Pedido temp = inicio;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
    }

    public void cancelarPedido(int numero) {
        if (inicio == null)
            return;

        Pedido temp = inicio;
        Pedido anterior = null;

        while (temp != null && temp.numero != numero) {
            anterior = temp;
            temp = temp.proximo;
        }

        if (temp == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        if (anterior == null) {
            inicio = inicio.proximo;
        } else {
            anterior.proximo = temp.proximo;
        }
    }

    public void listarPedidos() {
        if (inicio == null) {
            System.out.println("Nenhum pedido em andamento.");
            return;
        }

        Pedido temp = inicio;
        System.out.println("Pedidos em andamento:");
        while (temp != null) {
            System.out.println(
                    "Pedido #" + temp.numero + " - Cliente: " + temp.nomeCliente + " - Valor: R$ " + temp.valorTotal);
            temp = temp.proximo;
        }
    }

    public class Main {
        public static void main(String[] args) {
            HistoricoPedidos historico = new HistoricoPedidos();

            historico.adicionarPedido(101, "Maria", 35.50);
            historico.adicionarPedido(102, "João", 42.00);
            historico.adicionarPedido(103, "Ana", 27.30);

            historico.listarPedidos();

            System.out.println("\nCancelando pedido #102...");
            historico.cancelarPedido(102);

            historico.listarPedidos();
        }
    }
}

// A justificativa para o uso da técnica de lista simples é que o problema exige uma navegação apenas para um sentido, uma vez que o controle é feito na inserção dos pacientes, e, quando comparada a uma lista dupla, essa lista exige menos da memória. 