package ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        for (int num = 0; num < 5; num++) {
            System.out.println("I like Java " + num);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + ", " + j + "] ");
            }
            System.out.print("\n");
        }

        outer: for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ((i * j) == 72) {
                    System.out.println(i + " x " + j + " = " + i * j);
                    break outer;    // outer로 명시된 반복문까지 빠져나감.
                }
            }
        }
    }
}
