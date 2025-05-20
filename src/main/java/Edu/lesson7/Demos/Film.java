package Edu.lesson7.Demos;

import java.util.Objects;

public class Film {
    String title;

    public Film(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                '}';
    }
}
