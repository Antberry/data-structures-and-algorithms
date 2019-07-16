package breadthfirst;

import graph.Edge;
import graph.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

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

}
