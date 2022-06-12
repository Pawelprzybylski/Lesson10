import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10Task4\\src\\main\\text.txt");

        String content = Files.readString(file.toPath());

        boolean isWordInText = content.contains("Any text");

        System.out.println(isWordInText);
    }

}
