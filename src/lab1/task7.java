package lab1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a == 905) {
            System.out.println("Москва. Стоимость разговора: 41.5");
        } else if (a == 194) {
            System.out.println("Ростов. Стоимость разговора: 19.8");
        } else if (a == 491) {
            System.out.println("Краснодар. Стоимость разговора: 26.9");
        } else if (a == 800) {
            System.out.println("Киров. Стоимость разговора: 50");
        } else {
            System.out.println("Ошибка");
        }
    }
}
