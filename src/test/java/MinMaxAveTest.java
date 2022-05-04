import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    @Order(1)
    @Test
    public void testMinMaxAveHappyPathPositiveNumber() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathPositiveNegativeNumber() {

        int[] array = {-17, -4, -5, -3, 10, -12, 14, 5};
        int start = 3;
        int end = 6;
        int[] expectedResult = {-12, 14, 2};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathPositiveNegativeZeroNumber() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = 2;
        int end = 5;
        int[] expectedResult = {-3, 10, 1};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testMinMaxAveHappyPathEndEqualsStart() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = 3;
        int end = 3;
        int[] expectedResult = {-3, -3, -3};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Test
    public void testMinMaxAveZeroLenght() {

        int[] array = {};
        int start = 2;
        int end = 5;
        int[] expectedResult = {};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveNegativeStart() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = -2;
        int end = 5;
        int[] expectedResult = {};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveNegativeEnd() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = 2;
        int end = -5;
        int[] expectedResult = {};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveStartLargerThanEnd() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = 5;
        int end = 3;
        int[] expectedResult = {};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinMaxAveStartEndLargerThanLenght() {

        int[] array = {-17, -4, 0, -3, 10, 0, 14, 5};
        int start = 8;
        int end = 10;
        int[] expectedResult = {};

        MinMaxAve mMA = new MinMaxAve();
        int[] actualResult = mMA.MinMaxAveAlgorithm(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }




}
