package lab4.Animal;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    public Animal(boolean vegetarian, String eats, int noOfLegs){
        this.eats= eats;
        this.noOfLegs=noOfLegs;
        this.vegetarian=vegetarian;
    }
}
