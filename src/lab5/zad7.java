package lab5;

public class zad7 {
    public static void  main (String [] args) {
        String str1 = "Яблоко";
        String str2 = "Груша";
        CharSequence sr = "Груша";
        System.out.println (str1 + " = " + sr + "? " + str1.contentEquals (sr));
        System.out.println (str2 + " = " + sr + "? " + str2.contentEquals (sr));
    }
}
