package lab3;

public class cvetochka {
    public static void main(String[] msi) {
        int price = 1;
        Flower rose = new Rose(price);
        Flower tulip = new Tulip(price);
        Flower carnation = new Carnation(price);
        Flower chamomile = new chamomile(price);
        Flower[] bouquet1 = { rose, chamomile, tulip, carnation };
        Flower[] bouquet2 = { tulip, tulip, carnation, chamomile };
        Flower[] bouquet3 = { rose, rose, rose, rose };
        System.out.print("Количество проданных цветов: ");
        System.out.println(bouquet1.length + bouquet2.length + bouquet3.length);
    }
    public static class Flower {
        int price;
        public Flower(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
    }
    public static class Rose extends Flower {
        int price;
        public Rose(int price) {
            super(price);
        }
        @Override
        public int getPrice() {
            return price * 150;
        }
    }
    public static class Tulip extends Flower {
        public Tulip(int price) {
            super(price);
        }
        @Override
        public int getPrice() {
            return price * 120;
        }
    }
    public static class Carnation extends Flower {
        public Carnation(int price) {
            super(price);
        }
        @Override
        public int getPrice() {
            return price * 140;
        }
    }
    public static class chamomile extends Flower {
        int price;
        public chamomile(int price) {
            super(price);
        }
        @Override
        public int getPrice() {
            return price * 100;
        }
    }
}
