class Operacao {
    String tipo; // "adicionar", "remover" ou "substituir"
    String conteudo;
    Operacao anterior;
    Operacao proxima;

    public Operacao(String tipo, String conteudo) {
        this.tipo = tipo;
        this.conteudo = conteudo;
        this.anterior = null;
        this.proxima = null;
    }
}

class EditorTexto {
    Operacao inicio;
    Operacao atual;

    public void realizarOperacao(String tipo, String conteudo) {
        Operacao nova = new Operacao(tipo, conteudo);

        if (inicio == null) {
            inicio = nova;
            atual = nova;
        } else {
            if (atual.proxima != null) {
                atual.proxima.anterior = null;
                atual.proxima = null;
            }
            atual.proxima = nova;
            nova.anterior = atual;
            atual = nova;
        }
        System.out.println("Operação realizada: " + tipo + " - " + conteudo);
    }

    public void desfazer() {
        if (atual != null && atual.anterior != null) {
            System.out.println("Desfazendo: " + atual.tipo + " - " + atual.conteudo);
            atual = atual.anterior;
        } else {
            System.out.println("Não há operações para desfazer.");
        }
    }

    public void refazer() {
        if (atual != null && atual.proxima != null) {
            atual = atual.proxima;
            System.out.println("Refazendo: " + atual.tipo + " - " + atual.conteudo);
        } else {
            System.out.println("Não há operações para refazer.");
        }
    }

    public void exibirOperacaoAtual() {
        if (atual != null) {
            System.out.println("Operação atual: " + atual.tipo + " - " + atual.conteudo);
        } else {
            System.out.println("Nenhuma operação realizada.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            EditorTexto editor = new EditorTexto();

            editor.realizarOperacao("adicionar", "Olá, mundo!");
            editor.realizarOperacao("adicionar", " Como vai?");
            editor.realizarOperacao("substituir", "Olá, ChatGPT!");

            editor.exibirOperacaoAtual();

            System.out.println("\nDesfazendo duas operações...");
            editor.desfazer();
            editor.exibirOperacaoAtual();
            editor.desfazer();
            editor.exibirOperacaoAtual();

            System.out.println("\nRefazendo uma operação...");
            editor.refazer();
            editor.exibirOperacaoAtual();

            System.out.println("\nRealizando nova operação após desfazer:");
            editor.realizarOperacao("adicionar", " Nova linha adicionada.");
            editor.exibirOperacaoAtual();

            System.out.println("\nTentando refazer novamente...");
            editor.refazer();
        }
    }
}

// Permite desfazer (navegar para trás) e refazer (navegar para frente) de forma eficiente. Excluir operações futuras ao fazer uma nova operação após desfazer segue o comportamento de editores reais. Circularidade não é necessária pois o histórico de edição é linear.