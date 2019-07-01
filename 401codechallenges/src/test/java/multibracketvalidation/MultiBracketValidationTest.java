package multibracketvalidation;

import org.junit.Test;

import static multibracketvalidation.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void bracketTest(){
        assertTrue(multiBracketValidation("()"));
    }
    @Test
    public void bracketTfalseTest(){
        assertFalse(multiBracketValidation("[}"));
    }
}