package mapa.Przyklad.mapa.zad1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

    Student student1 = new Student(90153L, "Józek", "Niedaruje");
    Student student2 = new Student(100400L, "Maria", "Fajans");
    Student student3 = new Student(100200L, "Stefan", "Paca");
    Student student4 = new Student(10300L, "Harry", "Potter");

        Map<Long, Student> map = new TreeMap<>();

        map.put(student1.getNumerIndeksu(), student1);
        map.put(student2.getNumerIndeksu(), student2);
        map.put(student3.getNumerIndeksu(), student3);
        map.put(student4.getNumerIndeksu(), student4);

        if (map.containsKey(100200L)) { //L na końcu mówi, że numer jest typu L
            System.out.println("Mapa zawiera studenta o indeksie 100200.");
        } else {
            System.out.println("Mapa nie zawiera studenta o indeksie 100200.");
        }

        if (map.containsKey(100400L)) { //L na końcu mówi, że numer jest typu L
            System.out.println(map.get(100400L));
        } else {
            System.out.println("Mapa nie zawiera studenta o indeksie 100400.");
        }



        System.out.println("Liczba studentów wynosi: " + map.size());

        System.out.println("Lista studentów: ");
        for (Student s : map.values()) {
            System.out.println(s);
        }




    }
}
