package write.zad5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // File nie służy do zapisu/odczytu z pliku
        File plik = new File("output_form.txt"); // File
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

        String tekstDoDodania  = scanner.nextLine();

        // zapis
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_form.txt", true))){
            do {
                System.out.print("Imię: ");
                tekstDoDodania = scanner.nextLine();
                printWriter.println("Imie=" + tekstDoDodania);
                System.out.print("Nazwisko: ");
                tekstDoDodania = scanner.nextLine();
                printWriter.println("Nazwisko=" + tekstDoDodania);
                System.out.print("Wiek: ");
                int wiek = Integer.parseInt(scanner.nextLine());
                printWriter.println("Wiek=" + wiek);
                printWriter.println("####################");
            } while (!tekstDoDodania.equals("quit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}