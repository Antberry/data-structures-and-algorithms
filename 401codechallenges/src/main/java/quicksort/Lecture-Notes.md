## Learning Objective

- Will learn how to sort an array.
- Test the method to see if the code works.

## Lecture Flow

- What is an array.
    - Array is an object which contains elements of a similar data type.
- How to sort the array;
    - Divide and conquer method. It picks an element as pivot and partitions the given array around the picked pivot.
- Then test the array.
    - test and empty array, array with duplicate numbers, and a many numbers unsorted numbers.

## Visual

- [Code Snippet](https://github.com/Antberry/data-structures-and-algorithms/blob/master/assets/quicksort.png)
- [Test Snippet](https://github.com/Antberry/data-structures-and-algorithms/blob/master/assets/TestSnippet.png)

## PSEUDO
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
      
 ## Resources
 [Website about Quick sort](https://www.geeksforgeeks.org/quick-sort/)
 
 [Website about Quick sort](https://howtodoinjava.com/algorithm/quicksort-java-example/)
 
 [Video About Quick Sort](https://www.youtube.com/watch?v=Fiot5yuwPAg)
