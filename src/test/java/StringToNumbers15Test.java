import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbers15Test {

    @Order(1)
    @Test
    public void testStringToNumbers15HappyPathContainNumber() {

        String text = "gg hdh8h h4%^ 3 %^&2";
        int[] expectedResult = {8, 4, 3, 2};

        StringToNumbers15 sTN = new StringToNumbers15();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbers15HappyPathNoContainNumber() {

        String text = "gg  h%^  %^&  ";
        int[] expectedResult = {};

        StringToNumbers15 sTN = new StringToNumbers15();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbers15Null() {

        String text = null;
        int[] expectedResult = {};

        StringToNumbers15 sTN = new StringToNumbers15();
        int[] actualResult = sTN.stringToNumbersAlgorithms(text);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
