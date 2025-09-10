#include <stdio.h>

void troca_por_valor(int a, int b)
{
    int tmp = a;
    a = b;
    b = tmp;
    // Aqui dentro os valores foram trocados, mas 'a' e 'b' são cópias: nada muda no chamador.
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

    printf("Antes da tentativa de troca: x = %d, y = %d\n", x, y);
    troca_por_valor(x, y);
    printf("Depois da tentativa de troca: x = %d, y = %d\n", x, y);

    return 0;
}