import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {

    private HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) throws IOException {
        Scanner s = new Scanner(new File(dataFile));

        while(s.hasNext())
        {
            uniqueWords.add(s.next());
        }
        s.close();

    }

    public void write(String outputFile) throws IOException {
        PrintWriter p = new PrintWriter(new File(outputFile));

        for(String word : uniqueWords) {
            p.println(word);
        }
        p.close();
        p.flush();
    }

}
