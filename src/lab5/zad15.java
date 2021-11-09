package lab5;

public class zad15 {
    public static char abg(String str){
        char support;
        for(int i=0;i<str.length();i++){
            support = str.charAt(i);
            if ((i==0) && (support !=str.charAt(i+1))) {
                return support;
            }
            if ((i != 0) && (support != str.charAt(i - 1))
                    && (support != str.charAt(i + 1))){
                return support;
            }
        }return 0;
    }
    public static void main(String[] args) {
        System.out.println("Первый неповторяющийся символ: "
                +abg("qqqwwifnrercnht"));
    }
}
