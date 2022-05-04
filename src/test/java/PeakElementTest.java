import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    @Order(1)
    @Test
    public void testPeakElementTestHappyPathPositiveNumber() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testPeakElementTestHappyPathNegativeNumber() {

        int[] array = {-3, -12, -7, -5, -11, -9, -23, -1};
        int[] expectedResult = {-3, -5, -9, -1};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testPeakElementTestHappyPathPositiveNegativeNumber() {

        int[] array = {-3, 12, -7, 5, -11, 9, -23, 1};
        int[] expectedResult = {12, 5, 9, 1};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(4)
    @Test
    public void testPeakElementTestHappyPathZeroNumber() {

        int[] array = {0, 0, 0, 0, 0};
        int[] expectedResult = {};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testPeakElementTestHappyPathSameNumber() {

        int[] array = {11, 11, 11};
        int[] expectedResult = {};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(6)
    @Test
    public void testPeakElementTestHappyPathIncreasingNumber() {

        int[] array = {11, 12, 13};
        int[] expectedResult = {13};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(7)
    @Test
    public void testPeakElementTestHappyPathDecreasingNumber() {

        int[] array = {13, 11, 10};
        int[] expectedResult = {13};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testPeakElementTestZeroLenght() {

        int[] array = {};
        int[] expectedResult = {};

        PeakElement pE = new PeakElement();
        int[] actualResult = pE.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

}
