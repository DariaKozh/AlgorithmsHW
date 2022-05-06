import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    @Order(1)
    @RepeatedTest(5)
    public void testIntersectionPathPositiveNumber() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection i = new Intersection();
        int[] actualResult = i.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testIntersectionPathPositiveNegativeNumber() {

        int[] array1 = {1, 2, 4, 5, 8, 9, 10};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};
        Intersection i = new Intersection();
        int[] actualResult = i.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testIntersectionPathPositiveNumber2() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};
        Intersection i = new Intersection();
        int[] actualResult = i.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


}
