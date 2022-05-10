import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersAndSpacesTest {

    @Order(1)
    @Test
    public void testStringToNumbersAndSpacesHappyPath() {

        String text = "  kh57 khdk& jjg^&& mkg5 6946156v ndej@# FG37vD  FGH6";
        String expectedResult = "  57   5 6946156  37  6";

        StringToNumbersAndSpaces St = new StringToNumbersAndSpaces();
        String actualResult = St.stringToNumbersAndSpacesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesNull() {

        String text = null;
        String expectedResult = "";

        StringToNumbersAndSpaces St = new StringToNumbersAndSpaces();
        String actualResult = St.stringToNumbersAndSpacesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
