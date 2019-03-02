package lista.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//    5. Stwórz klasę Student która posiada pola:
//    nr indeksu
//    imie
//            nazwisko
//    płeć (wartość enum)
//
//    W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
//            Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
//
//    a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
//    b. Spróbuj wypisać elementy stosując pętlę foreach
//    c. Wypisz tylko kobiety
//    d. Wypisz tylko mężczyzn
//    e. Wypisz tylko indeksy osób

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("176900", "Qwein", "Kowalski", Plec.MEZCZYZNA));
        studentList.add(new Student("175802", "Ester", "Różycka", Plec.KOBIETA));
        studentList.add(new Student("161234", "Ofelia", "Cokolw", Plec.KOBIETA));
        studentList.add(new Student("177005", "Karol", "Lembork", Plec.MEZCZYZNA));
        studentList.add(new Student("175423", "Joahim", "Zimmer", Plec.MEZCZYZNA));
        studentList.add(new Student("175801", "Yenny", "Smith", Plec.KOBIETA));


        System.out.println("arraylist " + studentList);
        System.out.println("");

        System.out.println("Teraz niech to wygląda, jak lista!");
        for (Student i : studentList) {
            System.out.println(i);
        }

        System.out.println("A teraz tylko dziewczyny!");
        for (Student i : studentList) {
            if (i.getPlec() == Plec.KOBIETA) {
                System.out.println(i);
            }
        }

        System.out.println("A teraz tylko chłopaki!");
        for (Student i : studentList) {
            if (i.getPlec() == Plec.MEZCZYZNA) {
                System.out.println(i);
            }
        }

        System.out.println("I niespodzianka! Dzisiaj padły następujące numery!");
        for (Student i : studentList) {
            System.out.println(i.getNrIndeksu());
        }
    }
}