package write.zad2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // File nie służy do zapisu/odczytu z pliku
        File plik = new File("output_2.txt"); // File
        // reprezentuje deskryptor pliku
        // (zbiór informacji o pliku)

        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Weź pan podaj tekst do wpisania:");
        String tekstDoDodania = scanner.nextLine();

        // zapis
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_2.txt", true))){
            printWriter.println(tekstDoDodania);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
