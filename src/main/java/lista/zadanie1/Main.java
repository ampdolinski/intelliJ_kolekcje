package lista.zadanie1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> lista1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę do listy: ");
            int liczba = Integer.parseInt(scanner.nextLine());
            lista1.add(liczba);
        }

        System.out.println(lista1);

        List<Integer> lista2 = new ArrayList<>();

        Random generator = new Random();

        for (int i = 0; i < 5; i++) {
            lista2.add(generator.nextInt());
        }

        System.out.println(lista2);

    }

}
