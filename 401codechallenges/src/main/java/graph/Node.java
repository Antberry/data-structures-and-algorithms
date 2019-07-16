package graph;

import java.util.HashSet;
import java.util.Optional;

public class Node<T> {
    T value;
    public HashSet<Edge> neighbors;

    public Node(T value){
        this.value = value;
        this.neighbors = new HashSet<Edge>();
    }
}
