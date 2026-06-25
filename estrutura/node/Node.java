package estrutura.node;

public class Node<T> {
    public T valor;
    public Node<T> next;
    public Node<T> prev;

        public Node(T valor) {
        this.valor = valor;
        this.next = null;
        this.prev = null;
    }
}
