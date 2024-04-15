import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/jngmk/workspace/github/java/Exception/test.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);
            writer.write('C');
            writer.write('X');
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (writer != null)
                    writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
