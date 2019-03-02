package mapa.Przyklad.mapa.zad1;

import java.util.*;

public class University {

    private Map<Long, Student> map = new HashMap<>();

    public void dodajStudenta(long indeks, String imie, String nazwisko) {
        map.put(indeks, new Student(indeks, imie, nazwisko));
    }

    /**
     * Generuje indeks jako najwyższy + 1
     * @param imie
     * @param nazwisko
     */

    public void dodajStudenta(String imie, String nazwisko) {
        List<Long> longList = new ArrayList<>(map.keySet());
        Long newIndex = (longList.get(longList.size() - 1) + 1);

        map.put(newIndex, new Student(newIndex, imie, nazwisko));
    }

    public boolean containsStudent(Long index) {
        return map.containsKey(index);
    }

    public Optional<Student> getStudent(Long index) {
        return Optional.ofNullable((map.get(index)));
    }

    public int studentsCout() {
        return map.size();
    }

    public void printAllStudents(){

    }





//    private long indexNumber;
//    private String name;
//    private String surname;
//
//    public University(long indexNumber, String name, String surname) {
//        this.indexNumber = indexNumber;
//        this.name = name;
//        this.surname = surname;
//    }
//
//    public void addStudent(long indexNumber, String name, String surname) {
//
//    }

//    public boolean containsStudent(long indexNumber) {
//        if (indexNumber == ) {
//            System.out.println("Taki student już istnieje - " +
//                    "spróbuj ponownie.");
//        }
//    }
//
//    public Student getStudent(long indexNumber) {
//        System.out.println("Student o zadanym numerze to: " + );
//    }
//

}
