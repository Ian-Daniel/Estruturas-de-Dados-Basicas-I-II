#include <stdio.h>
#include <stdlib.h>

// Estrutura para representar um nó da lista ligada.
typedef struct Node
{
    char c;
    struct Node *next;
} Node;

// Cria um novo nó com o caractere informado.
Node *criarNo(char c)
{
    Node *novo = (Node *)malloc(sizeof(Node));
    novo->c = c;
    novo->next = NULL;
    return novo;
}

// Insere um nó no final da lista.
void inserirFim(Node **head, char c)
{
    Node *novo = criarNo(c);
    if (*head == NULL)
    {
        *head = novo;
    }
    else
    {
        Node *aux = *head;
        while (aux->next != NULL)
            aux = aux->next; // Percorre até o último nó.
        aux->next = novo;    // Liga o novo nó ao final.
    }
}

// Função que percorre a lista e comprime caracteres consecutivos.
void comprimir(Node *head)
{
    Node *aux = head;
    while (aux != NULL)
    {
        char atual = aux->c;
        int count = 0;

        // Conta quantas vezes ele aparece consecutivamente.
        while (aux != NULL && aux->c == atual)
        {
            count++;
            aux = aux->next;
        }

        // Imprime o caractere seguido da contagem.
        printf("%c%d", atual, count);
    }
    printf("\n");
}

int main()
{
    char str[100];
    printf("Digite a string: ");
    scanf("%s", str);

    Node *head = NULL;
    // Constrói a lista ligada a partir da string.
    for (int i = 0; str[i] != '\0'; i++)
    {
        inserirFim(&head, str[i]);
    }

    printf("String comprimida: ");
    comprimir(head);

    return 0;
}