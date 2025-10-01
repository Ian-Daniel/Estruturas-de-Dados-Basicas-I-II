#include <stdio.h>
#include <stdlib.h>

typedef struct No {
    int valor;
    struct No *esq, *dir;
} No;

------------------------------------------------------

No* novoNo(int v) {
    No* n = (No*) malloc(sizeof(No));
    if (!n) { perror("malloc"); exit(EXIT_FAILURE); }
    n->valor = v;
    n->esq = n->dir = NULL;
    return n;
}

------------------------------------------------------

No* inserir(No* r, int v) {
    if (r == NULL) return novoNo(v);
    if (v < r->valor)      r->esq = inserir(r->esq, v);
    else if (v > r->valor) r->dir = inserir(r->dir, v);
    return r;
}

------------------------------------------------------

No* buscar(No* r, int v) {
    if (r == NULL || r->valor == v) return r;
    return (v < r->valor) ? buscar(r->esq, v) : buscar(r->dir, v);
}

------------------------------------------------------

void emOrdem(No* r) {
    if (r == NULL) return;
    emOrdem(r->esq);
    printf("%d ", r->valor);
    emOrdem(r->dir);
}

------------------------------------------------------

No* maiorNo(No* r) {
    No* atual = r;
    while (atual && atual->dir) atual = atual->dir;
    return atual;
}

------------------------------------------------------

No* remover(No* r, int v) {
    if (r == NULL) return NULL;

    if (v < r->valor) {
        r->esq = remover(r->esq, v);
    } else if (v > r->valor) {
        r->dir = remover(r->dir, v);
    } else {
        if (r->esq == NULL && r->dir == NULL) {
            free(r);
            return NULL;
        } else if (r->esq == NULL) {
            No* tmp = r->dir;
            free(r);
            return tmp;
        } else if (r->dir == NULL) {
            No* tmp = r->esq;
            free(r);
            return tmp;
        } else {
            No* pred = maiorNo(r->esq);
            r->valor = pred->valor;
            r->esq = remover(r->esq, pred->valor);
        }
    }
    return r;
}

------------------------------------------------------

void liberarArvore(No* r) {
    if (!r) return;
    liberarArvore(r->esq);
    liberarArvore(r->dir);
    free(r);
}

------------------------------------------------------

int main(void) {
    int valores[] = {8, 3, 10, 1, 6, 14, 4, 7, 13};
    int n = (int)(sizeof(valores) / sizeof(valores[0]));

    No* raiz = NULL;
    for (int i = 0; i < n; ++i) raiz = inserir(raiz, valores[i]);

    printf("Em-ordem (ordenado): ");
    emOrdem(raiz);
    printf("\n");

    int x = 7;
    printf("Buscando %d... %s\n", x, buscar(raiz, x) ? "encontrado" : "nao encontrado");

    raiz = remover(raiz, 1);
    raiz = remover(raiz, 14);
    raiz = remover(raiz, 3);

    printf("Em-ordem após remoções: ");
    emOrdem(raiz);
    printf("\n");

    liberarArvore(raiz);
    return 0;
}

