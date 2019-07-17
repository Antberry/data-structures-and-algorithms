package graph;

import java.util.*;

public class Graph {
    HashSet<Node> graphNodes;

    public Graph(){
       this.graphNodes = new HashSet<>();
    }

    public Node addNode(String value){
        Node newNode = new Node(value);
        this.graphNodes.add(newNode);

        return newNode;
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

    public ArrayList<Node> BreathFirst(Node node){
        ArrayList<Node> visited = new ArrayList<Node>();
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(node);
        visited.add(node);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            HashSet<Edge> edges = temp.neighbors;
            for(Edge edge: edges){
                if(!visited.contains(edge.node)){
                    queue.add(edge.node);
                    visited.add(edge.node);
                }
            }


        }

        return visited;
    }

    public String getEdge(Edge edge){


        return string;
    }
}
