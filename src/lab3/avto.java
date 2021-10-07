package lab3;
public class avto {
    public abstract static class Car {
        String brand;
        String cclass;
        int weight;
        Engine engine;
        public Car(String brand, String cclass, int weight, Engine engine) {
            this.brand = brand;
            this.cclass = cclass;
            this.weight = weight;
            this.engine = engine;
        }
        public abstract void start();
        public abstract void stop();
        public abstract void printInfo();
        public void turnRight() {
            System.out.println("Поворот направо");
        }
        public void turnLeft() {
            System.out.println("Поворот налево");
        }
    }
    public static class Engine {
        int power;
        String maker;
        public Engine(int power, String maker) {
            this.power = power;
            this.maker = maker;
        }
    }
    public static class Lorry extends Car {
        int tonnage;
        public Lorry(String brand, String cclass, int weight, Engine engine, int tonnage) {
            super(brand, cclass, weight, engine);
            this.tonnage = tonnage;
        }
        @Override
        public void start() {
            System.out.println("Грузовик поехал");
        }
        @Override
        public void stop() {
            System.out.println("Грузовик остановился");
        }
        @Override
        public void printInfo() {
            System.out.print("Марка грузовика: " + brand + "\nКласс автомобиля: " + cclass + "\nВес: " + weight + "\nМощность двигателя"
                            + engine.power + "\nПроизводитель двигателя" + engine.maker + "\nГрузоподъемность кузова: " + tonnage);
        }
    }
    public static class SportCar extends Car {
        int maxSpeed;
        public SportCar(String brand, String cclass, int weight, Engine engine, int maxSpeed) {
            super(brand, cclass, weight, engine);
            this.maxSpeed = maxSpeed;
        }
        @Override
        public void start() {
            System.out.println("Спорткар поехал");
        }
        @Override
        public void stop() {
            System.out.println("Спорткар остановился");
        }
        @Override
        public void printInfo() {
            System.out.print("Марка спорткара: " + brand + "\nКласс автомобиля: " + cclass + "\nВес: " + weight + "\nМощность двигателя"
                    + engine.power + "\nПроизводитель двигателя" + engine.maker + "\nМаксимальная скорость: " + maxSpeed);
        }
    }
}