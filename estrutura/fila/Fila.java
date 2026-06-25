package estrutura.fila;
import estrutura.node.Node;

public class Fila<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void enqueue(T valor) {
        Node<T> novo = new Node<>(valor);
        if (tail == null) {
            head = tail = novo;
        } else {
            tail.next = novo;
            tail = novo;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) throw new IllegalStateException("Fila vazia");
        T valor = head.valor;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return valor;
    }

    public T peek() {
        if (head == null) throw new IllegalStateException("Fila vazia");
        return head.valor;
    }

    public boolean vazia() { return head == null; }
    public int tamanho() { return size; }

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
