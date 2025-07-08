class Jogador {
    String nome;
    double pontuacaoAtual;
    Jogador proximo;

    public Jogador(String nome, double pontuacaoAtual) {
        this.nome = nome;
        this.pontuacaoAtual = pontuacaoAtual;
        this.proximo = null;
    }
}

class RodizioJogadores {
    Jogador inicio;
    Jogador atual;

    public void adicionarJogador(String nome, double pontuacao) {
        Jogador novo = new Jogador(nome, pontuacao);

        if (inicio == null) {
            inicio = novo;
            novo.proximo = inicio;
            atual = inicio;
        } else {
            Jogador temp = inicio;
            while (temp.proximo != inicio) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
            novo.proximo = inicio;
        }
    }

    public void removerJogador(String nome) {
        if (inicio == null)
            return;

        Jogador temp = inicio;
        Jogador anterior = null;

        do {
            if (temp.nome.equals(nome)) {
                if (temp == inicio && temp.proximo == inicio) {
                    inicio = null;
                    atual = null;
                } else {
                    if (temp == inicio) {
                        Jogador ultimo = inicio;
                        while (ultimo.proximo != inicio) {
                            ultimo = ultimo.proximo;
                        }
                        inicio = inicio.proximo;
                        ultimo.proximo = inicio;
                    } else {
                        anterior.proximo = temp.proximo;
                    }

                    if (temp == atual)
                        atual = temp.proximo;
                }
                return;
            }
            anterior = temp;
            temp = temp.proximo;
        } while (temp != inicio);
    }

    public void avancarRodada() {
        if (atual != null) {
            atual = atual.proximo;
        }
    }

    public void exibirJogadorAtual() {
        if (atual != null) {
            System.out.println("Jogador da vez: " + atual.nome + " - Pontuação: " + atual.pontuacaoAtual);
        } else {
            System.out.println("Nenhum jogador na rodada.");
        }
    }

    public void listarJogadores() {
        if (inicio == null) {
            System.out.println("Nenhum jogador na lista.");
            return;
        }

        Jogador temp = inicio;
        System.out.println("Jogadores na lista:");
        do {
            System.out.println(temp.nome + " - Pontuação: " + temp.pontuacaoAtual);
            temp = temp.proximo;
        } while (temp != inicio);
    }

    public class Main {
        public static void main(String[] args) {
            RodizioJogadores rodizio = new RodizioJogadores();

            rodizio.adicionarJogador("Alice", 10);
            rodizio.adicionarJogador("Bob", 20);
            rodizio.adicionarJogador("Carlos", 30);

            rodizio.listarJogadores();

            System.out.println("\nIniciando rodadas:");
            for (int i = 0; i < 5; i++) {
                rodizio.exibirJogadorAtual();
                rodizio.avancarRodada();
            }

            System.out.println("\nRemovendo Bob...");
            rodizio.removerJogador("Bob");
            rodizio.listarJogadores();

            System.out.println("\nRodadas após remoção:");
            for (int i = 0; i < 5; i++) {
                rodizio.exibirJogadorAtual();
                rodizio.avancarRodada();
            }
        }
    }
}
// A justificativa para o uso da técnica de lista simples é que o problema exige uma navegação apenas para um sentido, uma vez que o controle é feito no rodízio de jogadores, e, quando comparada a uma lista dupla, essa lista exige menos da memória. 