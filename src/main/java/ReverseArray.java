import java.util.Arrays;

public class ReverseArray {

 //�������� �������� ReverseArray, ������� ��������� �� ���� ������ ����� �����, � ����������
    // ������������� ������.
    //Test Data:
    //{2, 7, 3, 10} ? {10, 3, 7, 2}
    public int[] reverseArrayAlgorithm(int[] array) {

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        return reverseArray;
    }

}
