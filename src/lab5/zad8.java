package lab5;

public class zad8 {
    public static void main(String args[]){
        String str = "Костя лучший!";
        boolean str1 = str.endsWith("лучший!");
        boolean str2 = str.endsWith("Не очень");
        System.out.println("Строка: "+"'"+str +"'"+ " заканчивается на 'лучший!': " + str1);
        System.out.println("Строка: "+"'"+str +"'"+ " заканчивается на 'Не очень': " + str2);
    }
}
