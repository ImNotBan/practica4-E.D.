package BINARY_TREE;

public interface PriorityQueueInterface<E> {

    boolean add(E x);

    E remove();

    String toString();

    // metode auxiliar per saber si el heap te elements
    boolean isEmpty();

    // metode auxiliar simplement per fer testos i veure on resideixen els errors
    int size();
}
