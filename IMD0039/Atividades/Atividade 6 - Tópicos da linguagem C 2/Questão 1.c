#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Função auxiliar: retorna 1 se for vogal, 0 caso contrário.
int ehVogal(char c)
{
    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
}

// Função recursiva para contar consoantes após a letra limite L.
int contarConsoantes(char *str, char L, int i)
{
    if (str[i] == '\0')
        return 0; // Caso base: fim da string.

    char c = str[i];
    // Verifica se é letra maiúscula, não é vogal e vem depois de L no alfabeto.
    if (isupper(c) && !ehVogal(c) && c > L)
    {
        return 1 + contarConsoantes(str, L, i + 1);
    }
    return contarConsoantes(str, L, i + 1); // Chamada recursiva para o próximo caractere.
}

int main()
{
    char str[100], L;
    printf("Digite a string (somente maiusculas): ");
    scanf("%s", str);
    printf("Digite a letra limite: ");
    scanf(" %c", &L);

    int resultado = contarConsoantes(str, L, 0);
    printf("Quantidade de consoantes apos %c: %d\n", L, resultado);

    return 0;
}