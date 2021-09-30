package lab2;

public class VET {
    public static void main(String[] vma) {
        Veterinar vet = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("сухой корм","будка");
        animals[1] = new Cat("влажный корм","квартира");
        animals[2] = new Horse("овес", "стойло");
        for (Animal animal : animals){
            vet.treatAnimal(animal);
            System.out.println("-------------------------------");
        }
    }
    public static class Animal{
        String food;
        String location;
        String name;
        Animal(String name, String food, String location){
            this.food = food;
            this.location = location;
            this.name = name;
        }
        public void makeNoise(){
            System.out.println(this.name + " хворает");
        }
        public void eat(){
            System.out.println(this.name + " ест " + this.food);
        }
        public void sleep(){
            System.out.println(this.name + " спит");
        }
    }
    static class Dog extends Animal {
        Dog(String food, String location) {
            super("Собака", food, location);
        }
        @Override
        public void makeNoise(){
            System.out.println(this.name + " (место жизни/сна: " + this.location + " )");
        }
        @Override
        public void eat(){
            System.out.println(this.name + " употребляет в пищу " + this.food);
        }
    }
    static class Cat extends Animal {
        Cat(String food, String location) {
            super("Кот", food, location);
        }
        @Override
        public void makeNoise(){
            System.out.println(this.name + " (место жизни/сна: " + this.location + " )");
        }
        @Override
        public void eat(){
            System.out.println(this.name + " употребляет в пищу " + this.food);
        }
    }
    static class Horse extends Animal {
        Horse(String food, String location) {
            super("Лошадь", food, location);
        }
        @Override
        public void makeNoise(){
            System.out.println(this.name + " (место жизни/сна: " + this.location + " )");
        }
        @Override
        public void eat(){
            System.out.println(this.name + " употребляет в пищу " + this.food);
        }
    }
    public static class Veterinar{
        public void treatAnimal(Animal animal){
            animal.makeNoise();
            animal.eat();
        }
    }
}
