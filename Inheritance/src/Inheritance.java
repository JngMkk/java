/*
    상속은 연관된 일련의 클래스들에 대해 공통적인 규약을 정의할 수 있음.
    상속을 단순하게 설명하면, 기존에 정의된 클래스에 메서드와 변수를 추가하여 새로운 클래스를 정의하는 것이 상속.
*/

class SuperCLS {
    public SuperCLS() {
        System.out.println("Super Class");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {
        System.out.println("Sub Class");
    }
}

class SuperCLS2 {
    public SuperCLS2() {
        System.out.println("Con: SuperCLS2()");
    }
    public SuperCLS2(int i) {
        System.out.println("Con: SuperCLS2(int i)");
    }
    public SuperCLS2(int i, int j) {
        System.out.println("Con: SuperCLS2(int i, int j)");
    }
}

class SubCLS2 extends SuperCLS2 {
    public SubCLS2() {
        System.out.println("Con: SubCLS2()");
    }
    public SubCLS2(int i) {
        super(i);
        System.out.println("Con: SubCLS2(int i)");
    }
    public SubCLS2(int i, int j) {
        super(i, j);
        System.out.println("Con: SubCLS2(int i, int j)");
    }
}

class Man {
    String name;
    public Man(String name) {
        this.name = name;
    }
    public void tellYourName() {
        System.out.println("My name is " + this.name);
    }
}

class BusinessMan extends Man {
    String company, position;
    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }
    public void tellYourInfo() {
        System.out.println("My company is " + this.company);
        System.out.println("My position is " + this.position);
        tellYourName();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        new SubCLS();
        /*
            Super Class
            Sub Class

            하위 클래스의 생성자에서 상위 클래스의 생성자를 명시적으로 호출하지 않으면, 인자를 받지 않는 생성자가 자동으로 호출됨.
        */

        System.out.print("1. ");
        new SubCLS2();
        System.out.print('\n');

        System.out.print("2. ");
        new SubCLS2(1);
        System.out.print('\n');

        System.out.print("3. ");
        new SubCLS2(2, 3);
        System.out.print('\n');

        BusinessMan man = new BusinessMan("K", "SA", "M");
        man.tellYourInfo();
    }
}