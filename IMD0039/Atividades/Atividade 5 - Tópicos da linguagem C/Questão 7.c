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

    // Leitura dos dados
    printf("Digite o nome: ");
    scanf(" %[^\n]", p.nome); // Lê até encontrar ENTER.
    printf("Digite a idade: ");
    scanf("%d", &p.idade);
    printf("Digite a altura: ");
    scanf("%f", &p.altura);

    // Exibição
    printf("\nDados da Pessoa:\n");
    printf("Nome: %s\n", p.nome);
    printf("Idade: %d\n", p.idade);
    printf("Altura: %.2f\n", p.altura);

    return 0;
}