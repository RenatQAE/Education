package Edu.lesson7.Demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private int year;
    private List<Film> filmList;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
        this.filmList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name) && Objects.equals(filmList, company.filmList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, filmList);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", filmList=" + filmList +
                '}';
    }
    public void addFilm(Film film){
        this.filmList.add(film);
    }
}
