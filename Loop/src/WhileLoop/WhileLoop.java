package WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 0;
        while (num < 5) {
            System.out.println("I like Java " + num);
            num++;
        }

        int n = 1;
        boolean search = false;
        while (n < 100) {
            if (((n % 5) == 0) && ((n % 7) == 0)) {
                search = true;
                break;
            }

            n++;
        }
        if (search) {
            System.out.println("찾는 정수: " + n);
        } else {
            System.out.println("5의 배수이자 7의 배수인 정수를 찾지 못했습니다.");
        }

        num = 0;
        int cnt = 0;
        while ((num++) < 100) {
            if (((num % 5) != 0) || ((num % 7) != 0)) {
                continue;
            }

            cnt++;
            System.out.println(num);
        }
        System.out.println("Count: " + cnt);

        num = 1;
        while (true) {
            if (((num % 6) == 0) && ((num % 14) == 0)) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
