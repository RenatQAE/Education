package Edu.lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Playground {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("students.txt");

        Files.writeString(filePath, "Евгения Машкина", StandardOpenOption.APPEND);
        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);

        System.out.println("Конец");
        List<String> s = Files.readAllLines(filePath);
    }
}
