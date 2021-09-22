package lab1;
public class task10 {
    public static void main(String[] args) {
        int mas[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        System.out.print("Исходный массив: [ ");
        for (int i : mas) {
            System.out.print(i + " ");
        }
        System.out.println(" ]");
        int a = mas.length;
        int[] mas2 = new int[a];
        int i = 0;
        int j = 0;
        while (i < a) {
            if (mas[i] != 0) {
                mas[j++] = mas[i];
            }
            i = i + 1;
        }
        while (j < a) {
            mas[j++] = 0;
        }
        System.out.print("Измененный массив: [ ");
        for (int d = 0; d < mas.length; d++) {
            System.out.print(mas[d] + " ");
        }
        System.out.println(" ]");
    }
}
