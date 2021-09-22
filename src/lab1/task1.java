package lab1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.print(num%10);
    }
}
