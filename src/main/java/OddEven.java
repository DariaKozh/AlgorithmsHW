public class OddEven {

    //1.	—оздать алгоритм OddEven, который принимает на вход целое число, возвращает УOddФ,
    // если число нечетное,
    // и УEvenФ, если число четное. ¬о всех остальных случа€х результат будет УUndefinedФ.

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
