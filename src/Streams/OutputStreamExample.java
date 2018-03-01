package Streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
            
        System.out.println("Hello");
        try (FileOutputStream output = new FileOutputStream("resources/temp.dat")) {
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }
    }
}
