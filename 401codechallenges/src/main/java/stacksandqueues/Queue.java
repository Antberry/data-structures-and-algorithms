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

    public void enqueue(int val){
        if(front == null){
            throw new EmptyStackException();
        } else {
            Node lastNode = new Node(val);
            lastNode = back.next;
            back = lastNode;
            back.next = null;
            numsEnqueue++;
        }
    }

    public int dequeue(){
        if(front == null){
            throw new EmptyStackException();
        } else {
            Node firstNode = front;
            Node tempNode = firstNode.next;
            front = tempNode;
            numsEnqueue--;
            return firstNode.data ;
        }
    }

    public int peek(){
        if(front == null){
            throw new EmptyStackException();
        }
            return front.data;
    }
}
