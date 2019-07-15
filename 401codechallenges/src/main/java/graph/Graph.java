package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Graph {
    HashSet<Node> graphNodes;

    public Graph(){
       this.graphNodes = new HashSet<>();
    }

    public Node addNode(Node node){
        this.graphNodes.add(node);

        return node;
    }

    public void addEdge(Node node1, Node node2, int weight){
        Edge edge = new Edge(weight, node2);
        node1.neighbors.add(edge);
        Edge edge2 = new Edge(weight, node1);
        node2.neighbors.add(edge2);

    }

    public HashSet<Node> getNodes(){

        return this.graphNodes;
    }

    public HashSet<Node> getNeighbors(Node node){

        return node.neighbors;
    }

    public int size(){
        return this.graphNodes.size();
    }
}
