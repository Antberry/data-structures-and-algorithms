package codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class AntBinarySearchTest {
    @Test
    public void testAntBinarySearch(){
        AntBinarySearch antBinarySearchTest = new AntBinarySearch();
        int num = 33;
        int[] testArr = {11,22,33,44,55,66,77,88,99};
        int expectedOutput = 2;
        assertEquals("This test should return 'true'",expectedOutput, antBinarySearchTest.binarySearch(testArr,num));
    }

}