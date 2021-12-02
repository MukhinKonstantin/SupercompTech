package lab7_8;

import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        client = new User("qwer","qwer");
        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("АВТОРИЗАЦИЯ");
        System.out.print("ЛОГИН: ");
        String login = (String)scanner.nextLine();
        System.out.print("ПАРОЛЬ: ");
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }
    }
    public static void getMenu() {
        System.out.println("\n МЕНЮ");
        System.out.println("1 <Категории товаров>");
        System.out.println("2 <Корзина>");
        System.out.println("3 <Оплата>");
        System.out.println("4 <Предыдущие покупки>");
        System.out.println("0 <Выход>");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            switch(number) {
                case 1: {getCategory(all); break;}
                case 2: {getBasket(card); break; }
                case 3: {Buy();break;}
                case 4: {outString();break;}
                case 0: {break;}
                default:{System.out.println("Неправильный номер");break;}
            }
        } else {
            System.out.println("Такого параметра не существует");
            getMenu();
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        String result = "";
        System.out.println("Товарный чек");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + "." + client.purchased.purchased[i].toString());
            result += ((i+1) + "." + client.purchased.purchased[i].toString() + "\n");
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок = " + gc + " руб.");
        result+="Общая сумма покупок = " + gc + " руб.";
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("C:\\Users\\Admin\\IdeaProjects\\SupercompTech\\src\\lab7_8\\Basket.ser"));
            ObjectOutputStream objectOutputStream;
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(result);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void outString(){
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\SupercompTech\\src\\lab7_8\\Basket.ser"));
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    String savedGame = (String) objectInputStream.readObject();
                    System.out.println(savedGame);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        getMenu();
    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost*p[i].count;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);
    }
    public static void getBasket(Product[] b) {
        if(b[0] == null) {
            System.out.println("Корзина пустая");
            getMenu();
        };
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " в количестве "
                    + b[i].count + " по " + b[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }
    public static void seeProduct(Category cat) {
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " по "
                    + cat.products[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }
    private static void buyProduct(Product p) {
        System.out.println("Количество?");
        Scanner sc = new Scanner(System.in);
        p.count = sc.nextInt();
        System.out.println("Товар " + p.nameProduct + " в количестве " + p.count + " по " + p.cost + " был добавлен в корзину");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                }
            }
        }
        getCategory(all);
    }
    static Product breadb = new Product("хлеб черный", 32.0);
    static Product breadw = new Product("хлеб белый", 36.0);
    static Product bun = new Product("хлеб бездрожжевой", 55.0);
    static Product apples = new Product("яблоки", 100.0);
    static Product pears = new Product("груши", 98.0);
    static Product oranges = new Product("апельсины", 110.50);
    static Product potatoes = new Product("картошка", 90.99);
    static Product carrot = new Product("морковь", 80.99);
    static Product onion = new Product("лук", 40.00);
    static Product[] Bakery = { breadb, breadw, bun };
    static Product[] Fruits = { apples, pears, oranges };
    static Product[] Vegetables = { potatoes, carrot, onion };
    static Category bakery = new Category("Хлебобулочные изделия", Bakery);
    static Category fruits = new Category("Фрукты", Fruits);
    static Category vegetables = new Category("Овощи", Vegetables);
    static Category[] all = { bakery, fruits, vegetables };
    static Product[] card;
    static User client;
}
class Basket {
    Product[] purchased;
    Basket(Product[] purchased) {
        this.purchased = purchased;
    }
}
class Category {
    String nameCategory;
    Product[] products;
    Category(String nameCategory, Product[] products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }
}
class Product {
    String nameProduct;
    double cost;
    int count;
    Product(String nameProduct, double cost) {
        this.nameProduct = nameProduct;
        this.cost = cost;
    }
    @Override
    public String toString() {
        String result = nameProduct + " в количестве " + count + ". Стоит "  + cost*count + " руб.";
        return (result);
    }
}
class User {
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String login, password;
    public Basket purchased;
    boolean isAuth(String login, String password) {
        if(this.login == login && this.password == password) return true;
        else return false;
    }
}