package queueWithStacks;

import stacksandqueues.Stack;

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    int temp ;

    public void enqueue(int val){
        stack1.push(val);
    }

    public int dequeue() {
        for (int i = 1; i < stack1.getStackSize(); i++) {
            stack2.push(stack1.pop());
        }
        temp = stack2.pop();

        for (int i = 1; i < stack2.getStackSize(); i++) {
            stack1.push(stack2.pop());
        }
        return temp;
    }
}
