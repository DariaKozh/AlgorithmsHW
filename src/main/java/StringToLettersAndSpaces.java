public class StringToLettersAndSpaces {

    //16.	Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces,
    // StringToNumbers, StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
    //Каждый алгоритм принимает строку, и удаляет ненужные символы

    //Удалить все, кроме букв и пробелов
    public String stringToLettersAndSpacesAlgorithms(String text) {

        if (text != null) {

            if (text.length() != 0) {

                for (int i = 0; i < text.length(); i++) {


                    if ((text.charAt(i) < 65 && text.charAt(i) != 32) || (text.charAt(i) > 90
                            && text.charAt(i) < 97) || (text.charAt(i) > 122 && text.charAt(i) < 1040)
                            || text.charAt(i) > 1103) {

                        text = text.replace(Character.toString(text.charAt(i)), "-");

                    }
                }

                text = text.replace("-", "");

                return text;
            }

            return "";
        }

        return "";
    }

}
