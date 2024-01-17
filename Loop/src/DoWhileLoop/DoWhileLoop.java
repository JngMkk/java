package DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        // 먼저 중괄호 영역 실행
        // 조건 검사 후 결과가 true면 반복 결정
        int num = 0;

        do {
            System.out.println("I like Java " + num);
            num++;
        } while (num < 5);
    }
}
