package lab5;

public class zad13 {
    public static void main(String args[]) {
        String str1 ="qwweeerrrrttttt";
        char res = get2ndMostFreq(str1);
        System.out.println("Второй по частоте символ: "+res);
    }
    static final int NOOFCHARS = 256;
    static char get2ndMostFreq(String str1) {
        int[] ctr = new int[NOOFCHARS];
        int i;
        for (i = 0; i < str1.length(); i++)
            (ctr[str1.charAt(i)]) ++;
        int ctr_first = 0;
        int ctr_second = 0;
        for (i = 0; i < NOOFCHARS; i++) {
            if (ctr[i] > ctr[ctr_first]) {
                ctr_second = ctr_first;
                ctr_first = i;
            } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
                ctr_second = i;
        }
        return (char) ctr_second;
    }
}
