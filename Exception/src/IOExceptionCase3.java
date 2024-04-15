import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {
    public static void main(String[] args){
        try {
            md1();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void md1() throws IOException {       // IOException 예외 넘긴다고 명시
        md2();
    }

    public static void md2() throws IOException {
        Path file = Paths.get("/Users/jngmk/workspace/github/java/Exception/test.txt");
        BufferedWriter writer;
        writer = Files.newBufferedWriter(file);
        writer.write('B');
        writer.write('Y');

        if (writer != null)
            writer.close();
    }

    /*
        호출 과정: main -> md1 -> md2

        이 중 md2 내에서 IOException 예외가 발생할 수 있음. 그런데 IOException은 Exception을 상속함.
        따라서 이에 대해 다음과 같이 try/catch 문을 작성하거나,
            public static void md2() {
                try {
                    ...
                }
                catch (IOException e) {
                    ...
                }
            }
        아니면 다음과 같이 예외의 처리를, 이 메서드를 호출한 메서드에게 넘긴다는 표시를 해야 함.
            public static void md2() throws IOException { ... } -> 예외가 발생하면 넘기겠다...

        throws IOException은 IOException 예외가 메서드 내에서 발생할 경우 md2를 호출한 영역으로 예외의 처리를 넘긴다는 뜻임.
        그리고 예외를 넘기는 순간 md2 메서드의 호출은 종료가 됨.

        main 메서드에서는 try/catch문을 통해서 IOException을 직접 처리하거나 throws IOException 선언을 추가해서 예외의 처리를 넘겨야 함.
        main 메서드에서도 예외를 넘기면, 이 예외는 main을 호출한 가상머신에게 넘어감. 그러면 프로그램은 종료가 됨.

        Error를 상속하거나 RuntimeException을 상속하는 예외의 발생은 코드 작성 과정에서 특별히 무언가를 하지 않아도 됨.
        그러나 Exception을 상속하는 예외의 발생에 대해서는 try/catch 문을 통해서 예외를 처리하거나 throws 선언을 통해서 예외의 처리를 넘긴다는 표시를 꼭 해야 함.
    */
}
