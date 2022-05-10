import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {

    @Order(1)
    @Test
    public void testStringToNumbersHappyPathPositiveNumber() {

        String text = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersHappyPathNegativeNumber() {

        String text = "-1, -2, -3, -4, -5";
        int[] expectedResult = {-1, -2, -3, -4, -5};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersHappyPathZeroNumber() {

        String text = "0, 0";
        int[] expectedResult = {0, 0};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersHappyPathPositiveNegativeNumber() {

        String text = "-1, 2, -3, 125";
        int[] expectedResult = {-1, 2 , -3, 125};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringToNumbersNoNumber() {

        String text = "a, b, c";
        int[] expectedResult = {};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNoComaSpace() {

        String text = "123";
        int[] expectedResult = {};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNullString() {

        String text = null;
        int[] expectedResult = {};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersEmptyString() {

        String text = "";
        int[] expectedResult = {};

        StringToNumbers sTN = new StringToNumbers();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
