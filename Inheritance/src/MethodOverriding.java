class MobilePhone {
    protected String number;
    public MobilePhone(String num) {
        this.number = num;
    }
    public void answer() {
        System.out.println("Hi~ MobilePhone from " + this.number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;
    public SmartPhone(String num, String ver) {
        super(num);
        this.androidVer = ver;
    }
    public void answer() {
        System.out.println("Hi~ SmartPhone from " + this.number);
    }
    public void playApp() {
        System.out.println("App is running in " + this.androidVer);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SmartPhone p1 = new SmartPhone("010-5555-7777", "8.0");
        MobilePhone p2 = new SmartPhone("010-7777-5555", "9.0");
        p1.answer();
        p1.playApp();

        p2.answer();
        // p2.playApp(); -> 호출 불가능.
        // p2는 MobilePhone형 참조변수. 접근이 가능한 멤버는 MobilePhone 클래스에 정의되었거나 이 클래스가 상속하는 클래스의 멤버로 제한.
        // 자바는 메서드 호출 시 '참조변수의 type'을 참조하여 그 메서드 호출이 옳은 것인지 판단함. (속도의 효율을 위해)
    }
}
