import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;

public class IOExceptionCase {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/jngmk/workspace/github/java/Exception/test.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);     // IOException 발생 가능
            writer.write('A');                      // IOException 발생 가능
            writer.write('Z');                      // IOException 발생 가능

            if (writer != null)
                writer.close();                         // IOException 발생 가능
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
