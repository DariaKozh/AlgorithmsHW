public class AreNumbersEqual {

    //�������� �������� AreNumbersEqual, ������� ��������� �� ���� 2 ����� int �����, � ����������
    //0, ���� ����� �����
    //-1, ���� ������ ����� ������ �������
    //1, ���� ������ ����� ������ �������
    //
    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    public int AreNumbersEqualAlgorithm(int number1, int number2) {

        return Integer.compare(number1, number2);
    }

}
