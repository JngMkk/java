import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;

public class IOExceptionCase2 {
    public static void main(String[] args) {
//        Path file = Paths.get("/Users/jngmk/workspace/github/java/Exception/test.txt");
//        BufferedWriter writer = null;
//
//        writer = Files.newBufferedWriter(file);     // IOException 발생 가능
//        writer.write('A');                      // IOException 발생 가능
//        writer.write('Z');                      // IOException 발생 가능
//
//        if (writer != null)
//            writer.close();                         // IOException 발생 가능

        /*
            /Users/jngmk/workspace/github/java/Exception/src/IOExceptionCase2.java:12:41
                java: unreported exception java.io.IOException; must be caught or declared to be thrown

            Error 클래스를 상속하는 예외나 RuntimeException을 상속하는 예외의 경우 예외의 처리는 선택임.
            그러나 Exception 클래스를 상속하는(RuntimeException을 상속하지는 않는) 예외는 try/catch문으로 처리하거나 다른 영역으로 넘긴다고 반드시 명시해야 함.
        */
    }
}
