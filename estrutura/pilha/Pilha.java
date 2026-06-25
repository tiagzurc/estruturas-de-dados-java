package estrutura.pilha;
import estrutura.node.Node;

public class Pilha<T> {
    private Node<T> topo;
    private int size;

        public void push(T valor) {
        Node<T> novo = new Node<>(valor);
        novo.next = topo;
        topo = novo;
        size++;
    }

    public T pop() {
        if (topo == null) throw new IllegalStateException("Pilha vazia");
        T valor = topo.valor;
        topo = topo.next;
        size--;
        return valor;
    }

    
    public T peek() {
        if (topo == null) throw new IllegalStateException("Pilha vazia");
        return topo.valor;
    }

    public boolean vazia() { return topo == null; }
    public int tamanho() { return size; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = topo;
        while (atual != null) {
            sb.append(atual.valor);
            if (atual.next != null) sb.append(", ");
            atual = atual.next;
        }
        sb.append("]");
        return sb.toString();
    }

    }
