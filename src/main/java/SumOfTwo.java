public class SumOfTwo {

//Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
// Алгоритм  возвращает пары элементов, которые в сумме дают число n.
//Test Data:
//({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}

    public int[][] sumOfTwoAlgorithms(int[] array, int n) {
        int[][] result = {{}};
        int count = 0;

        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        count++;
                    }
                }
            }
            result = new int[count][2];
            count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        result[count][0] = array[i];
                        result[count][1] = array[j];
                        count++;
                    }
                }
            }
        }

        return result;
    }
}
