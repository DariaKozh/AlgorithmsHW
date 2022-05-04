import java.util.Arrays;

public class NegativeOnTheRight {

    //Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
    // и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    //Test Data:
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} ? {4, 7, 5, 9, 4, 12, -3, -12, -2}
    public int[] negativeOnTheRightAlgorithm(int[] array) {

        if (array.length > 0){

            int counterNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counterNegative++;
            }
        }

        int[] resultArray = new int[array.length];
        int counter2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                resultArray[counter2] = array[i];
                counter2++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                resultArray[counter2] = array[i];
                counter2++;
            }
        }

        return resultArray;
    } else {

        return new int[]{};
    }

    }


    /*public static void main(String[] args) {
        int[] a = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        System.out.println(Arrays.toString(negativeOnTheRightAlgorithm(a)));


    }*/

}
