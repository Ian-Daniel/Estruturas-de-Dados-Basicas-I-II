#ifndef ABB_H
#define ABB_H

typedef struct No
{
    int valor;
    struct No *esq, *dir;
} No;

No *novoNo(int v);
No *inserir(No *r, int v);
No *buscar(No *r, int v);
void emOrdem(No *r);
No *maiorNo(No *r);
No *remover(No *r, int v);
void liberarArvore(No *r);

#endif