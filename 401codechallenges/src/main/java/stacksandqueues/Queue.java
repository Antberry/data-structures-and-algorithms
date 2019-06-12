package stacksandqueues;

import java.util.EmptyStackException;
import java.util.Objects;

public class Queue<T> {
    private int numsEnqueue;
    private Node front;
    private Node back;

    public Queue(){
        front = null;
        back = null;
        numsEnqueue = 0;
    }

    public Node getFront() {
        return front;
    }

    public Node getBack() {
        return back;
    }

    public int getNumsEnqueue() {
        return numsEnqueue;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public void setNumsEnqueue(int numsEnqueue) {
        this.numsEnqueue = numsEnqueue;
    }

    public void enqueue(Object val){
        if(front == null){

            Node input = new Node(val);
            front = input;
            back = input;
            numsEnqueue++;
        } else {
            Node lastNode = new Node(val);
            back.next = lastNode;
            back = lastNode;
            numsEnqueue++;
        }
    }

    public Object dequeue(){
        if(front == null){
            return Integer.parseInt(null);
        } else {
            Node firstNode = front;
            front = front.next;
            firstNode.next = null;
            numsEnqueue--;
            return firstNode.data ;
        }
    }

    public Object peek(){
        if(front == null){
            return Integer.parseInt(null);
        }
            return front.data;
    }
}
