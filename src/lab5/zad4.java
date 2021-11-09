package lab5;

public class zad4 {
    public static void main(String[] args) {
        System.out.println(aaa("Mukh", "MuKH"));
    }
    public static int aaa(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) ==str2.charAt(i)) {
                ++i;
            } else {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        if (str1.length() < str2.length()) {
            return (str1.length() - str2.length());
        } else if (str1.length() > str2.length()) {
            return (str1.length() - str2.length());
        } else {

            return 0;
        }
    }
}
