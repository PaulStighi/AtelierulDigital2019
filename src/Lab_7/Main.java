package Lab_7;

public class Main {
    public static Thread getRabbit(int nr) {
        if (nr % 2 == 0)
            return new RabbitThread(nr);
        else
            return new Thread(new RabbitRunnable(nr));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Thread currentThread = getRabbit(i);
            currentThread.start();
        }

    }
}
