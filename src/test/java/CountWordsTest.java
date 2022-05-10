import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {


    @Order(1)
    @Test
    public void testCountWordsHappyPathContainWord() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
                + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy"
                + " version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still "
                + "support Java 8 with public updates for personal use indefinitely. Other vendors have begun"
                + " to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "Java";
        int expectedResult = 5;

        CountWords cW = new CountWords();
        int actualResult = cW.countWordsAlgorithms(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testCountWordsHappyPathNoContainWord() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
                + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy"
                + " version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still "
                + "support Java 8 with public updates for personal use indefinitely. Other vendors have begun"
                + " to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "GHJF";
        int expectedResult = 0;

        CountWords cW = new CountWords();
        int actualResult = cW.countWordsAlgorithms(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountWordNull() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
                + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy"
                + " version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still "
                + "support Java 8 with public updates for personal use indefinitely. Other vendors have begun"
                + " to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = null;
        int expectedResult = 0;

        CountWords cW = new CountWords();
        int actualResult = cW.countWordsAlgorithms(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountTextNull() {

        String text = null;
        String word = "run";
        int expectedResult = 0;

        CountWords cW = new CountWords();
        int actualResult = cW.countWordsAlgorithms(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountTextIsEmpty() {

        String text = "";
        String word = "run";
        int expectedResult = 0;

        CountWords cW = new CountWords();
        int actualResult = cW.countWordsAlgorithms(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
