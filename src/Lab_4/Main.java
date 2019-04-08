package Lab_4;

public class Main {
    public static void main(String[] args) {
        IO_Op io_op = new IO_Op();

        String text = io_op.readFromFile("src//Lab_4/read.txt");
        System.out.println(text);
        /**io_op.readFromKeyboard();*/
    }
}
