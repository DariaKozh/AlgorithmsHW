import java.util.Arrays;

public class PeakElement {

//Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
// возвращает значения пиковых элементов (элементы, которые больше своих соседей).
//Test Data:
//{3, 2, 7, 5, 1, 9, 23, 1} ? {3, 7, 23}

    public int[] peakElementAlgorithm(int[] array) {

        if (array.length > 0) {

            int counter = 0;

            for (int i = 1; i < array.length - 1; i++) {

                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    counter++;
                }
            }
            if (array[0] > array[1]) {
                counter++;
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                counter++;
            }


            int counter2 = 0;
            int[] arrayPeakElement = new int[counter];

            if (array[0] > array[1]) {
                arrayPeakElement[0] = array[0];
                counter2++;
            }

            for (int i = 1; i < array.length - 1; i++) {

                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    arrayPeakElement[counter2] = array[i];
                    counter2++;
                }

            }
            if (array[array.length - 1] > array[array.length - 2]) {
                arrayPeakElement[counter2] = array[array.length - 1];
                counter2++;
            }

            return arrayPeakElement;
        } else {

            return new int[]{};
        }

    }


}
