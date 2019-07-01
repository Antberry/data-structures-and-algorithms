package tree;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {


//    Can successfully instantiate an empty tree
    @Test
    public void emptyTreeTest(){
        BinaryTree testTree = new BinaryTree();
        assertNull(testTree.root);
    }

//    Can successfully instantiate a tree with a single root node
    @Test
    public void singleRootTest(){
        BinaryTree testTree = new BinaryTree();
        Node one = new Node(1);
        testTree.root = one;
        assertEquals(null, testTree.root.left);
    }

//    Can successfully add a left child and right child to a single root node
    @Test
    public void addLeftAndRightChildtoSingleRoot(){
        BinaryTree testTree = new BinaryTree();
        Node one = new Node(13);
        Node two = new Node(1);
        Node three = new Node(54);
        one.left = two;
        one.right = three;
        testTree.root = one;
        assertEquals(1, testTree.root.left.data);
        assertEquals(54, testTree.root.right.data);
    }

//    Can successfully return a collection from a preorder traversal
@Test
public void preorderTest(){
    BinaryTree testTree = new BinaryTree();
    Node one = new Node(13);
    Node two = new Node(1);
    Node three = new Node(54);
    one.left = two;
    one.right = three;
    testTree.root = one;

    ArrayList<Object> arr = new ArrayList<>();
    arr.add(13);
    arr.add(1);
    arr.add(54);
    assertEquals(arr, testTree.preOrder(testTree.root));
}

//    Can successfully return a collection from an inorder traversal
@Test
public void inorderTest(){
    BinaryTree testTree = new BinaryTree();
    Node one = new Node(13);
    Node two = new Node(1);
    Node three = new Node(54);
    one.left = two;
    one.right = three;
    testTree.root = one;

    ArrayList<Object> arr = new ArrayList<>();
    arr.add(1);
    arr.add(13);
    arr.add(54);
    assertEquals(arr, testTree.inOrder(testTree.root));
}
//    Can successfully return a collection from a postorder traversal

    @Test
    public void postOrderTest(){
        BinaryTree testTree = new BinaryTree();
        Node one = new Node(13);
        Node two = new Node(1);
        Node three = new Node(54);
        one.left = two;
        one.right = three;
        testTree.root = one;

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(54);
        arr.add(13);
        assertEquals(arr, testTree.postOrder(testTree.root));
    }
}