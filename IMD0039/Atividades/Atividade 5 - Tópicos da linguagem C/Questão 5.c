#include <stdio.h>

int main(void)
{
    int a = 10, b = 20;
    int *p1, *p2; // Ponteiros para as variáveis.

    printf("Antes da modificacao: a = %d, b = %d\n", a, b);

    // Ponteiros recebem os enderecos das variaveis.
    p1 = &a;
    p2 = &b;

    // Modificando os valores via ponteiros.
    *p1 = 100;
    *p2 = 200;

    printf("Depois da modificacao: a = %d, b = %d\n", a, b);

    return 0;
}