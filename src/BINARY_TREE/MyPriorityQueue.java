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

    public E remove(){
        if(heap.isEmpty()){
            return null;
        }

        E min = heap.get(0); // guardem el minim
        E last = heap.remove(heapSize - 1); // eliminem ultim

        if (!heap.isEmpty()) {
            heap.set(0, last);
            int i = 0;

            boolean done = false;
            while (!done) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                int smallest = i;

                if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) {
                    smallest = left;
                }
                if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) {
                    smallest = right;
                }

                if (smallest != i) {
                    E temp = heap.get(i);
                    heap.set(i, heap.get(smallest));
                    heap.set(smallest, temp);
                    i = smallest;
                } else {
                    done = true;
                }
            }
        }

        return min;

    }

    boolean isEmpty(){
        if (heapSize == 0){
            return true;
        }
        return false;
    }

    public int size () {
        return heapSize;
    }
}
