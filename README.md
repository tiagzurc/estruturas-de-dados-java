# StructureJava

Projeto desenvolvido para a disciplina **Estrutura de Dados I** do curso de **Análise e Desenvolvimento de Sistemas - UNIUBE**, no semestre **2026/1**, sob orientação do professor **Igor Junqueira**.

## Alunos

* Anderson Nascimento
* Igor Gabriel Rodrigues
* Tiago de Oliveira Cruz

## Descrição do Projeto

O **StructureJava** é uma biblioteca Java independente desenvolvida com o objetivo de implementar estruturas de dados de forma própria, sem utilizar classes prontas do pacote `java.util`, como `ArrayList`, `LinkedList`, `Stack` ou `Queue`.

O projeto tem como foco compreender o funcionamento interno das estruturas de dados, utilizando alocação dinâmica, nós encadeados e manipulação de referências em Java.

## Estruturas Implementadas

O projeto contém as seguintes estruturas de dados:

* Lista simplesmente encadeada
* Lista duplamente encadeada
* Pilha
* Fila
* Árvore binária de busca

## Funcionalidades

Entre as principais operações implementadas estão:

* Inserção de elementos
* Remoção de elementos
* Busca de valores
* Verificação de tamanho
* Inserção no início
* Inserção no fim
* Inserção ordenada
* Inversão de lista
* Concatenação de estruturas
* Operações LIFO em pilha
* Operações FIFO em fila
* Inserção e busca em árvore binária
* Percurso em ordem na árvore binária

## Organização do Projeto

O projeto foi organizado em pacotes para facilitar a manutenção, leitura e reutilização do código.

Estrutura básica:

```text
StructureJava
│
├── estrutura
│   ├── arvore
│   │   └── ArvoreBinaria.java
│   │
│   ├── fila
│   │   └── Fila.java
│   │
│   ├── lista
│   │   ├── ListaEncadeada.java
│   │   └── ListaDuplamenteEncadeada.java
│   │
│   ├── node
│   │   └── Node.java
│   │
│   └── pilha
│       └── Pilha.java
│
└── teste
    └── Main.java
```

## Classe de Teste

A classe `Main.java` foi criada para demonstrar o funcionamento das estruturas implementadas.

Ela realiza testes com:

* Lista encadeada
* Lista duplamente encadeada
* Pilha
* Fila
* Árvore binária de busca

## Como Compilar

No terminal, acesse a pasta principal do projeto e execute:

```bash
javac teste/Main.java estrutura/arvore/*.java estrutura/fila/*.java estrutura/lista/*.java estrutura/node/*.java estrutura/pilha/*.java
```

## Como Executar

Após compilar, execute:

```bash
java -cp ".;teste" Main
```

No Linux ou macOS, use:

```bash
java -cp ".:teste" Main
```

## Exemplo de Saída

```text
========== LISTA ENCADEADA ==========
Lista após inserir 1, 2, inserir 0 no início e remover 1:
[0, 2]
Tamanho: 2
Contém o valor 2? true

========== LISTA DUPLAMENTE ENCADEADA ==========
Lista após concatenação:
[1, 2, 3, 4]
Travessia reversa:
[4, 3, 2, 1]

========== PILHA ==========
Topo da pilha: B
Removendo elemento: B
Pilha atual:
[A]

========== FILA ==========
Primeiro da fila: A
Removendo elemento: A
Fila atual:
[B]

========== ÁRVORE BINÁRIA ==========
Percurso em ordem:
[1, 3, 4, 5, 6, 7, 8]
Buscar valor 6: true
Buscar valor 9: false
```

## Análise de Complexidade

| Estrutura                  |         Inserção |          Remoção |            Busca | Observação                          |
| -------------------------- | ---------------: | ---------------: | ---------------: | ----------------------------------- |
| Lista Encadeada            |     O(1) ou O(n) |     O(1) ou O(n) |             O(n) | Depende da posição da operação      |
| Lista Duplamente Encadeada |     O(1) ou O(n) |     O(1) ou O(n) |             O(n) | Permite percurso nos dois sentidos  |
| Pilha                      |             O(1) |             O(1) |             O(n) | Operações principais no topo        |
| Fila                       |             O(1) |             O(1) |             O(n) | Inserção no fim e remoção no início |
| Árvore Binária de Busca    | O(log n) ou O(n) | O(log n) ou O(n) | O(log n) ou O(n) | Depende do balanceamento da árvore  |

## Requisitos Atendidos

* Implementação própria das estruturas de dados
* Não utilização das classes prontas do pacote `java.util`
* Uso de alocação dinâmica por meio de nós
* Implementação de pilha e fila
* Implementação de listas encadeadas
* Implementação de estrutura adicional: árvore binária de busca
* Classe `Main.java` com exemplos de uso
* Código organizado em pacotes
* Documentação com JavaDoc nos métodos públicos

## Tecnologias Utilizadas

* Java
* JDK 25
* Visual Studio Code
* GitHub

## Observação

O projeto é acadêmico e foi desenvolvido para demonstrar o funcionamento interno das principais estruturas de dados estudadas na disciplina de **Estrutura de Dados I**.
