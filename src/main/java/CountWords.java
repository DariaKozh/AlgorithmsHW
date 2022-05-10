public class CountWords {

    //17.	Напишите алгоритм CountWords, который принимает на вход текст и слово,
    // и считает все вариации этого слова в тексте

    public int countWordsAlgorithms(String text, String word) {

        if (text != null && word != null) {

            text = text.trim();
            word = word.trim();

            if (text.length() != 0 && word.length() != 0) {

                text = text.toLowerCase();
                word = word.toLowerCase();

                String[] array = text.split(word);
                int counter = array.length - 1;

                return counter;
            }

            return 0;
        }

        return 0;
    }
}
