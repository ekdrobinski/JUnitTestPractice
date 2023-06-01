import org.example.FirstLast6Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestFirstLast6Arrays {
    @Test
    public void testFirstLast6_LastIndex6() {
        //arrange
        FirstLast6Arrays arrays = new FirstLast6Arrays();
        int[] nums = {1, 2, 3, 4, 6};
        //act
        boolean result = arrays.firstLast6(nums);
        //assert
        assertTrue(result);
    }
    @Test
    public void testFirstLast6_NotFirstNiLastIndex6() {
        //arrange
        FirstLast6Arrays arrays = new FirstLast6Arrays();
        int[] nums = {1, 2, 3, 4, 5};
        //act
        boolean result = arrays.firstLast6(nums);
        //assert
        assertFalse(result);
    }
}