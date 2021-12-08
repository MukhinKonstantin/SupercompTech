package lab9.zad1;

public class MyRunnable implements Runnable {
    int q;
    MyRunnable(int j){
        this.q = j;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + " thread:\t" + i + " ДЕЛИТСЯ НА 10 БЕЗ ОСТАТКА");
                try {
                    Thread.sleep(500* q);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("ПОТОК " + this.q + " ЗАВЕРШИЛСЯ");

    }
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            new Thread(new MyRunnable(i), String.valueOf(i)).start();
        }
    }
}
