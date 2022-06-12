import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\pawel\\IdeaProjects\\Lesson10.Task3\\src\\main\\java\\text.txt");

        String content = Files.readString(file.toPath());

        int characters = 0;
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) != ' ') {
                characters++;
            }
        }

        System.out.println(characters);
    }

}
