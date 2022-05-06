public class SortArray {



    //Написать алгоритм SortArray, который принимает на вход массив целых чисел,
    // и сортирует элементы массива в порядке возрастания.
    //Test Data:
    //{4, 3, 7, 12, 5, 2, 9, 4, 12} ? {2, 3, 4, 4, 5, 7, 9, 12, 12}


    public int[] sortArrayAlgorithm(int[] array) {

        if (array.length == 0) {

            return new int[]{};
        }

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

        return array;
    }

}
