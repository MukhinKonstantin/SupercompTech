package lab5;

public class zad18 {
    public static int Sum(String str){
        int n =0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<= '9')
                n = n +str.charAt(i)-'0';
        }return n;
    }
    public static void main(String args[]){
        System.out.println("Сумма цифр в строке: "
                +Sum("123йцу456кен"));
    }
}
