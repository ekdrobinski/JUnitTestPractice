import org.example.CigarParty;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestCigarParty {
    @Test
    public void testCigarParty_WeekendWithEnoughCigars() {
        //arrange
        CigarParty party = new CigarParty();
        //act
        boolean result = party.cigarParty(60, true);
        //assert
        assertTrue(result);
    }
    @Test
    public void testCigarParty_WeekendWithoutEnoughCigars() {
        //arrange
        CigarParty party = new CigarParty();
        //act
        boolean result = party.cigarParty(27, true);
        //assert
        assertFalse(result);
    }
}




