package Lab_8.Predicate;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.isEmpty();
        System.out.println("Results=" + p1.test("String"));
        System.out.println("Results=" + p1.test(""));

        Predicate<String> p2 = s -> p1.negate().test(s);
        System.out.println("Results=" + p2.test(""));
    }
}
