package lab1;

public class task9 {
    public static void main(String[] args) {
        int mas[] = {15,10,51,6,5,3,10,-34,0,32,56,12,24,52};
        System.out.print("Исходный массив: [ ");
        for (int i : mas) {
            System.out.print(i + " ");
        }
        System.out.println(" ]");
        System.out.print("Обратный массив: [ ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ]");
    }
}
