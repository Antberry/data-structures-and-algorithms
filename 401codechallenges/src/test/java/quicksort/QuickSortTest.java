package quicksort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortArrayTest(){
        QuickSort quickSort = new QuickSort();
        int[] arr = {1,4,2,7,9,3};
        int[] expected = {1,2,3,4,7,9};

        assertArrayEquals(expected, QuickSort.quickSort(arr,0,5));
    }

}