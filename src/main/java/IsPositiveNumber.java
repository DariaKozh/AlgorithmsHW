public class IsPositiveNumber {

    //5.Ќапишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр
    // больше или равен нулю, и возвращает false, если параметр меньше 0.
    //ѕроверьте работу метода на числах 555, 0 и -555.
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
