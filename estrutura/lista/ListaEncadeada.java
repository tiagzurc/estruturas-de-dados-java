package estrutura.lista;
import estrutura.node.Node;
public class ListaEncadeada<T> {
    private Node<T> head;
    private int size;

    public void inserirNoFim(T valor) {
        Node<T> novo = new Node<>(valor);
        if (head == null) {
            head = novo;
        } else {
            Node<T> atual = head;
            while (atual.next != null) atual = atual.next;
            atual.next = novo;
        }
        size++;
    }

    public void inserirNoInicio(T valor) {
        Node<T> novo = new Node<>(valor);
        novo.next = head;
        head = novo;
        size++;
    }

    public void remover(T valor) {
        if (head == null) return;
        if (head.valor.equals(valor)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> atual = head;
        while (atual.next != null && !atual.next.valor.equals(valor)) {
            atual = atual.next;
        }
        if (atual.next != null) {
            atual.next = atual.next.next;
            size--;
        }
    }

    public boolean contem(T valor) {
        Node<T> atual = head;
        while (atual != null) {
            if (atual.valor.equals(valor)) return true;
            atual = atual.next;
        }
        return false;
    }

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
