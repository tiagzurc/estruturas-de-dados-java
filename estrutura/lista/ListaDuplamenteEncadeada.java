package estrutura.lista;
import estrutura.node.Node;

public class ListaDuplamenteEncadeada<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void inserirNoFim(T valor) {
        Node<T> novo = new Node<>(valor);
        if (head == null) {
            head = tail = novo;
        } else {
            tail.next = novo;
            novo.prev = tail;
            tail = novo;
        }
        size++;
    }

    public void concatenar(ListaDuplamenteEncadeada<T> outra) {
        if (outra.head == null) return;
        if (this.tail == null) {
            this.head = outra.head;
            this.tail = outra.tail;
        } else {
            this.tail.next = outra.head;
            outra.head.prev = this.tail;
            this.tail = outra.tail;
        }
        this.size += outra.size;
    }

    public String travessiaReversa() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = tail;
        while (atual != null) {
            sb.append(atual.valor);
            if (atual.prev != null) sb.append(", ");
            atual = atual.prev;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = head;
        while (atual != null) {
            sb.append(atual.valor);
            if (atual.next != null) sb.append(", ");
            atual = atual.next;
        }
        sb.append("]");
        return sb.toString();
    }

    
}
