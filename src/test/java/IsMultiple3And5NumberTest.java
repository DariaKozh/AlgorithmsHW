import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsMultiple3And5NumberTest {


    @Order(1)
    @Test
    public void testIsMultiple3And5NumberHappyPathMultiple3And5() {

        int m = 15;
        String expectedResult = "Good Number";

        IsMultiple3And5Number mN = new IsMultiple3And5Number();
        String actualResult = mN.isMultiple3And5NumberAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsMultiple3And5NumberHappyPathMultipleOnly3() {

        int m = -9;
        String expectedResult = "Bad Number";

        IsMultiple3And5Number mN = new IsMultiple3And5Number();
        String actualResult = mN.isMultiple3And5NumberAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsMultiple3And5NumberHappyPathMultipleOnly5() {

        int m = 125;
        String expectedResult = "Poor Number";

        IsMultiple3And5Number mN = new IsMultiple3And5Number();
        String actualResult = mN.isMultiple3And5NumberAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsMultiple3And5NumberNotMultiple3And5() {

        int m = -88888;
        String expectedResult = "-1";

        IsMultiple3And5Number mN = new IsMultiple3And5Number();
        String actualResult = mN.isMultiple3And5NumberAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
