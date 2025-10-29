#ifndef TRIE_H
#define TRIE_H

#include <stdbool.h>

#define ALFABETO 26

typedef struct No
{
    struct No *filhos[ALFABETO];
    bool fim_da_palavra;
} No;

No *criar_no();
void inserir(No *raiz, const char *palavra);
bool buscar(No *raiz, const char *palavra);
void liberar_trie(No *raiz);

#endif