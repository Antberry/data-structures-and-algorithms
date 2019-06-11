package queueWithStacks;

import org.junit.Test;
import stacksandqueues.Stack;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void Test_stack(){
        PseudoQueue classUnderTest = new PseudoQueue();
        assertEquals("your stack1 sure be null", null, classUnderTest.stack1.getTop());
    }

    @Test
    public void Test_stack2(){
        PseudoQueue classUnderTest = new PseudoQueue();
        assertEquals("your stack1 sure be null", null, classUnderTest.stack2.getTop());
    }

    @Test
    public void Test_stacks(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(12);
        assertEquals("your stack1 sure be null", 12, classUnderTest.stack1.peek());
    }

    @Test
    public void Test_stackss(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(12);
        classUnderTest.enqueue(13);
        classUnderTest.enqueue(14);
        classUnderTest.enqueue(15);
        assertEquals("your stack1 sure be null", 15, classUnderTest.stack1.peek());
    }
    @Test
    public void Test_stacksss(){
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(12);
        classUnderTest.enqueue(13);
        classUnderTest.enqueue(14);
        classUnderTest.enqueue(15);
        classUnderTest.dequeue();
        assertEquals("your stack1 sure be null", 13, classUnderTest.stack1.peek());
    }
}