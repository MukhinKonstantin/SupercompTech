package lab1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.println("Ответ: " + (a%10 + a/10%10 + a/100));
    }
}
