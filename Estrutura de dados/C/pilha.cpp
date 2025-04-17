#include <stdio.h>
#include <stdlib.h>

// Estrutura do n� da pilha
typedef struct Node {
    int dado;              // valor armazenado no n�
    struct Node* prox;     // ponteiro para o pr�ximo n�
} Node;

// Fun��o para empilhar (push)
void push(Node** topo, int valor) {
    Node* novo = (Node*)malloc(sizeof(Node));  // Aloca dinamicamente um novo n�

    if (novo == NULL) {
        printf("Erro de aloca��o de mem�ria!\n");
        return;
    }

    novo->dado = valor;     // Armazena o valor no novo n�
    novo->prox = *topo;     // O pr�ximo do novo n� � o atual topo da pilha
    *topo = novo;           // Atualiza o topo para o novo n�
}

// Fun��o para desempilhar (pop)
int pop(Node** topo) {
    if (*topo == NULL) {
        printf("Pilha vazia!\n");
        return -1;  // Valor de erro
    }

    Node* temp = *topo;      // Guarda o n� do topo atual
    int valor = temp->dado;  // Pega o valor do topo
    *topo = temp->prox;      // Atualiza o topo com o pr�ximo n�
    free(temp);              // Libera a mem�ria do antigo topo

    return valor;
}

// Fun��o para imprimir a pilha
void imprimir(Node* topo) {
    printf("Pilha: ");
    while (topo != NULL) {
        printf("%d ", topo->dado);
        topo = topo->prox;
    }
    printf("\n");
}

int main() {
    Node* pilha = NULL;

    // Testando as opera��es
    push(&pilha, 10);
    push(&pilha, 20);
    push(&pilha, 30);

    imprimir(pilha); // Deve mostrar: 30 20 10

    printf("Elemento removido: %d\n", pop(&pilha)); // Remove 30
    imprimir(pilha); // Deve mostrar: 20 10

    return 0;
}

