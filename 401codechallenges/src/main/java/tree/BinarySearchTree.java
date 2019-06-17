package tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        root = null;
    }

    public void add(int value){
        root = add(root, value);

    }

    public Boolean contains(int val){
        return contains(root, val);
    }

    private Node add(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if((val) < ((int)root.data)){
            root.left = add(root.left, val);
        } else if((int)root.data > (val)){
            root.right = add(root.right, val);
        }
        return root;
    }

    private boolean contains(Node root, int value){
        if(root == null){
            return false;
        }

        if (((int) root.data) == value){
            return true;
        }

        if((value) > ((int) root.data) && root.left != null){
            return contains(root.left, value);

        } else if ((value) < ((int) root.data) && root.right != null){
            return contains(root.right, value);
        }
        return false;
    }
}
