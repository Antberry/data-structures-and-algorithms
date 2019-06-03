# Singly Linked List
Created a Linked List class to to be able to Insert Node at the beginning, Check to see if a value is in the LinkedList, and return all the values in a LinkedList using a ArrayList.

## Challenge
 - Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
 
 - Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
 
 - This object should be aware of a default empty value assigned to head when the linked list is instantiated.
 
 - Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
 
 - Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
 
 - Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.

## Approach & Efficiency
I took the approach of creating a node class and a LinkedList class seperately. I created a node constructor in the Node class that creates a Head and a Next and used that in LinkedList CLass. I then created a three methods Insert, Includes, and Print Method in my LinkedList Class. I tried to write it as dry and I can with the knowkedge I have. I do not understand Big O at this moment so I don't know.

## API
 - The Insert Method takes in a value and I use tht value to get the First node and the second node. I assign a new node to the old Node and then assign the new val as the new Head Node.

 - The Includes method takes in the parameter value. I loop thru the linkedList using a while to see if the input value is in the List. If it is in the list it returns true and if not it go to the next node and see it matches the input value.
 
 - The Print method I create a new ArrayList to hold each value in the LinkedList. I looped thru with the linkedlist using a while loop and I inserted that value into the ArrayList and then return that ArrayList.
