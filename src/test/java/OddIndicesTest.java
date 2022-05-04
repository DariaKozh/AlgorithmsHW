import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {


    @Order(1)
    @Test
    public void testOddIndicesHappyPathPositiveNegativeNumber() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathZero() {

        int[] array = {0, 0, 0, 0};
        int[] expectedResult = {0, 0};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddIndicesZeroLength() {

        int[] array = {};
        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddIndicesLength1() {

        int[] array = {5};
        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }



}
