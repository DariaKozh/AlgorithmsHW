import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    //Test Data:
//{0, 1, 2, 3, 4, 5} ? 15
//{-7, -3} ? -10
    @Order(1)
    @Test
    public void testSumArrayTestHappyPathPositiveNumber() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayTestHappyPathNegativeNumber() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayTestHappyPathPositiveAndNegativeNumber() {
        int[] array = {-7, -3, 8, 12};
        int expectedResult = 10;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumArrayTestHappyPathZeroNumber() {
        int[] array = {0, 0, 0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestZeroLenght() {
        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
