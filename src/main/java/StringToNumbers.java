public class StringToNumbers {

    //15.	Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //(Без форматирования)
    public static boolean containNotNumberInString(String text) {
        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {
                boolean t = false;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) < 48 || text.charAt(i) > 57) {
                        t = true;
                    }
                }

                return t;
            } else {

                return false;
            }
        }
        return false;
    }


    public int[] stringToNumbersAlgorithms(String text) {

        if (text != null) {

            text = text.trim();
            String text2 = text.replace(", ","");
            text2 = text2.replace("-", "");

            if (text.length() != 0 && text.contains(", ") == true && containNotNumberInString(text2) == false) {

                String[] arrayString = text.split(", ");
                int[] arrayInt = new int[arrayString.length];

                for (int i = 0; i < arrayInt.length; i++) {

                    arrayInt[i] = Integer.parseInt(arrayString[i]);
                }

                return arrayInt;

            }

            return new int[]{};
        }

        return new int[]{};
    }


    public static void main(String[] args) {
        System.out.println(containNotNumberInString("1nul"));
        System.out.println(containNotNumberInString("1815"));
        System.out.println(containNotNumberInString("nul"));
    }
}

