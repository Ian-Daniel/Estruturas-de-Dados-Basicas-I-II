#ifndef AVL_H
#define AVL_H

typedef struct No
{
    int dado;
    struct No *esquerdo;
    struct No *direito;
    int altura;
} No;

int obter_altura(No *no);
int calcular_fator_de_balanceamento(No *no);
No *criar_no(int dado);
No *rotacao_direita(No *y);
No *rotacao_esquerda(No *x);
No *inserir_no(No *no, int dado);
No *menor_valorNo(No *no);
No *remover_no(No *raiz, int dado);
void imprimir_em_ordem(No *raiz);

#endif // AVL_H.