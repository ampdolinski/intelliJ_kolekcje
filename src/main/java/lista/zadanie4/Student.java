package lista.zadanie4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> ocenyStudenta = new ArrayList<>();  //to jest dobry pomysł
    private String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(List<Double> ocenyStudenta, String numerIndeksu, String imie, String nazwisko) {
        this.ocenyStudenta = ocenyStudenta;
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public List<Double> getOcenyStudenta() {
        return ocenyStudenta;
    }

    public void setOcenyStudenta(List<Double> ocenyStudenta) {
        this.ocenyStudenta = ocenyStudenta;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ocenyStudenta=" + ocenyStudenta +
                ", numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}


