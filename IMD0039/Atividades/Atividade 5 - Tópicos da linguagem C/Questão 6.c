#include <stdio.h>
#include <stdlib.h> // Malloc e free.

#define TAM 5

int main(void)
{
    int *v = NULL;
    int soma = 0;

    // Alocando memoria dinamicamente.
    v = (int *)malloc(TAM * sizeof(int));
    if (v == NULL)
    {
        fprintf(stderr, "Erro ao alocar memoria.\n");
        return 1;
    }

    // Leitura dos numeros.
    for (int i = 0; i < TAM; i++)
    {
        printf("Digite o %dº numero: ", i + 1);
        scanf("%d", &v[i]);
    }

    // Calculando a soma.
    for (int i = 0; i < TAM; i++)
    {
        soma += v[i];
    }

    printf("Soma dos numeros = %d\n", soma);

    // Liberando a memoria alocada.
    free(v);

    return 0;
}