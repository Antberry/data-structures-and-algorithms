package tree;

public class Node {
    Object data;
    Node left = null;
    Node right = null;

    public Node(Object val)
    {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
