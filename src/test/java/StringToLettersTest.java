import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersTest {

    @Order(1)
    @Test
    public void testStringToLettersHappyPathEnglish() {

        String text = "  kh57 khdk& jjg^&& mkg5 6946156v ndej@# FG37vD  FGH6";
        String expectedResult = "khkhdkjjgmkgvndejFGvDFGH";

        StringToLetters ST = new StringToLetters();
        String actualResult = ST.stringToLettersAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToLettersHappyPathRussia() {

        String text = "  ьп2лО ао4ьВАП   522№;М// *7ЭЭ";
        String expectedResult = "ьплОаоьВАПМЭЭ";

        StringToLetters ST = new StringToLetters();
        String actualResult = ST.stringToLettersAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersTextNull() {

        String text = null;
        String expectedResult = "";

        StringToLetters ST = new StringToLetters();
        String actualResult = ST.stringToLettersAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }






    }
