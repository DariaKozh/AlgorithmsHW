import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathSameNumber() {

        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathNumber2Bigger() {

        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathNumber1Bigger() {

        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        AreNumbersEqual aNE = new AreNumbersEqual();
        int actualResult = aNE.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
