public class SumArray {

//3.Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//
//Test Data:
//{0, 1, 2, 3, 4, 5} ? 15
//{-7, -3} ? -10

    public int SumArray (int[] array){
        if (array.length > 0) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                counter += array[i];
            }

            return counter;
        } else {

            return 0;
        }

    }

}
