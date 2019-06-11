package stacksandqueues;

import java.util.EmptyStackException;

public class Stack<Integer> {
    private int stackSize;
    private Node top;

    public Stack(){
        top = null;
        stackSize = 0;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public void push(int val){

        if(top == null){
           top = new Node(val);
           stackSize++;
        } else {
           Node newNode = new Node(val);
           Node temp = top;
           top = newNode;
           top.next = temp;
           stackSize++;
        }
    }


    public int pop(){

        try {
            if(top !=null) {
                Node tempNode = top;
                top = top.next;
                tempNode.next = null;
                stackSize--;
                return tempNode.data;
            }

        } catch (Exception error){
            System.err.println("Error has occured");
        }
        return java.lang.Integer.parseInt(null);
    }



    public int peek(){
        if(top == null){
            return java.lang.Integer.parseInt(null);
        } else {
            return top.data;
        }

    }
}
