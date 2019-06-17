package tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        root = null;
    }

    public void add(Object value){
        root = add(root, value);

    }

    public Boolean contains(Object value){

        return true;
    }

    private Node add(Node root, Object val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(((int) val) < ((int)root.data)){
            root.left = add(root.left, val);
        } else if((int)root.data > ((int)val)){
            root.right = add(root.right, val);
        }
        return root;
    }
}
