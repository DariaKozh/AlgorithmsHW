import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    @Order(1)
    @Test
    public void testReverseArrayHappyPathPositiveNumber() {

        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray rA = new ReverseArray();
        int[] actualResult = rA.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathNegativePositiveNumber() {

        int[] array = {-2, 7, -3, 10, -5};
        int[] expectedResult = {-5, 10, -3, 7, -2};

        ReverseArray rA = new ReverseArray();
        int[] actualResult = rA.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathZeroNumber() {

        int[] array = {0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        ReverseArray rA = new ReverseArray();
        int[] actualResult = rA.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathZeroLenght() {

        int[] array = {};
        int[] expectedResult = {};

        ReverseArray rA = new ReverseArray();
        int[] actualResult = rA.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathOneNumber() {

        int[] array = {-555};
        int[] expectedResult = {-555};

        ReverseArray rA = new ReverseArray();
        int[] actualResult = rA.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
