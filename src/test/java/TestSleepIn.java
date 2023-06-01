import org.example.SleepIn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestSleepIn {
    @Test
    public void testSleepInWeekdayNotVacation() {
        //arrange
        SleepIn sleepIn = new SleepIn();
        boolean weekday = true;
        boolean vacation = false;
        boolean expected = false;
        //act
        boolean result = sleepIn.sleepIn(weekday, vacation);
        //assert
        assertEquals(expected, result);
    }
    @Test
    public void testSleepInWeekdayVacation() {
        //arrange
        SleepIn sleepIn = new SleepIn();
        boolean weekday = true;
        boolean vacation = true;
        boolean expected = true;
        //act
        boolean result = sleepIn.sleepIn(weekday, vacation);
        //assert
        assertEquals(expected, result);
    }
}