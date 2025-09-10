#include <stdio.h>

#define TAM 5

void ler_vetor(int v[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("Digite o %dº numero: ", i + 1);
        scanf("%d", &v[i]);
    }
}

int soma_vetor(int v[], int n)
{
    int soma = 0;
    for (int i = 0; i < n; i++)
    {
        soma += v[i];
    }
    return soma;
}

void exibir_vetor(int v[], int n)
{
    printf("Vetor: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", v[i]);
    }
    printf("\n");
}

int main(void)
{
    int numeros[TAM];

    ler_vetor(numeros, TAM);
    exibir_vetor(numeros, TAM);

    int soma = soma_vetor(numeros, TAM);
    printf("Soma dos elementos = %d\n", soma);

    return 0;
}