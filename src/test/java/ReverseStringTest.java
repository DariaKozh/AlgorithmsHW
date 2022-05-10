import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {

    @Order(1)
    @Test
    public void testStartsReverseStringHappyPath() {

        String text = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString Rs = new ReverseString();
        String actualResult = Rs.reverseStringAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testStartsReverseStringNull() {

        String text = null;
        String expectedResult = "";

        ReverseString Rs = new ReverseString();
        String actualResult = Rs.reverseStringAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
