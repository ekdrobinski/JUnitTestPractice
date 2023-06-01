import org.example.HelloName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestHelloName {
    @Test
    public void testHelloName() {
        // Arrange
        HelloName helloName = new HelloName();
        String name = "Kevin";
        String expectedGreeting = "Hello Kevin!";
        // Act
        String result = helloName.helloName(name);
        // Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    public void testHelloName_NoNameInputted() {
        //arrange
        HelloName helloName = new HelloName();
        String name = "";
        String expectedGreeting = "Hello !";
        //act
        String result = helloName.helloName(name);
        //assert
        assertEquals(expectedGreeting, result);
    }

}