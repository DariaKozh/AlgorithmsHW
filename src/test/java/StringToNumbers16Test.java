import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbers16Test {

    @Order(1)
    @Test
    public void testStringToNumbersHappyPath() {

        String text = "  kh57 khdk& jjg^&& mkg5 6946156v ndej@# FG37vD  FGH6";
        String expectedResult = "5756946156376";

        StringToNumbers16 STN = new StringToNumbers16();
        String actualResult = STN.stringToNumbersAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNull() {

        String text = null;
        String expectedResult = "";

        StringToNumbers16 STN = new StringToNumbers16();
        String actualResult = STN.stringToNumbersAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
