public class Unit8Task1 {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        String substring = str1.substring(str1.indexOf("J"), (str1.lastIndexOf("!") + 1));
        System.out.println(substring);
    }
}
