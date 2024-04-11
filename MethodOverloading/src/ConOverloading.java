/*
    한 클래스 내에 동일한 이름의 메소드를 둘 이상 정의하는 것은 허용되지 않음.
    그러나 매개변수의 선언이 다르면 가능함. 이것을 메서드 오버로딩이라고 함.
    구체적으로 매개변수의 수 또는 type이 달라야 함.
    반환형이 다른 경우에는 메서드 오버로딩이 성립하지 않음.
*/

class Person {
    private int regiNum;
    private int passNum;

    // 생성자도 오버로딩 할 수 있음.
    Person(int rNum, int pNum) {
        regiNum = rNum;
        passNum = pNum;
    }
    Person(int rNum) {
        // regiNum = rNum;
        // passNum = 0;
        this(rNum, 0);      // rNum과 0을 인자로 받는 다른 생성자를 호출
    }
    void showPersonalInfo() {
        System.out.println("주민등록 번호: " + regiNum);

        if (passNum != 0) {
            System.out.println("여권 번호: " + passNum + '\n');
        } else {
            System.out.println("여권을 가지고 있지 않습니다.\n");
        }
    }
}

class ConOverloading {
    public static void main(String[] args) {
        // 여권 있는 사람
        Person a = new Person(335577, 112233);
        // 여권 없는 사람
        Person b = new Person(775544);

        a.showPersonalInfo();
        b.showPersonalInfo();
    }
}