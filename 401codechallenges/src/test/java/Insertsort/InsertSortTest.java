package Insertsort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {
    @Test
    public void emptyArrayTest(){
        InsertSort insertSort = new InsertSort();
        int[] arr = null;


        assertEquals(null, insertSort.insertSort(arr));
    }

    @Test
    public void sortArrTest(){
        InsertSort insertSort = new InsertSort();
        int[] arr = new int[]{21,23,1,5,6};
        int[] sortedArr = new int[]{1,5,6,21,23};
        assertArrayEquals(sortedArr, insertSort.insertSort(arr));
    }

    @Test
    public void duplicateNumTest(){
        InsertSort insertSort = new InsertSort();
        int[] arr = new int[]{5,6,5,7};
        int[] sortedArr = new int[]{5,5,6,7};
        assertArrayEquals(sortedArr, insertSort.insertSort(arr));
    }
}