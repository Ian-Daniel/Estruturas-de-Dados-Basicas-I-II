#include <stdio.h>

void troca_por_referencia(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
    // Aqui dentro os valores foram trocados, e 'a' e 'b' são ponteiros para as variaveis originais: a troca afeta o chamador.
}

int main(void)
{
    int x, y;

    printf("Digite dois inteiros (x y): ");
    if (scanf("%d %d", &x, &y) != 2)
    {
        fprintf(stderr, "Entrada invalida.\n");
        return 1;
    }

    printf("Antes da troca: x = %d, y = %d\n", x, y);
    troca_por_referencia(&x, &y);
    printf("Depois da troca: x = %d, y = %d\n", x, y);

    return 0;
}