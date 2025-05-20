package Edu.lesson7.Demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Company c1 = new Company("MGM", 1937);
        Company c2 = new Company("WB", 1936);

        Map<Company, Integer> filmsByCompany = new HashMap<>();

        filmsByCompany.put(c1, 200);
        filmsByCompany.put(c2, 200);
        filmsByCompany.put(c1, 201);

        List<Company> companies = new ArrayList<>();
        c1.addFilm(new Film("Дом у дороги 1"));

        c1.getFilmList().add(new Film("Дом у дороги 1"));
        c1.getFilmList().add(new Film("Дом у дороги 2"));
        c1.getFilmList().add(new Film("Дом у дороги 3"));

        companies.add(c1);
        companies.add(c2);
    }
}