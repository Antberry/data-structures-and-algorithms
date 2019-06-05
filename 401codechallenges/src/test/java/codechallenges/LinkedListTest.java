package codechallenges;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void emptyLinkedListTest(){
        LinkedList lList = new LinkedList();
        assertTrue("This test should return 'True'", lList.head == null);
    }
    @Test
    public void insertIntoLinkedListTest(){
        LinkedList insertLList = new LinkedList();
        insertLList.insert(19);
        assertTrue("This test should return 'True'", insertLList.head.data == 19);
    }
    @Test
    public void headPointFirstNodeTest(){
        LinkedList headPointList = new LinkedList();
        headPointList.insert(2);
        headPointList.insert(17);
        headPointList.insert(45);
        assertTrue("This test should return 'True'", headPointList.head.data == 45);
    }
    @Test
    public void multipleNodeInLinkedListTest(){
        LinkedList multiNodesList = new LinkedList();
        multiNodesList.insert(12);
        multiNodesList.insert(14);
        multiNodesList.insert(16);
        multiNodesList.insert(18);
        multiNodesList.insert(20);
        assertTrue("This test should return 'True'", multiNodesList.head.data == 20);
    }

    @Test
    public void findValueInListTest(){
        LinkedList findValueList = new LinkedList();
        findValueList.insert(12);
        findValueList.insert(14);
        findValueList.insert(16);
        findValueList.insert(18);
        findValueList.insert(20);
        assertTrue("This test should return 'True'", findValueList.includes(16));
    }

    @Test
    public void searchNonExistValueTest(){
        LinkedList searchValueList = new LinkedList();
        searchValueList.insert(12);
        searchValueList.insert(14);
        searchValueList.insert(16);
        searchValueList.insert(18);
        searchValueList.insert(20);
        assertFalse("This test should return 'false'", searchValueList.includes(17));
    }

    @Test
    public void returnCollectionOfValueTest(){
        LinkedList returnValuesList = new LinkedList();
        returnValuesList.insert(1);
        returnValuesList.insert(3);
        returnValuesList.insert(5);
        returnValuesList.insert(7);
        returnValuesList.insert(9);
        ArrayList<Integer> expectedArr = new ArrayList<>();
        expectedArr.add(9);
        expectedArr.add(7);
        expectedArr.add(5);
        expectedArr.add(3);
        expectedArr.add(1);

        assertEquals("This should return new arrayList", expectedArr, returnValuesList.print());

    }

//    Can successfully add a node to the end of the linked list
    @Test
    public void addNodeToEndTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.append(6);
//        assertEquals( );

    }
//    Can successfully add multiple nodes to the end of a linked list
    @Test
    public void addMultiNodesToEndTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.append(6);
        newList.append(7);
        newList.append(8);
        System.out.println(newList.includes(6));
        assertTrue("This should return True", newList.includes(6) );

    }
//    Can successfully insert a node before a node located i the middle of a linked list
    @Test
    public void insertNodeBeforeNodeInMiddleTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.before(3,6);
        System.out.println(newList.includes(6));
        assertTrue("This should return True", newList.includes(6) );

    }
//    Can successfully insert a node before the first node of a linked list
    @Test
    public void insertNodeBeforeFirstNodeTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.before(5,6);
        System.out.println(newList.includes(6));
        assertTrue("This should return True", newList.includes(6) );

    }
//    Can successfully insert after a node in the middle of the linked list
    @Test
    public void insertNodeAfterNodeInMiddleTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.after(3,6);
        System.out.println(newList.includes(6));
        assertTrue("This should return True", newList.includes(6) );

    }
//    Can successfully insert a node after the last node of the linked list
    @Test
    public void insertNodeAfterLastNodeTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.after(1, 6);
        System.out.println(newList.includes(6));
        assertTrue("This should return True", newList.includes(6) );

    }

//    Where k is greater than the length of the linked list
    @Test
    public void valGreaterThanLengthOfListTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        newList.nthNodeFromLast(2);
        System.out.println(newList.nthNodeFromLast(2));
        assertTrue("This should return 3 equal 3 which should be true", newList.nthNodeFromLast(2) == 3);

    }
//    Where k and the length of the list are the same
    @Test
    public void valAndLengthTheSameTest(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
        System.out.println(newList.nthNodeFromLast(5));
        assertTrue("This should return 5 equal 5 which should be true", newList.nthNodeFromLast(5) == 5);

    }
//    Where k is not a positive integer
    @Test
    public void valIsNotAPositiveNumTest(){

        LinkedList newList = new LinkedList();
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);

//        System.out.println(newList.nthNodeFromLast(-1));
        assertEquals(new NullPointerException(null), newList.nthNodeFromLast(-2));


    }
//    Where the linked list is of a size 1
    @Test
    public void linkedListSizeOfOne(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        System.out.println(newList.nthNodeFromLast(1));
        assertTrue("This should return 1 equal 1 which should be true", newList.nthNodeFromLast(1) == 1);
    }
}