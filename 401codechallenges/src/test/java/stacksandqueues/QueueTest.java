package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    //    Can successfully enqueue into a queue
    @Test
    public void enqueueAQueueTest(){
        Queue newQueue = new Queue();
        newQueue.enqueue(12);
        assertEquals(12, newQueue.getFront().data);

    }
//    Can successfully enqueue multiple values into a queue
    @Test
    public void enqueueMulitQueueTest(){
        Queue newQueue = new Queue();
        newQueue.enqueue(12);
        newQueue.enqueue(13);
        newQueue.enqueue(14);
        newQueue.enqueue(15);
        assertEquals(15, newQueue.getBack().data);
    }
//    Can successfully dequeue out of a queue the expected value
    @Test
    public void dequeueAQueueTest(){
        Queue newQueue = new Queue();
        newQueue.enqueue(12);
        newQueue.enqueue(13);
        newQueue.enqueue(14);
        newQueue.enqueue(15);
        newQueue.dequeue();
        assertEquals(13, newQueue.getFront().data);

    }
//    Can successfully peek into a queue, seeing the expected value
    @Test
    public void peekIntoQueueTest(){
        Queue newQueue = new Queue();
        newQueue.enqueue(12);
        newQueue.enqueue(13);
        newQueue.enqueue(14);
        newQueue.enqueue(15);
        assertEquals(12, newQueue.peek());

    }
//    Can successfully empty a queue after multiple dequeues
    @Test
    public void emptyQueueWithMultiDequeueTest(){
        Queue newQueue = new Queue();
        newQueue.enqueue(12);
        newQueue.enqueue(13);
        newQueue.enqueue(14);
        newQueue.enqueue(15);
        newQueue.dequeue();
        newQueue.dequeue();
        assertEquals(14, newQueue.dequeue());
        assertEquals(15, newQueue.getFront().data);
        newQueue.dequeue();
        assertNull(newQueue.getFront());
    }
//    Can successfully instantiate an empty queue
    @Test
    public void InstantiateEmptyQueueTest(){
        Queue newQueue = new Queue();
        assertEquals(0, newQueue.peek());
    }
}