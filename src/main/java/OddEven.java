public class OddEven {

    //1.	������� �������� OddEven, ������� ��������� �� ���� ����� �����, ���������� �Odd�,
    // ���� ����� ��������,
    // � �Even�, ���� ����� ������. �� ���� ��������� ������� ��������� ����� �Undefined�.

    public String OddEvenAlgorithm (int number){
        if (number % 2 == 0 && number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE){
            return "Even";
        } else if (number % 2 != 0 && number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            return "Odd";
        } else {
            return "Undefined";
        }
    }

}
