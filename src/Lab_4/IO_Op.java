package Lab_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IO_Op {
    public String readFromFile(String filePath) {
        String text = "";
        FileReader fr = null;

        try {
            int c;
            fr = new FileReader(filePath);

            while ((c = fr.read()) != -1) {
                char chr = (char) c;

                if (chr >= 'A' && chr <= 'Z')
                    if (chr == 'X') text += ' ';
                    else text += chr;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        } finally {
            closeFile(fr);
        }

        return text;
    }

    private void closeFile(FileReader fr) {
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Unable to close stream");
            }
        }
    }

    public void readFromKeyboard() {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert double : ");
        Double a = scanner.nextDouble();
        System.out.println("The inserted number is : " + a);


    }
}
