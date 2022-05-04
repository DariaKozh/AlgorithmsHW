import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void tectIsPositiveNumberHappyPathPositiveNumber() {

        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void tectIsPositiveNumberHappyPathZero() {

        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void tectIsPositiveNumberHappyPathNegativeNumber() {

        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber iPN = new IsPositiveNumber();
        boolean actualResult = iPN.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
