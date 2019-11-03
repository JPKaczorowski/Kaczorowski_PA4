import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count("problem1.txt");
        duplicateCounter.write("unique_words.txt");
    }
}
