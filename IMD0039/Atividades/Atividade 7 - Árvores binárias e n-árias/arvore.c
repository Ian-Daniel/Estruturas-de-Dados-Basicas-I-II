#include <stdio.h>
#include <stdlib.h>
#include "arvore.h"

Arv *arv_criavazia(void)
{
    return NULL;
}

Arv *arv_cria(char c, Arv *sae, Arv *sad)
{
    Arv *p = (Arv *)malloc(sizeof(Arv));
    p->info = c;
    p->esq = sae;
    p->dir = sad;
    return p;
}

Arv *arv_libera(Arv *a)
{
    if (!arv_vazia(a))
    {
        arv_libera(a->esq);
        arv_libera(a->dir);
        free(a);
    }
    return NULL;
}

int arv_vazia(Arv *a)
{
    return a == NULL;
}

int arv_pertence(Arv *a, char c)
{
    if (arv_vazia(a))
        return 0;
    else
        return a->info == c ||
               arv_pertence(a->esq, c) ||
               arv_pertence(a->dir, c);
}

void arv_imprime(Arv *a)
{
    if (!arv_vazia(a))
    {
        printf("%c ", a->info);
        arv_imprime(a->esq);
        arv_imprime(a->dir);
    }
}