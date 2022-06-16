import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\pawel\\IdeaProjects\\Lesson10Task2\\src\\main\\java\\file.txt"));

        for (int i = 0; i < lines.size(); i++) {
            if (i % 2 == 0)
                System.out.println(lines.get(i));
        }

    }

}

