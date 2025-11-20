package BINARY_TREE;

public class Documento implements Comparable<Documento> {

    private int priority;   // prioritat del document
    private String name;

    // constructor
    public Documento(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    // funcions que venen de la interficie

    @Override
    public int compareTo(Documento other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Document de " + name + " amb prioritat: " + priority;
    }

}
