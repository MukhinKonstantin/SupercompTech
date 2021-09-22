package lab1;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        int min = 0;
        if (a<b){
            min = a;
        }
        else {
            min = b;
        }
        if (c<min){
            min = c;
        }
        System.out.print("Наименьшее число = " + min);
    }
}
