import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpacesTest {

    @Order(1)
    @Test
    public void testStringToLettersAndSpacesHappyPathEnglish() {

        String text = "  kh57 khdk& jjg^&& mkg5 6946156v ndej@# FG37vD  FGH6";
        String expectedResult = "  kh khdk jjg mkg v ndej FGvD  FGH";

        StringToLettersAndSpaces STS = new StringToLettersAndSpaces();
        String actualResult = STS.stringToLettersAndSpacesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void testStringToLettersAndSpacesHappyPathRussia() {

        String text = "  ьп2лО ао4ьВАП   522№;М// *7ЭЭ";
        String expectedResult = "  ьплО аоьВАП   М ЭЭ";

        StringToLettersAndSpaces STS = new StringToLettersAndSpaces();
        String actualResult = STS.stringToLettersAndSpacesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesNull() {

        String text = null;
        String expectedResult = "";

        StringToLettersAndSpaces STS = new StringToLettersAndSpaces();
        String actualResult = STS.stringToLettersAndSpacesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
