package lab1;
public class task8 {
    public static void main(String[] args) {
        int mas[] = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        System.out.print("Массив: [ ");
        for (int i: mas){
            System.out.print(i + " ");
        }
        System.out.print(" ]");
        int max = 0;
        int sumplus = 0;
        int sumotrn = 0;
        int kolpol = 0;
        int sumotr = 0;
        int kolotr = 0;
        for (int elem : mas) {
            if (elem > max) {
                max=elem;
            }
            if (elem > 0){
                sumplus+=elem;
                kolpol+=1;
            }
            if (elem < 0){
                if( elem % 2 == 0){
                    sumotrn+=elem;
                }
                kolotr+=1;
                sumotr+=elem;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение = " + max);
        System.out.println("Сумма положительных элемнтов = " + sumplus);
        System.out.println("Сумма четных отрицательных элементов = " + sumotrn);
        System.out.println("Количество положительных элементов = " + kolpol);
        System.out.println("Среднее арифметическое отрицательных элементов = " + (sumotr/kolotr));
    }
}
