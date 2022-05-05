public class OddEven {

    //1.	Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

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
