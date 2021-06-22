public class Unit8Task3 {
    public static void main(String[] args) {
        String str1 = "потоп\nротор\nJava\nрадар\nфутбол";
        System.out.println("Исходные слова:");
        System.out.println(str1);
        String s[] = str1.split("\n");
        System.out.println();
        System.out.println("Слова палиндромы из исходного списка:");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(s[i]);
            StringBuilder reverse = stringBuilder.reverse();
            String strReverse = reverse.toString();
            if (strReverse.equals(s[i])) {
                count++;
                System.out.println(s[i]);
            }
        }
        if (count == 0) {
            System.out.println("Палиндромов нет");
        }
    }
}
