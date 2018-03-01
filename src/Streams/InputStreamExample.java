package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileInputStream input = new FileInputStream("resources/temp.dat")) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}
