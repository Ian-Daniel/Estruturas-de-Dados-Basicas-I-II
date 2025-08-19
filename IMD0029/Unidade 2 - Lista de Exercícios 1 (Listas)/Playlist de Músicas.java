class Musica {
    String nome;
    double duracao;
    Musica proxima;
    Musica anterior;

    public Musica(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.proxima = null;
        this.anterior = null;
    }
}

class Playlist {
    Musica inicio;
    Musica atual;

    public void adicionarMusica(String nome, double duracao) {
        Musica nova = new Musica(nome, duracao);

        if (inicio == null) {
            inicio = nova;
            inicio.proxima = inicio;
            inicio.anterior = inicio;
            atual = inicio;
        } else {
            Musica ultimo = inicio.anterior;
            ultimo.proxima = nova;
            nova.anterior = ultimo;
            nova.proxima = inicio;
            inicio.anterior = nova;
        }
    }

    public void removerMusica(String nome) {
        if (inicio == null)
            return;

        Musica temp = inicio;
        do {
            if (temp.nome.equals(nome)) {
                if (temp == temp.proxima) {
                    // Só tem uma música.
                    inicio = null;
                    atual = null;
                } else {
                    temp.anterior.proxima = temp.proxima;
                    temp.proxima.anterior = temp.anterior;
                    if (temp == inicio)
                        inicio = temp.proxima;
                    if (temp == atual)
                        atual = temp.proxima;
                }
                return;
            }
            temp = temp.proxima;
        } while (temp != inicio);
    }

    public void avancar() {
        if (atual != null)
            atual = atual.proxima;
    }

    public void voltar() {
        if (atual != null)
            atual = atual.anterior;
    }

    public void exibirAtual() {
        if (atual != null) {
            System.out.println("Tocando: " + atual.nome + " (" + atual.duracao + " min)");
        } else {
            System.out.println("A playlist está vazia.");
        }
    }

    public void exibirPlaylist() {
        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        Musica temp = inicio;
        do {
            System.out.println(temp.nome + " (" + temp.duracao + " min)");
            temp = temp.proxima;
        } while (temp != inicio);
    }

    public class Main {
        public static void main(String[] args) {
            Playlist playlist = new Playlist();

            playlist.adicionarMusica("Cogulândia", 2.0);
            playlist.adicionarMusica("Antes", 2.49);
            playlist.adicionarMusica("Gorilla Roxo", 2.45);
            playlist.adicionarMusica("Vem Chapar", 2.45);
            playlist.adicionarMusica("777-666", 2.44);
            playlist.adicionarMusica("É Sal", 2.37);
            playlist.adicionarMusica("Máquina do Tempo", 3.4);

            System.out.println("Playlist atual:");
            playlist.exibirPlaylist();

            System.out.println("\nTocando músicas:");
            playlist.exibirAtual();
            playlist.avancar();
            playlist.exibirAtual();
            playlist.avancar();
            playlist.exibirAtual();
            playlist.avancar();
            playlist.exibirAtual();

            System.out.println("\nVoltando na playlist:");
            playlist.voltar();
            playlist.exibirAtual();

            System.out.println("\nRemovendo 'Gorilla Roxo':");
            playlist.removerMusica("Gorilla Roxo");
            playlist.exibirPlaylist();
        }
    }
}

// O uso da lista dupla circular foi utilizado pois se trata de uma navegação bidirecional (eu posso avançar e retroceder nas faixas da playlist). por ser circular, eu tenho um loop infinito, caso eu queira, e a facilidade em inserir ou remover faixas da playlist.