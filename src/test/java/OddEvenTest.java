import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathNegativeNumber() {

        int number = -345;
        String expectedResult = "Odd";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathZerro() {

        int number = 0;
        String expectedResult = "Even";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathPositiveNumber() {

        int number = 222222;
        String expectedResult = "Even";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathNotInt() {

        long number = 2147483647L + 1;
        String expectedResult = "Undefined";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenNumberMaxInt() {

        int number = Integer.MAX_VALUE;
        String expectedResult = "Odd";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenNumberMinInt() {

        int number = Integer.MIN_VALUE;
        String expectedResult = "Even";
        OddEven od = new OddEven();

        String actualResult = od.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }












}
