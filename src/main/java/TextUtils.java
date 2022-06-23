import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextUtils {

    static List<String> lines;

    static {
        try {
            lines = Files.readAllLines(Path.of("C:\\Users\\pawel\\IdeaProjects\\Lesson10Task2\\src\\main\\java\\file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printSecondLine() {
        for (int i = 0; i < lines.size(); i += 2)
        System.out.println(lines.get(i));
    }

}
