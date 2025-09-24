#include <stdio.h>
#include <stdlib.h>

// Estrutura de nó da lista ligada.
typedef struct Node {
    char c;            
    struct Node *next;
} Node;

// Cria um novo nó com um caractere.
Node* criarNo(char c) {
    Node* novo = (Node*) malloc(sizeof(Node));
    novo->c = c;
    novo->next = NULL;
    return novo;
}

// Insere caractere no final da lista.
void inserirFim(Node **head, char c) {
    Node* novo = criarNo(c);
    if (*head == NULL) {
        *head = novo;
    } else {
        Node* aux = *head;
        while (aux->next != NULL) aux = aux->next; // Vai até o final da lista.
        aux->next = novo;
    }
}

// Aplica a cifra de César (+3 posições) e imprime o resultado.
void cifraDeCesar(Node *head) {
    Node* aux = head;
    while (aux != NULL) {
        char c = aux->c;

        // Se for letra maiúscula.
        if (c >= 'A' && c <= 'Z') {
            c = (c - 'A' + 3) % 26 + 'A';
        }
        // Se for letra minúscula.
        else if (c >= 'a' && c <= 'z') {
            c = (c - 'a' + 3) % 26 + 'a';
        }

        printf("%c", c);
        aux = aux->next;
    }
    printf("\n");
}

int main() {
    char str[100];
    printf("Digite a string: ");
    fgets(str, 100, stdin); // Permite ler espaços também.

    Node* head = NULL;
    // Constrói a lista ligada a partir da string.
    for (int i = 0; str[i] != '\0' && str[i] != '\n'; i++) {
        inserirFim(&head, str[i]);
    }

    printf("Cifrada: ");
    cifraDeCesar(head);

    return 0;
}