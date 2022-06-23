import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TextUtils {

    public static void getWord(String searchingWord) {
        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10Task4\\src\\main\\text.txt");

        String content = null;
        try {
            content = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isWordInText = content.contains(searchingWord);

        System.out.println(isWordInText);
    }

}
