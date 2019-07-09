# Hash Table
A data structure that has a key, value, and next Node.

## Challenge
<!-- Description of the challenge -->
Define a method for each(get, contains, add, hash

## Approach & Efficiency
I created a hash table that will hash a string into a index number then it will store that value in the hashed key index. 
If more than one value at a single index it will then create a linked list for that hashed key index. Which you will then 
use the next property of the HashTable to see what in that LinkedList.
Big O of (n).

[Code](https://github.com/Antberry/data-structures-and-algorithms/blob/master/401codechallenges/src/main/java/hashtable/HashTable.java)

[Test](https://github.com/Antberry/data-structures-and-algorithms/blob/master/401codechallenges/src/test/java/hashtable/HashTableTest.java)
