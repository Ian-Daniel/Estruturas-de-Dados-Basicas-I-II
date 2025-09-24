#ifndef ARVORE_H
#define ARVORE_H

typedef struct arv {
    char info;
    struct arv *esq;
    struct arv *dir;
} Arv;

/* Protótipos */
Arv *arv_criavazia(void);
Arv *arv_cria(char c, Arv *sae, Arv *sad);
Arv *arv_libera(Arv *a);
int arv_vazia(Arv *a);
int arv_pertence(Arv *a, char c);
void arv_imprime(Arv *a);

#endif
