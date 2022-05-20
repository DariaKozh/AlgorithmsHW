public class RemoveDuplicates {


    //20.	Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
    //“AABBCCaabbcc” → “abc”

    public String removeDuplicatesAlgorithms(String text) {

        if (text != null) {

            text = text.trim();

            if (text.length() != 0) {

                text = text.toLowerCase();
                String result = "";

                for (int i = 0; i < text.length(); i++) {
                    for (int j = i + 1; j < text.length(); j++) {

                        if (text.charAt(i) == text.charAt(j)){
                            result += text.charAt(i);
                            text = text.replace(Character.toString(text.charAt(i)), "");
                            j--;

                        }
                    }
                }

                return result;
            }

            return "";
        }

        return "";
    }

}
