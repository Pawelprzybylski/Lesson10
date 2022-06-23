import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class TextUtils {

    public static void changeLowerCaseToUpperCase() throws IOException {

        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10.Task6\\src\\main\\Text.txt");

        String content = Files.readString(file.toPath());

        String textToUpperCase = content.toUpperCase(Locale.ROOT);

        Files.writeString(Path.of("C:\\Users\\pawel\\IdeaProjects\\Lesson10.Task6\\src\\main\\java\\output.txt"), textToUpperCase);

    }

}


