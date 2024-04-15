import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/jngmk/workspace/github/java/Exception/test.txt");

        /*
            () 안에는 종료의 과정을 필요로 하는 리소스를 생성
            java.lang.AutoCloseable 인터페이스를 상속하였기 때문에 가능

            이 인터페이스에는 다음 추상 메서드가 존재
                void close() throws Exception

            즉, try-with-resource문에서 호출하는 메서드는 AutoCloseable 인터페이스의 close 메서드임.
            둘 이상의 리소스에 대해서도 try-with-resource문을 구성할 수 있음.
                try ( resource1; resource2 ) { ... }
                catch (Exception name) { ... }
        */
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write('D');
            writer.write('W');
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
