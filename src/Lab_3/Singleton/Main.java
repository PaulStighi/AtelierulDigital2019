package Lab_3.Singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        if (s1 == s2) {
            System.out.println("Same object!");
        } else System.out.println("Different objects!");
    }
}
