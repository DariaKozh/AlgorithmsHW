import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class KthLargestTest {

    @Order(1)
    @Test
    public void testKthLargestHappyPathPositiveNumber() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kth = new KthLargest();
        int actualResult = kth.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Order(2)
    @Test
    public void testKthLargestHappyPathPositiveNegativeNumber() {

        int[] array = {4, 3, -7, 2, 0, 2, 9, -4, -12};
        int k = 1;
        int expectedResult = 9;

        KthLargest kth = new KthLargest();
        int actualResult = kth.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Order(3)
    @Test
    public void testKthLargestKlaggerLenght() {

        int[] array = {4, 3, -7, 2, 0, 2, 9, -4, -12};
        int k = 10;
        int expectedResult = 0;

        KthLargest kth = new KthLargest();
        int actualResult = kth.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testKthLargestKNegative() {

        int[] array = {4, 3, -7, 2, 0, 2, 9, -4, -12};
        int k = -10;
        int expectedResult = 0;

        KthLargest kth = new KthLargest();
        int actualResult = kth.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testKthLargestZeroLenght() {

        int[] array = {};
        int k = 0;
        int expectedResult = 0;

        KthLargest kth = new KthLargest();
        int actualResult = kth.KthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);


    }
}
