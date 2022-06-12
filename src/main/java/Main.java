import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Files.writeString(Path.of("C:\\Users\\pawel\\IdeaProjects\\Lesson10Task0\\src\\main\\java"), "Kurs" + "\n" + "Java" + "\n" + "Lekcja 6" +
                "\n" + "Pliki" + "\n" + "Wyjątki" + "\n" + "Pliki" + "\n" + "Koniec Pliku");

    }
}


