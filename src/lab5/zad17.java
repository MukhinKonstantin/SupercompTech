package lab5;

public class zad17 {
    public static int noOfTriples(String str)
    {
        int n = str.length();
        int k = 0;
        for (int i = 0; i < n -2; i++)
        {
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                k++;
        }
        return k;
    }
    public static void main(String args[]){
        System.out.println("Количество троиц в строке: "
                +noOfTriples("qqqwwttt"));
    }
}
