import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {


    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositiveNumber() {

        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNumber() {

        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = -3333;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathPositiveNegativeNumber() {

        int number1 = -3333;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathSameNumber() {

        int number1 = 9999;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
