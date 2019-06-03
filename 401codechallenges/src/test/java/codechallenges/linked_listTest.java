package codechallenges;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class linked_listTest {
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
}