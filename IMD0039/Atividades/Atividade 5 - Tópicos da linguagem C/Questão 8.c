#include <stdio.h>

// Definição da estrutura Retangulo.
struct Retangulo
{
    float largura;
    float altura;
};

// Função que recebe ponteiro para Retangulo e calcula a área.
float calcular_area(struct Retangulo *r)
{
    return r->largura * r->altura;
}

int main(void)
{
    struct Retangulo ret;

    // Leitura dos dados.
    printf("Digite a largura do retangulo: ");
    scanf("%f", &ret.largura);
    printf("Digite a altura do retangulo: ");
    scanf("%f", &ret.altura);

    // Exibição do resultado.
    printf("Area do retangulo = %.2f\n", calcular_area(&ret));

    return 0;
}