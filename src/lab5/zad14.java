package lab5;

public class zad14 {
    private static String qwer(String Str) {
        char[] arr1 = Str.toCharArray();
        String finite = "";
        for (char i: arr1) {
            if (finite.indexOf(i) == -1) {
                finite += i;
            }
        }
        return finite;
    }
    public static void main(String[] args) {
        System.out.println("Строка без дубликатов: "+
                qwer("kukushonock"));
    }
}
