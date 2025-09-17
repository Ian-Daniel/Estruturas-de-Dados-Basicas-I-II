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

    // Entrada dos dados.
    printf("Digite o nome: ");
    scanf(" %[^\n]", p.nome);
    printf("Digite a idade: ");
    scanf("%d", &p.idade);
    printf("Digite a altura: ");
    scanf("%f", &p.altura);

    // Abre arquivo em modo escrita.
    f = fopen("dados2.txt", "w");
    if (f == NULL)
    {
        fprintf(stderr, "Erro ao abrir o arquivo dados2.txt\n");
        return 1;
    }

    // Grava dados no arquivo.
    fprintf(f, "%s\n%d\n%.2f\n", p.nome, p.idade, p.altura);
    fclose(f);

    printf("Dados salvos em dados2.txt com sucesso.\n");

    return 0;
}
