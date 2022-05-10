public class StringToNumbers15 {

    // 15.	Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    // Test Data:
    //   “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //    Вариант 2.

    public int[] stringToNumbersAlgorithms(String text) {
        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                for (int i = 0; i < text.length(); i++) {

                    if (text.charAt(i) < 48 || text.charAt(i) > 57) {

                        text = text.replace(Character.toString(text.charAt(i)), "-");
                    }
                }

                text = text.replace("-", "");

                if (text.length() > 0) {

                    for (int i = 0; i < text.length(); i += 2) {

                        text = text.replace(Character.toString(text.charAt(i)),
                                Character.toString(text.charAt(i)) + " ");
                    }

                    String[] arrayString = text.split(" ");
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

        return new int[]{};
    }

}
