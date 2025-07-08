class Pagina {
    String url;
    String titulo;
    Pagina anterior;
    Pagina proxima;

    public Pagina(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
        this.anterior = null;
        this.proxima = null;
    }
}

class NavegadorWeb {
    Pagina atual;

    public void visitarNovaPagina(String url, String titulo) {
        Pagina nova = new Pagina(url, titulo);
        if (atual != null) {
            atual.proxima = nova;
            nova.anterior = atual;
        }
        atual = nova;
    }

    public void voltar() {
        if (atual != null && atual.anterior != null) {
            atual = atual.anterior;
        } else {
            System.out.println("Não é possível voltar. Já está na primeira página.");
        }
    }

    public void avancar() {
        if (atual != null && atual.proxima != null) {
            atual = atual.proxima;
        } else {
            System.out.println("Não é possível avançar. Já está na última página.");
        }
    }

    public void exibirPaginaAtual() {
        if (atual != null) {
            System.out.println("Página atual:");
            System.out.println("Título: " + atual.titulo);
            System.out.println("URL: " + atual.url);
        } else {
            System.out.println("Nenhuma página acessada.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            NavegadorWeb navegador = new NavegadorWeb();

            navegador.visitarNovaPagina("https://google.com", "Google");
            navegador.visitarNovaPagina("https://openai.com", "OpenAI");
            navegador.visitarNovaPagina("https://github.com", "GitHub");

            navegador.exibirPaginaAtual();

            System.out.println("\nVoltando uma página...");
            navegador.voltar();
            navegador.exibirPaginaAtual();

            System.out.println("\nVoltando novamente...");
            navegador.voltar();
            navegador.exibirPaginaAtual();

            System.out.println("\nTentando voltar além do início...");
            navegador.voltar();

            System.out.println("\nAvançando uma página...");
            navegador.avancar();
            navegador.exibirPaginaAtual();
        }
    }
}

// Uso da lista duplamente encadeada me permite navegar em dois sentidos (ir e voltar), além da fácil remoção de itens em qualquer posição, como também não haver a necessidade de circularidade no problema.