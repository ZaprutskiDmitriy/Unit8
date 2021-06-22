public class TextFormater {

    String str1 = "Текстовый файл содержит текст. После запуска программы другой файл должны записаться только те предложения которых от 3-х до 5-ти слов. Если предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов предложении, оно попадает новый файл. Пишем все ООП стиле. Создаём класс TextFormater котором два статических метода.";
    String s[] = str1.split("\\. ");

    public int countWords(String n) {
        String t[] = n.split(" ");
        return t.length;
    }

    public boolean palindrom(String n) {
        String t[] = n.split(" ");
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(t[i]);
            StringBuilder reverse = stringBuilder.reverse();
            String strReverse = reverse.toString();
            if (strReverse.equals(t[i])) {
                count++;
            }
        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }
}

