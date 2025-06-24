class Paciente {
    String nome;
    int idade;
    String senha;
    Paciente proximo;

    public Paciente(String nome, int idade, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
        this.proximo = null;
    }
}

class FilaAtendimento {
    Paciente inicio;

    public void inserirPaciente(String nome, int idade, String senha) {
        Paciente novo = new Paciente(nome, idade, senha);

        if (inicio == null || idade > 60) {
            // Vai inserir no início, caso seja um idoso ou se a fila estiver vazia.
            if (inicio != null && inicio.idade > 60) {
                Paciente atual = inicio;
                Paciente anterior = null;
                while (atual != null && atual.idade > 60) {
                    anterior = atual;
                    atual = atual.proximo;
                }
                if (anterior == null) {
                    novo.proximo = inicio;
                    inicio = novo;
                } else {
                    novo.proximo = anterior.proximo;
                    anterior.proximo = novo;
                }
            } else {
                novo.proximo = inicio;
                inicio = novo;
            }
        } else {
            Paciente atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public Paciente chamarProximo() {
        if (inicio == null)
            return null;
        Paciente chamado = inicio;
        inicio = inicio.proximo;
        return chamado;
    }

    public void listarPacientes() {
        Paciente atual = inicio;
        while (atual != null) {
            System.out.println(atual.nome + " (" + atual.idade + " anos) - Senha: " + atual.senha);
            atual = atual.proximo;
        }
    }

    public class Main {
        public static void main(String[] args) {
            FilaAtendimento fila = new FilaAtendimento();

            // Inserção de pacientes.
            fila.inserirPaciente("João", 45, "A001");
            fila.inserirPaciente("Maria", 65, "A002");
            fila.inserirPaciente("Carlos", 70, "A003");
            fila.inserirPaciente("Ana", 30, "A004");

            fila.listarPacientes();

            System.out.println("\nChamando próximo paciente...");
            Paciente chamado = fila.chamarProximo();
            if (chamado != null) {
                System.out.println("Atendendo: " + chamado.nome + " (" + chamado.idade + " anos)");
            }

            System.out.println("\nFila atualizada:");
            fila.listarPacientes();
        }
    }
}

// A justificativa para o uso da técnica de lista simples é que o problema exige uma navegação apenas para um sentido, uma vez que o controle é feito na inserção dos pacientes, e, quando comparada a uma lista dupla, essa lista exige menos da memória. 