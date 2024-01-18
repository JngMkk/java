package Method;

public class Method {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        System.out.print("\n");

        double myHeight = 175.9;
        hiEveryOne(12, 12.5);
        hiEveryOne(13, myHeight);
        byeEveryOne();

        System.out.print("\n");
        System.out.println("프로그램의 끝");
    }

    public static void hiEveryOne(int age, double height) {
        System.out.println("제 나이는 " + age + "세 입니다.");
        System.out.println("저의 키는 " + height + "cm 입니다.");
    }

    public static void byeEveryOne() {
        System.out.println("다음에 뵙겠습니다.");
    }
}
