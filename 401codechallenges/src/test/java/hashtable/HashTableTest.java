package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {


//    Adding a key/value to your hashtable results in the value being in the data structure
    @Test
    public void containsInHashtable(){
        HashTable hashTable = new HashTable(10);
        hashTable.add("Charles", "Student");
        hashTable.add("Jorie", "Student");
        hashTable.add("Anthony", "Student");
        hashTable.add("Jhia", "Student");
        hashTable.add("Tish", "Student");
        hashTable.add("Michelle", "Instructor");
        hashTable.add("John", "Instructor");
        hashTable.add("Luke", "Student");

        assertTrue("", hashTable.contains("Charles"));

    }

//    Retrieving based on a key returns the value stored
    @Test
    public void retrieveFromHashtable(){
        HashTable hashTable = new HashTable(10);
        hashTable.add("Charles", "Student");
        hashTable.add("Jorie", "Student");
        hashTable.add("Anthony", "Student");
        hashTable.add("Jhia", "Student");
        hashTable.add("Tish", "Student");
        hashTable.add("Michelle", "Instructor");
        hashTable.add("John", "Instructor");
        hashTable.add("Luke", "Student");

        assertEquals( hashTable.get("Charles"), "Student");

    }

//    Successfully returns null for a key that does not exist in the hashtable
    @Test
    public void retrieveNullFromHashtable(){
        HashTable hashTable = new HashTable(10);
        hashTable.add("Charles", "Student");
        hashTable.add("Jorie", "Student");
        hashTable.add("Anthony", "Student");
        hashTable.add("Jhia", "Student");
        hashTable.add("Tish", "Student");
        hashTable.add("Michelle", "Instructor");
        hashTable.add("John", "Instructor");
        hashTable.add("Luke", "Student");

        assertNull( hashTable.get("Peter"));

    }

//    Successfully handle a collision within the hashtable
//    Successfully retrieve a value from a bucket within the hashtable that has a collision
    @Test
    public void handleCollisionHashtable(){
        HashTable hashTable = new HashTable(8);
        hashTable.add("Charles", "Student");
        hashTable.add("Jorie", "StudentGirl");
        hashTable.add("Anthony", "StudentBoy");
        hashTable.add("Jhia", "Student");
        hashTable.add("Tish", "Student");
        hashTable.add("Michelle", "Instructor");
        hashTable.add("John", "Instructor");
        hashTable.add("Luke", "Student");
        System.out.println(hashTable.map.toString());
        assertEquals(hashTable.hash("Jorie"), hashTable.hash("Anthony"));
        assertEquals(hashTable.get("Jorie"), "StudentGirl");
        assertEquals(hashTable.get("Anthony"), "StudentBoy");


    }

//    Successfully retrieve a value from a bucket within the hashtable that has a collision
    @Test
    public void retrieveValueFromCollisionHashtable(){
        HashTable hashTable = new HashTable(10);
        hashTable.add("Charles", "Student");
        hashTable.add("Jorie", "Student");
        hashTable.add("Anthony", "Student");
        hashTable.add("Jhia", "Student");
        hashTable.add("Tish", "Student");
        hashTable.add("Michelle", "Instructor");
        hashTable.add("John", "Instructor");
        hashTable.add("Luke", "Student");

        assertEquals( hashTable.get("Charles"), "Student");

    }

}