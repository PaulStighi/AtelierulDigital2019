package Lab_1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        /**System.out.println("Tananana");

        Book book = new Book(30);
        System.out.println("Price : " + book.getPrice());
        displayMethods(book);*/

        Cat myCat = new Cat();
        Animal myAnimal = myCat;

        myAnimal.instanceMethod();
        Animal.classMethod();
    }

    public static void displayMethods(Book book) {
        Class c = book.getClass();
        Method allMethods[] = c.getMethods();

        for (Method m : allMethods) {
            System.out.println(m);
        }
    }
}
