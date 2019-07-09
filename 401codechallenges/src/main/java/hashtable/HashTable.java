package hashtable;

public class HashTable {

    public Node[] map;

    public HashTable(int size){
        map = new Node[size];
    }

    public int hash(String key){
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++){
            hashValue += letters[i];
        }
        hashValue = (hashValue * 799) % map.length;
        return hashValue;
    }

    public void add(String key, String value){
        int hashKey = hash(key);

        if(this.map[hashKey] == null){
            map[hashKey] = new Node(key, value);
        }
        else {
            Node temp = map[hashKey];
            map[hashKey] = new Node(key,value);
            map[hashKey].setNext(temp);
        }
    }

    public boolean contains(String key){
        if(map[hash(key)] != null){
            return true;
        }
        else {
            return false;
        }
    }

    public String get(String key){
        if(map[hash(key)] != null) {
            return map[hash(key)].getValue();
        }
        else {
            return null;
        }
    }

}
