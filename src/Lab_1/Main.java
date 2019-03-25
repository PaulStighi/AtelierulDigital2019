package Lab_1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        /**System.out.println("Tananana");

         Book book = new Book(30);
         System.out.println("Price : " + book.getPrice());
         displayMethods(book);

         Cat myCat = new Cat();
         Animal myAnimal = myCat;

         myAnimal.instanceMethod();
         Animal.classMethod();*/

        ///code_challenge_1();
        ///code_challenge_2();
        ///code_challenge_3();
        code_challenge_4();
    }

    public static void displayMethods(Book book) {
        Class c = book.getClass();
        Method allMethods[] = c.getMethods();

        for (Method m : allMethods) {
            System.out.println(m);
        }
    }

    public static void code_challenge_1() {
        for (int i = 1; i <= 100; ++i) {
            if ((i % 3) == 0) {
                if ((i % 9) == 0)
                    System.out.print("Jazz" + ",");
                else if ((i % 5) == 0)
                    System.out.print("FizzBuzz" + ",");
                else
                    System.out.print("Fizz" + ",");
            } else if ((i % 5) == 0)
                System.out.print("Buzz" + ",");
            else if ((i % 7) == 0)
                System.out.print("Rizz" + ",");
            else
                System.out.print(i + ",");
        }
    }

    public static void code_challenge_2() {
        System.out.println(compute(53));
        System.out.println(compute2(303));
    }

    public static String compute(int N) {

        String S = "";

        if ((N % 3) == 0)
            S = S.concat("Foo");
        if ((N % 5) == 0)
            S = S.concat("Bar");
        if ((N % 7) == 0)
            S = S.concat("Qix");

        int aux = N, count = 1;

        while (aux != 0) {
            count *= 10;
            aux /= 10;
        }

        aux = N;
        count /= 10;

        while (count != 0) {
            if (((aux / count) % 10) == 3) S = S.concat("Foo");
            if (((aux / count) % 10) == 5) S = S.concat("Bar");
            if (((aux / count) % 10) == 7) S = S.concat("Qix");
            count /= 10;
        }

        aux = N;

        if (S == "")
            S = S.valueOf(N);

        return S;
    }

    public static String compute2(int N) {

        String S = "";
        int OK = 0;

        if ((N % 3) == 0) {
            S = S.concat("Foo");
            OK = 1;
        }
        if ((N % 5) == 0) {
            S = S.concat("Bar");
            OK = 1;
        }
        if ((N % 7) == 0) {
            S = S.concat("Qix");
            OK = 1;
        }

        int aux = N, count = 1;

        while (aux != 0) {
            count *= 10;
            aux /= 10;
        }

        aux = N;
        count /= 10;

        while (count != 0) {
            switch ((aux / count) % 10) {
                case 0:
                    S = S.concat("*");
                    break;
                case 3:
                    S = S.concat("Foo");
                    break;
                case 5:
                    S = S.concat("Bar");
                    break;
                case 7:
                    S = S.concat("Qix");
                    break;
                default:
                    if (OK == 0) {
                        String cif = Integer.toString((aux / count) % 10);
                        S = S.concat(cif);
                    }
                    break;
            }

            count /= 10;
        }

        aux = N;

        if (S == "")
            S = S.valueOf(N);

        return S;
    }

    public static void code_challenge_3() {
        int Array[] = {5, 9, -5, 7, -5};
        int[] Use = new int[Array.length];

        for (int i = 0; i < Array.length; ++i) Use[i] = 0;

        int count = 0;

        for (int i = 0; i < Array.length; ++i)
            for (int j = i + 1; j < Array.length; ++j)
                if ((Array[i] + Array[j]) == 0 && Use[j] == 0) {
                    count++;
                    Use[j] = 1;
                    break;
                }

        System.out.println(count);
    }

    public static void code_challenge_4() {
        int Array[] = {-1, -1, -1, 2};
        int[] Use = new int[Array.length];

        for (int i = 0; i < Array.length; ++i) Use[i] = 0;

        int count = 0;

        for (int i = 0; i < Array.length; ++i)
            for (int j = i + 1; j < Array.length; ++j)
                for (int k = j + 1; k < Array.length; ++k)
                    if ((Array[i] + Array[j] + Array[k]) == 0 && Use[j] == 0 && Use[k] == 0) {
                        count++;
                        Use[j] = 1;
                        Use[k] = 1;
                        break;
                    }

        System.out.println(count);
    }
}
