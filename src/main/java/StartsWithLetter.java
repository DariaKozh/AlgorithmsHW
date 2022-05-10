public class StartsWithLetter {

//18.	Написать алгоритм StartsWithLetter, который принимает на вход текст,
// и возвращает в виде строки все слова, которые начинаются с буквы l.

    public String startsWithLetterAlgorithms(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                String[] array = text.split(" ");
                String result = "";

                for (int i = 0; i < array.length; i++) {
                    if (array[i].charAt(0) == 'l' || array[i].charAt(0) == 'L') {

                        result = result + array[i] + " ";

                    }
                }
                result = result.replace(".", "");
                result = result.replace(",", "");
                result = result.replace("!", "");
                result = result.replace("?", "");
                result = result.replace(":", "");
                result = result.replace(";", "");

                result = result.trim();
                result = result.replace("\n", " ");
                result = result.replace(" ", ", ");

                return result;
            }

            return "";
        }

        return "";
    }

}
