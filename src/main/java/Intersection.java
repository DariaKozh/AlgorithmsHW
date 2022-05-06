import java.util.Arrays;

public class Intersection {

    //9.Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив
    // общих элементов.
    //
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} ? {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} ? {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} ? {}

    //!!!! Алгоритм не работает, когда последний элемент из первого массива будет совпадать
    //с каким-нибудь элементом второго массива!!!
    //Как исправить - не знаю!

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {

        if (array1.length > 0 && array2.length > 0) {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count++;
                        j = 0;
                        i++;
                    }
                }
            }


            int[] result = new int[count];
            int count2 = 0;

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        result[count2] = array1[i];
                        count2++;
                        i++;
                        j = 0;
                    }
                }
            }

            return result;

        } else {

            return new int[]{};
        }
    }

}
