package mapa.Przyklad;

import java.util.HashMap;
import java.util.Map;

public class MainPrzyklad {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("123123", 5); //czas wyszuania w mapie jest 0(1) = zerowy
        map.put("123125", 5);

        System.out.println("Rozmiar mapy: " + map.size());

        map.put("123125", 10);
        System.out.println("Rozmiar mapy: " + map.size());



    }
}
