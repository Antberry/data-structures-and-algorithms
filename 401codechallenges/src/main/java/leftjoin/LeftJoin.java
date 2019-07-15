package leftjoin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LeftJoin {

    public static ArrayList<String[]> leftJoin(HashMap<String,String> hashMap1, HashMap<String, String> hashMap2) {

        Set<String> set1 = hashMap1.keySet();
        ArrayList<String[]> newArr = new ArrayList<>();
        String[] str = new String [3];
        for(String key : set1){
            str[0] = key;
            str[1] = hashMap1.get(key);
            str[2] = hashMap2.get(key);
            newArr.add(str);
        }
        return newArr;
    }
}
