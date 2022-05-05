import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMaxAve {

    //Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.
    //
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) ?  {3, 7, 5}
    public static int[] averageMinMaxArray(int array[]) {
        int average;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        average = sum / array.length;

        int[] result = new int[]{min, max, average};

        return result;
    }

    public int[] MinMaxAveAlgorithm(int[] array, int start, int end) {

        if (array.length > 0 && start > 0 && end > 0 && start <= array.length - 1 && end <= array.length - 1
                && start <= end) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {

                if (i >= start && i <= end) {
                    counter++;
                }
            }

            int counter2 = 0;
            int[] indexArray = new int[counter];
            for (int i = 0; i < array.length; i++) {
                if (i >= start && i <= end) {
                    indexArray[counter2] = array[i];
                    counter2++;
                }
            }
            return averageMinMaxArray(indexArray);
        } else {

            return new int[]{};
        }

    }
}
