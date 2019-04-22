package Lab_6.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrei", 123456);
        Person p2 = new Person("Andreea", 212345);
        Person p3 = new Person("Vlad", 654321);

        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(p1.getCnp(),p1);
        map.put(p2.getCnp(),p2);
        map.put(p3.getCnp(),p3);

        System.out.println(map.get(123456));
    }
}
