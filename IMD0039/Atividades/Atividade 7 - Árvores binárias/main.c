#include <stdio.h>
#include "arvore.h"

int main(void) {
    /* Criando a árvore:
           a
          / \
         b   c
          \ / \
           d e f
    */
    Arv *a = arv_cria('a',
                arv_cria('b',
                    arv_criavazia(),
                    arv_cria('d', arv_criavazia(), arv_criavazia())
                ),
                arv_cria('c',
                    arv_cria('e', arv_criavazia(), arv_criavazia()),
                    arv_cria('f', arv_criavazia(), arv_criavazia())
                )
            );

    printf("Impressão da árvore: ");
    arv_imprime(a);
    printf("\n");

    printf("Pertence 'e'? %d\n", arv_pertence(a, 'e'));
    printf("Pertence 'z'? %d\n", arv_pertence(a, 'z'));

    a = arv_libera(a);
    return 0;
}
