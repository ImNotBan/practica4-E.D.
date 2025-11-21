package BINARY_TREE;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MyPriorityQueue<E extends Comparable<? super E>> {

    private ArrayList<E> heap = new ArrayList<>();
    private int heapSize = 0;

    public boolean add(E x){
        heap.add(x);
        heapSize++;

        int i = heapSize - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i).compareTo(heap.get(parent)) < 0) {
                // intercanviem fill i pare
                E temp = heap.get(i);
                heap.set(i, heap.get(parent));
                heap.set(parent, temp);
                i = parent; // pugem
            } else {
                break; // ja compleix la propietat
            }
        }

        return true;

    }

    boolean isEmpty(){
        if (heapSize == 0){
            return true;
        }
        return false;
    }
}
