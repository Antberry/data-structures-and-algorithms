package mergesort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void arrWithOneValueTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, mergeSort.mergeSort(arr));

    }
    @Test
    public void sortArrayWithSameNumsTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{5, 1, 1, 5};
        int[] expected = new int[]{1, 1, 5, 5 };
        assertArrayEquals(expected, mergeSort.mergeSort(arr));
    }

    @Test
    public void sortArrayTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{5,3,53,99,1,74,0};
        int[] expected = new int[]{0,1,3,5,53,74,99};
        assertArrayEquals(expected, mergeSort.mergeSort(arr));
    }

    @Test
    public void shouldFailsortTest(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{5,3,53,99,1,74,0};
        int[] expected = new int[]{0,1,3,99,5,53,74};
        assertNotEquals(expected, mergeSort.mergeSort(arr));
    }
}