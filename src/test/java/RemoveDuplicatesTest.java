import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPath() {

        String text = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testRemoveDuplicatesHappyPathSameLetters() {

        String text = "fffffffffffffffffffffffffffff";
        String expectedResult = "f";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testRemoveDuplicatesHappyPathDifferentLetters() {

        String text = "asdfgh";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesNull() {

        String text = null;
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithms(text);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
