import org.example.FizzArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TestFizzArray {
    @Test
    public void testFizzArray_LengthOfZero() {
        //arrange
        FizzArray fizzArray = new FizzArray();
        int n = 0;
        int[] expectedArray = {};
        //act
        int[] result = fizzArray.fizzArray(n);
        //assert
        assertArrayEquals(expectedArray, result);
    }
}

