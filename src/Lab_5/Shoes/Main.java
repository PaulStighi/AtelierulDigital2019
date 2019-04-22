package Lab_5.Shoes;

public class Main {
    public static void main(String[] args) {

        Running r1 = new Running("Red",40);
        Running r2 = new Running("Red",40);

        Pair<Running> runningPair = new Pair<>(r1,r2);
        System.out.println(runningPair.toString());

        Heels h = new Heels("Blue",36);

        ///new Pair<Running>(r1,h);
    }
}
