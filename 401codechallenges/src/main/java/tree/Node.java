package tree;

public class Node {
    public Object data;
    public Node left = null;
    public Node right = null;

    public Node(Object val)
    {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
