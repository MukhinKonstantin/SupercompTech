package lab5;

public class zad9 {
    public static void main(String[] args) {
        String str1 = "qwertyuiop";
        String str2 = "qwertyuiop";
        String str3 = "QWERTYUIOP";
        boolean sr1 = str1.equals(str2);
        boolean sr2 = str1.equals(str3);
        System.out.println("Данные схожи? " + sr1);
        System.out.println("Данные схожи? " + sr2);
    }
}