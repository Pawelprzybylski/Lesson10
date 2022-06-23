import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TextUtils {

    public static void printNumberOfCharacters() throws IOException {

        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10.Task3\\src\\main\\java\\text.txt");

        String content = Files.readString(file.toPath());

        int numberOfCharacters = 0;
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) != ' ') {
                numberOfCharacters++;
            }
        }

        System.out.println(numberOfCharacters);

    }

}

