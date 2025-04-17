#include <stdio.h>
#include <stdlib.h>

// Estrutura do nó da pilha
typedef struct Node {
    int dado;              // valor armazenado no nó
    struct Node* prox;     // ponteiro para o próximo nó
} Node;

// Função para empilhar (push)
void push(Node** topo, int valor) {
    Node* novo = (Node*)malloc(sizeof(Node));  // Aloca dinamicamente um novo nó

    if (novo == NULL) {
        printf("Erro de alocação de memória!\n");
        return;
    }

    novo->dado = valor;     // Armazena o valor no novo nó
    novo->prox = *topo;     // O próximo do novo nó é o atual topo da pilha
    *topo = novo;           // Atualiza o topo para o novo nó
}

// Função para desempilhar (pop)
int pop(Node** topo) {
    if (*topo == NULL) {
        printf("Pilha vazia!\n");
        return -1;  // Valor de erro
    }

    Node* temp = *topo;      // Guarda o nó do topo atual
    int valor = temp->dado;  // Pega o valor do topo
    *topo = temp->prox;      // Atualiza o topo com o próximo nó
    free(temp);              // Libera a memória do antigo topo

    return valor;
}

// Função para imprimir a pilha
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

    // Testando as operações
    push(&pilha, 10);
    push(&pilha, 20);
    push(&pilha, 30);

    imprimir(pilha); // Deve mostrar: 30 20 10

    printf("Elemento removido: %d\n", pop(&pilha)); // Remove 30
    imprimir(pilha); // Deve mostrar: 20 10

    return 0;
}

