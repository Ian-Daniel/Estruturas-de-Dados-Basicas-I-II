#include <stdio.h>
#include "abb.h"

int main(void)
{
    int valores[] = {8, 3, 10, 1, 6, 14, 4, 7, 13};
    int n = (int)(sizeof(valores) / sizeof(valores[0]));

    No *raiz = NULL;
    for (int i = 0; i < n; ++i)
        raiz = inserir(raiz, valores[i]);

    printf("Em-ordem (ordenado): ");
    emOrdem(raiz);
    printf("\n");

    int x = 7;
    printf("Buscando %d... %s\n", x, buscar(raiz, x) ? "encontrado" : "nao encontrado");

    raiz = remover(raiz, 1);
    raiz = remover(raiz, 14);
    raiz = remover(raiz, 3);

    printf("Em-ordem após remoções: ");
    emOrdem(raiz);
    printf("\n");

    liberarArvore(raiz);
    return 0;
}