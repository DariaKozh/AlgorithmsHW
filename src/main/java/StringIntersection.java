public class StringIntersection {

    //21.	Написать алгоритм StringIntersection,  который принимает на вход 2 строки и возвращает
    // общее вхождение в этих строках
    //Test Data:
    //“Carrot”, “carwash” → “car”
    //“Noob”, “Schmooze” → “oo”


    ///!! что-то не так! r второй раз встречается!

    public static String stringIntersectionAlgorithms(String text1, String text2) {

        if (text1 != null && text2 != null) {

            text1 = text1.trim();
            text2 = text2.trim();

            if (text1.length() != 0 && text2.length() != 0) {

                text1 = text1.toLowerCase();
                text2 = text2.toLowerCase();
                String result = "";

                for (int i = 0; i < text1.length(); i++) {
                    for (int j = 0; j < text2.length(); j++) {

                        if (text1.charAt(i) == text2.charAt(j)) {
                            result += text1.charAt(i);
                            //text2 = text2.replace(Character.toString(text2.charAt(j)), "");
                            if (i < (text1.length() - 1)) {
                                i++;
                                j = 0;
                            }
                        }
                    }
                }

                return result;
            }

            return "";
        }

        return "";
    }

    public static void main(String[] args) {

        System.out.println(stringIntersectionAlgorithms("1Car2rosh", "carwash23333"));
        System.out.println(stringIntersectionAlgorithms("Noob", "Schmooze"));
    }
}
