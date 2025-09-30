#include <stdio.h>
#include "arvvar.h"

int main(void)
{
    /* Cria nós como folhas */
    ArvVar *a = arvv_cria('a');
    ArvVar *b = arvv_cria('b');
    ArvVar *c = arvv_cria('c');
    ArvVar *d = arvv_cria('d');
    ArvVar *e = arvv_cria('e');
    ArvVar *f = arvv_cria('f');
    ArvVar *g = arvv_cria('g');
    ArvVar *h = arvv_cria('h');
    ArvVar *i = arvv_cria('i');
    ArvVar *j = arvv_cria('j');

    /* Monta a hierarquia (mesma ordem do arquivo enviado) */
    arvv_insere(c, d);
    arvv_insere(b, e);
    arvv_insere(b, c);
    arvv_insere(i, j);
    arvv_insere(g, i);
    arvv_insere(g, h);
    arvv_insere(a, g);
    arvv_insere(a, f);
    arvv_insere(a, b);

    /* Imprime a árvore */
    printf("Árvore impressa (formato <nó filhos...>):\n");
    arvv_imprime(a);
    printf("\n\n");

    /* Testa pertence */
    printf("Testes de pertence:\n");
    printf("Existe 'e' na árvore? %s\n", arvv_pertence(a, 'e') ? "Sim" : "Nao");
    printf("Existe 'z' na árvore? %s\n", arvv_pertence(a, 'z') ? "Sim" : "Nao");

    /* Libera memória */
    arvv_libera(a);

    return 0;
}
