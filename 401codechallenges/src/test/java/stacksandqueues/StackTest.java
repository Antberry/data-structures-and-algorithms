package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
//    Can successfully push onto a stack
    @Test
    public void pushOntoStackTest(){
        Stack newStack = new Stack();
        newStack.push(12);
//        System.out.println(newStack.toString());
        assertEquals(newStack.getTop().data, 12);
    }
////    Can successfully push multiple values onto a stack
    @Test
    public void pushMultiValuesOntoStackTest(){
        Stack newStack = new Stack();
        newStack.push(12);
        newStack.push(13);
        newStack.push(14);
        newStack.push(15);

        assertEquals(newStack.getTop().data, 15);


    }
////    Can successfully pop off the stack
    @Test
    public void popOffTheStackTest(){
        Stack newStack = new Stack();
        newStack.push(12);
        newStack.push(13);
        newStack.push(14);
        newStack.push(15);
        assertEquals(newStack.pop(), 15);
    }
////    Can successfully empty a stack after multiple pops
    @Test
    public void emptyStackWithMultiPopsTest(){
        Stack newStack = new Stack();
        newStack.push(12);
        newStack.push(13);
        newStack.push(14);
        newStack.push(15);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        assertEquals(0, newStack.getStackSize());
    }
////    Can successfully peek the next item on the stack
    @Test
    public void peekAtNextValueInStackTest(){
        Stack newStack = new Stack();
        newStack.push(12);
        newStack.push(13);
        newStack.push(14);
        newStack.push(15);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        assertEquals(12, newStack.peek());
    }
////    Can successfully instantiate an empty stack
    @Test
    public void instantiateAnEmptyStackTest(){
        Stack newStack = new Stack();
        assertEquals(0, newStack.peek());
    }


}