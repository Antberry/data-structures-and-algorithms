package breadthfirst;

import graph.Edge;
import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    private Node<String> initialize(){
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        HashSet<Edge> neighbor1 = new HashSet<Edge>();
        neighbor1.add(node2);
        neighbor1.add(node5);
        node1.setNeighbors(neighbor1);
        HashSet<Edge> neighbor2 = new HashSet<Edge>();
        neighbor2.add(node1);
        neighbor2.add(node3);
        node2.setNeighbors(neighbor2);
        HashSet<Edge> neighbor3 = new HashSet<Edge>();
        neighbor3.add(node2);
        neighbor3.add(node4);
        node3.setNeighbors(neighbor3);
        HashSet<Edge> neighbor4 = new HashSet<Edge>();
        neighbor4.add(node3);
        neighbor4.add(node5);
        node4.setNeighbors(neighbor4);
        HashSet<Edge> neighbor5 = new HashSet<Edge>();
        neighbor5.add(node1);
        node5.setNeighbors(neighbor5);
        return node1;
    }

    @Test(expected = NullPointerException.class)
    public void emptygraphTest(){
        Graph graph = new Graph();
        graph.BreathFirst(null);
    }

    @Test
    public void oneNodeTest(){
        Graph graph = new Graph();
        Node anthonyNode = graph.addNode("Anthony") ;
        ArrayList<Node> expected = new ArrayList<Node>();
        expected.add(new Node("Anthony"));
        assertArrayEquals(expected.toArray(), graph.BreathFirst(anthonyNode).toArray());


    }

}