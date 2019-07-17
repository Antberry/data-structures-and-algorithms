package graph;

import java.util.HashSet;
import java.util.Optional;

public class Node<T> extends Edge {
    T value;
    public HashSet<Edge> neighbors;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashSet<Edge> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashSet<Edge> neighbors) {
        this.neighbors = neighbors;
    }

    public Node(T value){
        this.value = value;
        this.neighbors = new HashSet<Edge>();
    }
}
