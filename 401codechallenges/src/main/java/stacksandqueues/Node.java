package stacksandqueues;


public class Node {
    int data;
    Node next;

    public Node (int val){
        this.data =  val;
        this.next = null;
    }

    public Node (int data, Node next){
        this.data = data;
        this.next = next;
    }
}
