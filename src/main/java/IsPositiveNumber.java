public class IsPositiveNumber {

    //5.�������� �������� IsPositiveNumber, ������� ���������� true, ���� ���������  ��������
    // ������ ��� ����� ����, � ���������� false, ���� �������� ������ 0.
    //��������� ������ ������ �� ������ 555, 0 � -555.
    public boolean isPositiveNumberAlgorithm (int number){
        boolean isPositiveNumber;
        if (number >= 0){
            isPositiveNumber = true;
        } else {
            isPositiveNumber = false;
        }

        return isPositiveNumber;
    }


}
