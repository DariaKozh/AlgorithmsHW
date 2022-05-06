public class KthLargest {

    //Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
    // и возвращает k-тый максимальный элемент.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    // (12 и 12 - первый и второй самые большие элементы)
    public int KthLargestAlgorithm(int[] array, int k) {

        if (array.length > 0 && k > 0 && k < array.length) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int count;

                    if (array[i] > array[j]) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }

            return array[array.length - k];
        } else {

            return 0;
        }
    }
}
