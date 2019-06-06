package codechallenges;


import java.util.ArrayList;

public class LinkedList {

 Node head;
 public class Node {
     int data;
     Node next;

     public Node (int val){
         this.data =  val;
         this.next = null;
     }

 }
 public LinkedList (){
  this.head = null;
 }

    public void insert (int val) {
     Node newNode = new Node(val);
      Node oldHead = head;
      newNode.next = oldHead;
      head = newNode;

    }

    public boolean includes (int val) {
     Node nextNode = head;
     while(nextNode != null){
      if(nextNode.data == val){
       return true;
      } else {
       nextNode = nextNode.next;
      }
     }
     return false;
    }

    public ArrayList<Integer> print() {
     ArrayList<Integer> arrList = new ArrayList<>();
     Node nextNode = head;
     while(nextNode != null){
      arrList.add(nextNode.data);
      nextNode = nextNode.next;
     }
     return arrList;
    }

    public void append(int val){
     Node current = head;
     Node newNode = new Node(val);

     while(current != null){
         if(current != null){
             current.next = newNode;

         }
         current = current.next;
     }

    }

    public void before(int val, int newVal){
     if(head.data == val){
         insert(newVal);
     } else {
         Node current = head;
         Node newNode = new Node(newVal);

         while(current.next != null){
             if(current.next.data == val){
                 newNode.next = current.next;
                 current.next = newNode;
                 break;
             }
             current = current.next;
         }
     }

    }

    public void after(int val, int newVal){
        if(head.data == val){
            append(newVal);
        } else {
            Node current = head;
            Node newNode = new Node(newVal);

            while(current != null){
                if(current.data == val){
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
    }

    public Integer nthNodeFromLast(int val){
     int length = 0;
     Node node = head;
     while(node != null){
         node = node.next;
         length++;
     }
     node = head;
     if(length < val){
         throw new IllegalArgumentException();
     }
     for (int i = 1; i < length - val; i++){
         node = node.next;
        }
     return node.data;
    }

    public static LinkedList mergeLists(LinkedList one, LinkedList two){
     Node currentOne = one.head;
     Node currentTwo = two.head;

     if(currentOne == null){
         return two;
     }

     if(currentTwo == null){
         return one;
     }

     Node tempOne = currentOne.next;
     Node tempTwo = currentTwo.next;



     while(currentOne != null && currentTwo != null){
        currentOne.next = currentTwo;
        currentTwo.next = tempOne;
        currentOne = tempOne;
        currentTwo = tempTwo;
        if (tempOne != null) {
            tempOne = tempOne.next;
        }
        if(tempTwo != null) {
            tempTwo = tempTwo.next;
        }


     }
       return one;
    }
}
