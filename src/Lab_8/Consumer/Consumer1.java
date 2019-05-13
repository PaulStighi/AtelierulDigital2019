package Lab_8.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public void clearList() {
        Consumer<List<String>> consumer = (List<String> l) -> l.clear();
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println("List=" + list.size());
        consumer.accept(list);
        System.out.println("List=" + list.size());
    }

    public void doubleConsumer() {
        Consumer<List<String>> consumer1 = list -> list.add("First");
        Consumer<List<String>> consumer2 = list -> list.add("Second");

        Consumer<List<String>> consumer = list -> {
            consumer1.andThen(consumer2).accept(list);
        };

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        consumer.accept(list);
        System.out.println("List = " + list);
    }

    public static void main(String[] args) {
        Consumer1 consumer = new Consumer1();
        consumer.clearList();
        consumer.doubleConsumer();
    }
}
