#ifndef ARVVAR_H
#define ARVVAR_H

/* Estrutura e funções para árvore n-ária simples (cada nó tem lista de filhos). */

typedef struct arvvar ArvVar;

/* Cria um nó com o caractere c (filho/head inicial NULL). */
ArvVar *arvv_cria(char c);

/* Insere o nó 'sa' como primeiro filho do nó 'a'. */
void arvv_insere(ArvVar *a, ArvVar *sa);

/* Imprime a árvore no formato <x ...> onde x é o caractere do nó. */
void arvv_imprime(ArvVar *a);

/* Retorna 1 se o caractere c pertence à árvore, 0 caso contrário. */
int arvv_pertence(ArvVar *a, char c);

/* Libera toda a memória ocupada pela árvore. */
void arvv_libera(ArvVar *a);

#endif /* ARVVAR_H */
