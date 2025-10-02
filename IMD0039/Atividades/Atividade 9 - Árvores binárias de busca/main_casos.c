#include <stdio.h>
#include "abb.h"

void caso_a()
{
    printf("=== Caso A ===\n");
    int valores[] = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 55, 65, 75, 85};
    int n = sizeof(valores) / sizeof(valores[0]);

    No *raiz = NULL;
    for (int i = 0; i < n; i++)
        raiz = inserir(raiz, valores[i]);

    printf("Inicial: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 10);
    printf("Remover 10: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 25);
    printf("Remover 25: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 50);
    printf("Remover 50: ");
    emOrdem(raiz);
    printf("\n");

    liberarArvore(raiz);
}

void caso_b()
{
    printf("\n=== Caso B ===\n");
    int valores[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    int n = sizeof(valores) / sizeof(valores[0]);

    No *raiz = NULL;
    for (int i = 0; i < n; i++)
        raiz = inserir(raiz, valores[i]);

    printf("Inicial: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 120);
    printf("Remover 120: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 100);
    printf("Remover 100: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 60);
    printf("Remover 60: ");
    emOrdem(raiz);
    printf("\n");

    liberarArvore(raiz);
}

void caso_c()
{
    printf("\n=== Caso C ===\n");
    int valores[] = {50, 40, 99, 30, 45, 34, 32, 35, 70, 65, 85, 100, 95, 110};
    int n = sizeof(valores) / sizeof(valores[0]);

    No *raiz = NULL;
    for (int i = 0; i < n; i++)
        raiz = inserir(raiz, valores[i]);

    printf("Inicial: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 95);
    printf("Remover 95: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 100);
    printf("Remover 100: ");
    emOrdem(raiz);
    printf("\n");

    raiz = remover(raiz, 99);
    printf("Remover 99: ");
    emOrdem(raiz);
    printf("\n");

    liberarArvore(raiz);
}

int main(void)
{
    caso_a();
    caso_b();
    caso_c();
    return 0;
}
