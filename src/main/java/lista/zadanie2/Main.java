package lista.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista2 = new ArrayList<>();

        Random generator = new Random();

        for (int i = 0; i < 10; i++) {
            lista2.add(generator.nextInt());
        }

        System.out.println(lista2);

        int suma = 0;
for (Integer integer : lista2) {
    suma += integer;
}
      System.out.println("Suma liczb to: " + suma);
      System.out.println("średnia liczb to: " + suma/lista2.size());

      //stworzenie kopii listy
        List<Integer> kopia = new ArrayList<>(lista2);

//        List<Integer> kopia = lista2;
//        to byłaby druga zmienna, przechowująca
//        dokładnie tę samą listę

//        Collection.sort(lista2);

//        double mediana;
//        if

//        znalezienie min / max
        int min = kopia.get(0), pozycjaMin = 0;
        int max = kopia.get(0), pozycjaMax = 0;

        for (int i = 1; i < kopia.size(); i++) {
            if (max < kopia.get(i)) {
                max = kopia.get(i);
                pozycjaMax = i;
            }
            if (min > kopia.get(i)) {
                min = kopia.get(i);
                pozycjaMin = i;
            }
        }

        System.out.println("minimum: " + min + " znaleziono na pozycji: " + pozycjaMin);
        System.out.println("maximum: " + max + " znaleziono na pozycji: " + pozycjaMax);


    }

}
