import java.util.Arrays;

public class OddIndices {

//Написать алгоритм OddIndices, который принимает массив чисел,
// и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}

    public int[] oddIndicesAlgorithm (int[] array){
        if (array.length > 1){
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 !=0){
                    counter++;
                }
            }
            int counter2 = 0;
            int[] oddIndicesArray = new int[counter];
            for (int i = 0; i < array.length; i++){
                if (i % 2 != 0) {
                    oddIndicesArray[counter2] = array[i];
                    counter2++;
                }
            }
            return oddIndicesArray;

        } else {

            return new int[]{};
        }

    }



}
