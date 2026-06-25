package estrutura.arvore;
import estrutura.node.Node;


public class ArvoreBinaria<T extends Comparable<T>> {
    private Node<T> raiz;

    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor);
    }
    private Node<T> inserirRec(Node<T> atual, T valor) {
        if (atual == null) return new Node<>(valor);
        if (valor.compareTo(atual.valor) < 0)
            atual.next = inserirRec(atual.next, valor); 
        else if (valor.compareTo(atual.valor) > 0)
            atual.prev = inserirRec(atual.prev, valor); 
        return atual;
    }


    public boolean buscar(T valor) {
        Node<T> atual = raiz;
        while (atual != null) {
            int cmp = valor.compareTo(atual.valor);
            if (cmp == 0) return true;
            atual = (cmp < 0) ? atual.next : atual.prev;
        }
        return false;
    }

    public String emOrdem() {
        StringBuilder sb = new StringBuilder("[");
        emOrdemRec(raiz, sb);
        if (sb.length() > 1) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
    private void emOrdemRec(Node<T> atual, StringBuilder sb) {
        if (atual == null) return;
        emOrdemRec(atual.next, sb); // esquerda
        sb.append(atual.valor).append(", ");
        emOrdemRec(atual.prev, sb); // direita
    }

   }
