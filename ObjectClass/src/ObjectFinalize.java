/*
    protected void finalize() throws Throwable (Object 클래스 메서드)

    이는 아무도 참조하지 않는 인스턴스가 가비지 컬렉션에 의해 소멸되기 전에 자동으로 호출되는 메서드.
    따라서 인스턴스 소멸 시 반드시 실행해야 할 코드가 있다면 이 메서드의 오버라이딩을 고려할 수 있음.
*/
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // java 9 부터 deprecated
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("destroyed: " + name);
    }
    /*
        사실 Object 클래스의 finalize 메서드는 하는 일이 아무것도 없음.
        따라서 위의 상황에서는 상위 클래스의 finalize 메서드 호출이 무의미함.
        그러나 예제의 Person 클래스가 다른 클래스를 상속한다면 상황이 달라짐.
        정리하면, 오버라이딩 하는 상위 클래스의 메서드가 본인이 정의한 클래스가 아니라면,
        특히 Object와 같이 자바에서 제공하는 클래스의 메서드라면 이렇듯 오버라이딩 된 메서드를 호출하는 것이 안전함.
    */
}

public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("B");

        p1 = null;
        p2 = null;

        System.gc();                // 가비지 컬렉션의 수행을 요청 (명령이 아님)
        System.runFinalization();   // 소멸이 보류된 인스턴스의 finalize 메서드 호출을 요청 (명령이 아님)

        System.out.println("End");
        /*
            gc() 메서드 호출을 통해 가비지 컬렉션의 수행을 요청할 수 있음.
            그러나 요청이 있었다고 하여 언제나 가비지 컬렉션을 바로 진행하지는 않음.
            다만 가비지 컬렉션을 진행하도록 가상머신이 노력을 할 뿐.
            그리고 가비지 컬렉션이 수행된다고 해도 소멸 대상을 그 순간 모두 소멸하지는 않음.
            시스템의 상황에 따라서 일부 인스턴스의 완전한 소멸은 보류될 수도 있음.
            따라서 필요하다면 runFinalization() 호출을 통해 보류된 인스턴스의 소멸까지 요청해야 함.
            그러나 이 역시 요청일 뿐.
        */
    }
}
