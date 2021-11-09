package lab5;

public class zad3 {
    public static void main(String[] args){
        System.out.println(Anagram("Mukhin","nihkuM"));
    }
    public static boolean Anagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        StringBuilder s1 = new StringBuilder(str1.toLowerCase());
        StringBuilder s2 = new StringBuilder(str2.toLowerCase());
        int x, y;
        x = -1;
        while (++x < s1.length()) {
            y = -1;
            while (++y < s2.length()) {
                if (s1.charAt(x) == s2.charAt(y)) {
                    s2.deleteCharAt(y);
                    break;
                }
            }
        }
        return s2.length() == 0;
    }
}
