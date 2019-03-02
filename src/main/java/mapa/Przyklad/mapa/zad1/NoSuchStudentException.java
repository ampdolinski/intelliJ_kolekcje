package mapa.Przyklad.mapa.zad1;

public class NoSuchStudentException extends RuntimeException{
    public NoSuchStudentException(){
        super("Nie ma takiego studenta.");
    }
}
