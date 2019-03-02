package lista.zadanie6;

public class Liczby {

    private String numerek;

    public Liczby(String numerek) {
        this.numerek = numerek;
    }

    public String getNumerek() {
        return numerek;
    }

    public void setNumerek(String numerek) {
        this.numerek = numerek;
    }

    @Override
    public String toString() {
        return "Liczby{" +
                "numerek='" + numerek + '\'' +
                '}';
    }
}
