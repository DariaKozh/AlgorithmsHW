public class ReverseString {

    //19.	Написать алгоритм ReverseString, который переворачивает строку:
    //Test Data:
    //“Abracadabra” → “arbadacarbA”


    public String reverseStringAlgorithms(String text) {

        if (text != null) {

            text = text.trim();
            String result = "";

            if (text.length() != 0) {
                for (int i = text.length() - 1; i >= 0; i--) {

                    result = result + text.charAt(i);
                }

                return result;
            }

            return "";
        }

        return "";
    }

}
