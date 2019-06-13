package stacksandqueues;


public class Node {
    Object data;
    Node next;

    public Node (Object val){
        this.data =  val;
        this.next = null;
    }

    public Node (Object data, Node next){
        this.data = data;
        this.next = next;
    }
}
