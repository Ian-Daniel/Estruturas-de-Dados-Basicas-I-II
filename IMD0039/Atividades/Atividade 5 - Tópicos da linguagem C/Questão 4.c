#include <stdio.h>

#define TAM 3

void ler_matriz(int m[TAM][TAM])
{
    for (int i = 0; i < TAM; i++)
    {
        for (int j = 0; j < TAM; j++)
        {
            printf("Digite o elemento [%d][%d]: ", i, j);
            scanf("%d", &m[i][j]);
        }
    }
}

void exibir_matriz(int m[TAM][TAM])
{
    printf("\nMatriz:\n");
    for (int i = 0; i < TAM; i++)
    {
        for (int j = 0; j < TAM; j++)
        {
            printf("%4d", m[i][j]);
        }
        printf("\n");
    }
}

int soma_diagonal_principal(int m[TAM][TAM])
{
    int soma = 0;
    for (int i = 0; i < TAM; i++)
    {
        soma += m[i][i];
    }
    return soma;
}

int main(void)
{
    int matriz[TAM][TAM];

    ler_matriz(matriz);
    exibir_matriz(matriz);

    int soma = soma_diagonal_principal(matriz);
    printf("\nSoma da diagonal principal = %d\n", soma);

    return 0;
}