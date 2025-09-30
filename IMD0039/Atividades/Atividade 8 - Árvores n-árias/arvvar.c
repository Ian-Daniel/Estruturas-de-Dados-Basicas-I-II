#include "arvvar.h"
#include <stdio.h>
#include <stdlib.h>

struct arvvar {
    char info;
    struct arvvar *primeiro; /* primeiro filho */
    struct arvvar *proximo;  /* próximo irmão */
};

ArvVar *arvv_cria(char c)
{
    ArvVar *a = (ArvVar *) malloc(sizeof(ArvVar));
    if(!a) return NULL;
    a->info = c;
    a->primeiro = NULL;
    a->proximo = NULL;
    return a;
}

void arvv_insere(ArvVar *a, ArvVar *sa)
{
    if (a == NULL || sa == NULL) return;
    sa->proximo = a->primeiro;
    a->primeiro = sa;
}

void arvv_imprime(ArvVar *a)
{
    if (a == NULL) return;
    /* Imprime nó corrente e depois recorre aos filhos */
    printf("<%c", a->info);
    for (ArvVar *p = a->primeiro; p != NULL; p = p->proximo) {
        putchar(' ');
        arvv_imprime(p);
    }
    printf(">");
}

int arvv_pertence(ArvVar *a, char c)
{
    if (a == NULL) return 0;
    if (a->info == c) return 1;
    for (ArvVar *p = a->primeiro; p != NULL; p = p->proximo) {
        if (arvv_pertence(p, c)) return 1;
    }
    return 0;
}

void arvv_libera(ArvVar *a)
{
    if (a == NULL) return;
    ArvVar *p = a->primeiro;
    while (p != NULL) {
        ArvVar *t = p->proximo;
        arvv_libera(p);
        p = t;
    }
    free(a);
}
