package graph;

public class Edge {
    int weight;
    public Node node;

    public Edge(int weight, Node node){
        this.weight = weight;
        this.node = node;
    }

    public Edge() {
    }
}
