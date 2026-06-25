import estrutura.arvore.ArvoreBinaria;
import estrutura.fila.Fila;
import estrutura.lista.ListaDuplamenteEncadeada;
import estrutura.lista.ListaEncadeada;
import estrutura.pilha.Pilha;

public class Main {
    public static void main(String[] args) {
        testarListaEncadeada();
        testarListaDuplamenteEncadeada();
        testarPilha();
        testarFila();
        testarArvoreBinaria();
    }

    private static void testarListaEncadeada() {
        System.out.println("========== LISTA ENCADEADA ==========");

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserirNoFim(1);
        lista.inserirNoFim(2);
        lista.inserirNoInicio(0);
        lista.remover(1);

        System.out.println("Lista apos inserir 1, 2, inserir 0 no inicio e remover 1:");
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Contem o valor 2? " + lista.contem(2));
        System.out.println("Contem o valor 1? " + lista.contem(1));
        System.out.println();
    }

    private static void testarListaDuplamenteEncadeada() {
        System.out.println("====== LISTA DUPLAMENTE ENCADEADA ======");

        ListaDuplamenteEncadeada<Integer> lista1 = new ListaDuplamenteEncadeada<>();
        ListaDuplamenteEncadeada<Integer> lista2 = new ListaDuplamenteEncadeada<>();

        lista1.inserirNoFim(1);
        lista1.inserirNoFim(2);

        lista2.inserirNoFim(3);
        lista2.inserirNoFim(4);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        lista1.concatenar(lista2);

        System.out.println("Lista concatenada: " + lista1);
        System.out.println("Travessia reversa: " + lista1.travessiaReversa());
        System.out.println();
    }

    private static void testarPilha() {
        System.out.println("=============== PILHA ===============");

        Pilha<String> pilha = new Pilha<>();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println("Pilha apos inserir A, B e C:");
        System.out.println(pilha);
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo topo: " + pilha.pop());
        System.out.println("Pilha apos remocao: " + pilha);
        System.out.println("Tamanho: " + pilha.tamanho());
        System.out.println("Esta vazia? " + pilha.vazia());
        System.out.println();
    }

    private static void testarFila() {
        System.out.println("================ FILA ================");

        Fila<String> fila = new Fila<>();

        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");

        System.out.println("Fila apos inserir A, B e C:");
        System.out.println(fila);
        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Removendo primeiro: " + fila.dequeue());
        System.out.println("Fila apos remocao: " + fila);
        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Esta vazia? " + fila.vazia());
        System.out.println();
    }

    private static void testarArvoreBinaria() {
        System.out.println("=========== ARVORE BINARIA ===========");

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        int[] valores = {5, 3, 7, 1, 4, 6, 8};

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.println("Valores inseridos: 5, 3, 7, 1, 4, 6, 8");
        System.out.println("Percurso em ordem: " + arvore.emOrdem());
        System.out.println("Buscar valor 6: " + arvore.buscar(6));
        System.out.println("Buscar valor 9: " + arvore.buscar(9));
        System.out.println();
    }
}
