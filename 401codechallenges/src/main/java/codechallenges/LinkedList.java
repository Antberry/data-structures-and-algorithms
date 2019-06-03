package codechallenges;


import java.util.ArrayList;

public class LinkedList {

 Node head;

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
}
