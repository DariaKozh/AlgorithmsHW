import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {


    @Order(1)
    @Test
    public void testSortArrayHappyPathPositiveNumber() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sA = new SortArray();
        int[] actualResult = sA.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathPositiveNegativeNumber() {

        int[] array = {4, 3, -7, 0, 5, 2, -9, 4, -12};
        int[] expectedResult = {-12, -9, -7, 0, 2, 3, 4, 4, 5};

        SortArray sA = new SortArray();
        int[] actualResult = sA.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testSortArrayZeroLenght() {

        int[] array = {};
        int[] expectedResult = {};

        SortArray sA = new SortArray();
        int[] actualResult = sA.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}