import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TextUtils {

    public static void printReverseText() throws IOException {

        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10.Task3\\src\\main\\java\\text.txt");

        String content = Files.readString(file.toPath());

        String reverseText = new StringBuilder(content).reverse().toString();

        System.out.println(reverseText);

    }

}
