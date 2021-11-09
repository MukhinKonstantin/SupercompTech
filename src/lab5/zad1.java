package lab5;

class zad1 {
    public static void main(String [] args){
        zad1 pn = new zad1();
        if(pn.isPalindrome("asdffdsa")){
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
