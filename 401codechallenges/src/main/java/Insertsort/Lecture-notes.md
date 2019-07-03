## Learning Objective

- Will learn how to sort an array.
- Test the method to see if the code works.

## Lecture Flow

- What is an array.
    - Array is an object which contains elements of a similar data type.
- How to sort the array;
    - loop thru the Arr and see if the number is larger than the previous then replace it.
- Then test the array.
    - test and empty array, array with duplicate numbers, and a many numbers unsorted numbers.

## Visual
- [Code Snippet](../assets/insertsort.jpg)
- [Test Snippet](../assets/TestSnippet.png)

## PSEUDO
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
      
 ## Resources
 [Website about Insertion sort](https://www.geeksforgeeks.org/insertion-sort/)
 
 [Website about Insertion sort](https://www.javatpoint.com/insertion-sort-in-java)
 
 [Video About insertion Sort](https://www.youtube.com/watch?v=lCDZ0IprFw4)
 



