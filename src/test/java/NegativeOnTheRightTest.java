import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NegativeOnTheRightTest {


    @Order(1)
    @Test
    public void testNegativeOnTheRightHappyPathPositiveNegativeNumber() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight nO = new NegativeOnTheRight();
        int[] actualResult = nO.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testNegativeOnTheRightHappyPathOnlyNegativeNumber() {

        int[] array = {-4, -2, -333};
        int[] expectedResult = {-4, -2, -333};

        NegativeOnTheRight nO = new NegativeOnTheRight();
        int[] actualResult = nO.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testNegativeOnTheRightHappyPathOnlyPositiveNumber() {

        int[] array = {4, 2, 333};
        int[] expectedResult = {4, 2, 333};

        NegativeOnTheRight nO = new NegativeOnTheRight();
        int[] actualResult = nO.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testNegativeOnTheRightZeroLenght() {

        int[] array = {};
        int[] expectedResult = {};

        NegativeOnTheRight nO = new NegativeOnTheRight();
        int[] actualResult = nO.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

}
