package write.zad4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres do sprawdzenia:");
        String adress  = scanner.nextLine();

        // File nie służy do zapisu/odczytu z pliku
        File plik = new File(adress); // File
        // reprezentuje deskryptor pliku
        // (zbiór informacji o pliku)


        try {
            if (!plik.exists()) {
                System.out.println("Takiego pliku nie ma");;
            } else {
                //test czy to plik, czy katalog
                try {
                    if (!plik.isFile()) {
                        System.out.println("To jest katalog.");
                    } else {
                        System.out.println("To jest plik.");
                    }

                    //info o rozmiarze

                    System.out.println("Rozmiar wybranego elementu: " + plik.length());

                    // info o czasie ostatniej modyfikacji

                    System.out.println("Czas ostatniej modyfikacji: " + plik.lastModified());

                    // info o prawie do odczytu/zapisu

                    System.out.println("Prawo do odczytu/zapisu: " + plik.canRead() + " / " + plik.canWrite());


                } catch (SecurityException e) {
                    e.printStackTrace();


                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }

    }
}