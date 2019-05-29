package codechallenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertShiftArrayTest {
    @Test
    public void insertShiftArrayTest() {
        InsertShiftArray insertShiftArrayTest = new InsertShiftArray();
        int[] inputArr = {1, 2, 3, 4, 5, 77, -4};
        int num = 15;
        int[] expectedOutput = {1,2,3,4,15,5,77,-4};
        assertArrayEquals(expectedOutput, insertShiftArrayTest.insertShiftArray(inputArr, num));
    }
}
