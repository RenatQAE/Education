package Edu.lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Counter {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("counter.txt"); //1

        if (Files.exists(filePath)) {
            //1. Прочитать данные из файла
            String content = Files.readString(filePath);

            //2. произвести действия с данными и файла
            int value = Integer.parseInt(content); // "1" -> 1
            value += 1;

            //3. ответ записать в файл
            String newContent = String.valueOf(value); // 2 -> "2"
            Files.writeString(filePath, newContent);
        } else {
            Files.writeString(filePath, "0");
        }
    }
}
