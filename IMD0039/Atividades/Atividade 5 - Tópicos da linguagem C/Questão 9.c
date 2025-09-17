#include <stdio.h>

// Definição da estrutura Pessoa.
struct Pessoa
{
    char nome[50];
    int idade;
    float altura;
};

int main(void)
{
    struct Pessoa p;
    FILE *f;

    // Abre arquivo em modo leitura.
    f = fopen("dados1.txt", "r");
    if (f == NULL)
    {
        fprintf(stderr, "Erro ao abrir o arquivo dados1.txt\n");
        return 1;
    }

    // Lê os dados do arquivo.
    fscanf(f, "%49[^\n]\n%d\n%f", p.nome, &p.idade, &p.altura);
    fclose(f);

    // Exibe os dados
    printf("Dados lidos do arquivo:\n");
    printf("Nome: %s\n", p.nome);
    printf("Idade: %d\n", p.idade);
    printf("Altura: %.2f\n", p.altura);

    return 0;
}
