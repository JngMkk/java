import java.util.Arrays;

/*
    인스턴스의 참조 값을 저장하고 있는 배열에 대한 정렬을 어떻게 진행?

    interface Comparable
        -> int compareTo(Object o) 메서드 구현을 통해 인스턴스의 순서 판단 기준을 결정
    위 인터페이스의 구현을 기반으로 프로그래머가 클래스 별로 결정하게 되어 있음.

    위 인터페이스에 존재하는 추상 메서드 compareTo의 구현 방법은
        - 인자로 전달된 o가 작다면 양의 정수 반환
        - 인자로 전달된 o가 크다면 음의 정수 반환
        - 인자로 전달된 o가 같다면 0을 반환
*/
public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        for (Person p : ar)
            System.out.println(p);

        int idx = Arrays.binarySearch(ar, new Person("Who r u?", 37));  // compareTo 기반으로 탐색
        System.out.println(ar[idx]);
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

//        if (this.age > p.age)
//            return 1;
//        else if (this.age < p.age)
//            return -1;
//        else
//            return 0;
//        return Integer.compare(this.age, p.age);
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
