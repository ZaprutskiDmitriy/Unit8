public class Unit8Task4 {
    public static void main(String[] args) {
        TextFormater textFormater = new TextFormater();

        for (int i = 0; i < textFormater.s.length; i++) {
            if (textFormater.countWords(textFormater.s[i]) >= 3 && textFormater.countWords(textFormater.s[i]) <= 5 ||
                    textFormater.palindrom(textFormater.s[i])) {
                System.out.println(textFormater.s[i]);
            }
        }
    }
}
