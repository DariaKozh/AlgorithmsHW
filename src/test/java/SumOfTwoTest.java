import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class SumOfTwoTest {

    @Order(1)
    @Test
    public void testSumOfTwoHappyPathPositiveNumber() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sOt = new SumOfTwo();
        int[][] actualResult = sOt.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testSumOfTwoHappyPathPositiveNegativeNumber() {

        int[] array = {4, 3, 7, -12, 5, -2, 0, -4, 9};
        int n = 7;
        int[][] expectedResult = {{4, 3}, {7, 0}, {-2, 9}};

        SumOfTwo sOt = new SumOfTwo();
        int[][] actualResult = sOt.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testSumOfTwoHappyPathPositiveNegativeNumber2() {

        int[] array = {4, 3, 7, -12, 5, -2, 0, -4, 9};
        int n = 27;
        int[][] expectedResult = {};

        SumOfTwo sOt = new SumOfTwo();
        int[][] actualResult = sOt.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}



