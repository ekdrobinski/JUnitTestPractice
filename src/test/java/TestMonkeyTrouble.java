import org.example.MonkeyTrouble;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonkeyTrouble {

    @Test
    public void testMonkeyTroubleBothSmiles() {
        //arrange
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmiles = true;
        boolean bSmiles = true;
        boolean expected = true;
        //act
        boolean result = monkeyTrouble.monkeyTrouble(aSmiles, bSmiles);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testMonkeyTroubleNeitherSmiles() {
        //arrange
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmiles = false;
        boolean bSmiles = false;
        boolean expected = true;
        //act
        boolean result = monkeyTrouble.monkeyTrouble(aSmiles, bSmiles);
        //assert
        assertEquals(expected, result);
    }
    @Test
    public void testMonkeyTroubleOneSmiles() {
        // Arrange
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmiles = true;
        boolean bSmiles = false;
        boolean expected = false;

        // Act
        boolean result = monkeyTrouble.monkeyTrouble(aSmiles, bSmiles);

        // Assert
        assertEquals(expected, result);
    }
}