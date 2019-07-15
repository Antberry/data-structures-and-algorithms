package leftjoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void leftJoinTest(){
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();

        hashMap1.put("fond","enamored");
        hashMap1.put("wrath","anger");
        hashMap1.put("diligent","employed");
        hashMap1.put("outift","garb");
        hashMap1.put("guide","usher");

        hashMap2.put("fond","averse");
        hashMap2.put("wrath","delight");
        hashMap2.put("diligent","idle");
        hashMap2.put("guide","follow");
        hashMap2.put("flow","jam");

        String[] row1 = {"fond", "enamored", "averse"};
        String[] row2 = {"wrath","anger","delight"};
        String[] row3 = {"diligent","employed","idle"};
        String[] row4 = {"outift","garb",null};
        String[] row5 = {"guide","usher","follow"};

        ArrayList<String[]> arr = LeftJoin.leftJoin(hashMap1, hashMap2);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)[0] == "fond") {
                assertArrayEquals(row1, arr.get(i));
            } else if (arr.get(i)[0] == "wrath") {
                assertArrayEquals(row2, arr.get(i));
            }
        }
    }

}