package stacksandqueues;

import java.util.EmptyStackException;
import java.util.Objects;

public class Queue {
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

    public void enqueue(int val){
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

    public int dequeue(){
        if(front == null){
            return 0;
        } else {
            Node firstNode = front;
            front = front.next;
            firstNode.next = null;
            numsEnqueue--;
            return firstNode.data ;
        }
    }

    public int peek(){
        if(front == null){
            return 0;
        }
            return front.data;
    }
}
