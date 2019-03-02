package write.zad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // File nie służy do zapisu/odczytu z pliku
        File plik = new File("output_1.txt"); // File
        // reprezentuje deskryptor pliku
        // (zbiór informacji o pliku)

        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zapis
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_1.txt", true))){
            printWriter.println("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
