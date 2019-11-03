import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

    private HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException {
        Scanner s = new Scanner(new File(dataFile));

        while (s.hasNext()) {
            String word = s.next();

            Integer numWords = wordCounter.get(word);

            if (numWords == null){
                numWords = 0;
                wordCounter.put(word, (numWords + 1));
            }
            else {
                wordCounter.put(word, (numWords + 1));
            }
        }
        s.close();
    }

    public void write(String outputFile) throws IOException {
        PrintWriter p = new PrintWriter(new File(outputFile));

        for(String word : wordCounter.keySet()) {
            p.println(word + ": " + wordCounter.get(word));
        }
        p.close();
        p.flush();
    }

}
