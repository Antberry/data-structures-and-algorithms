package hashtable;

public class Node {

    private String key;
    private String value;
    private Node next;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String key, String value){
        setKey(key);
        setValue(value);
    }
}
