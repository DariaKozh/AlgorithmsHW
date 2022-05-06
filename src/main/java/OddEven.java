public class OddEven {

    //1.	Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    public String OddEvenAlgorithm (long number){
        if (number % 2 == 0 && number <= 2147483647L && number >= -2147483648L){
            return "Even";
        } else if (number % 2 != 0 && number <= 2147483647L && number >= -2147483648L) {
            return "Odd";
        } else {
            return "Undefined";
        }
    }

}
