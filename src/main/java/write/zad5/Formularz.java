package write.zad5;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Data
@AllArgsConstructor
public class Formularz {

    private int wiek;
    private int wzrost;
    private String plec;
    private int zarobki;
    private String kolorOczu;
    private String kolorWlosow;

//    try (
//    PrintWriter printWriter = new PrintWriter(new FileWriter("output_form.txt", true))){
//        do {
//            System.out.print("Imię: ");
//            tekstDoDodania = scanner.nextLine();
//            printWriter.println("Imie=" + tekstDoDodania);
//            System.out.print("Nazwisko: ");
//            tekstDoDodania = scanner.nextLine();
//            printWriter.println("Nazwisko=" + tekstDoDodania);
//            System.out.print("Wiek: ");
//            int wiek = Integer.parseInt(scanner.nextLine());
//            printWriter.println("Wiek=" + wiek);
//            printWriter.println("####################");
//        } while (!tekstDoDodania.equals("quit"));
//    } catch (
//    IOException e) {
//        e.printStackTrace();
//    }


}
