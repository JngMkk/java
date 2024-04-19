package SetCollection;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

/*
    Comparator<T> 인터페이스를 기반으로 TreeSet<E>의 정렬 기준 제시

    public interface Comparator<T>
        : int compare(T o1, T o2)의 구현을 통해 정렬 기준을 결정할 수 있음.

    이 인터페이스를 구현한 클래스의 인스턴스는 TreeSet<E>의 다음 생성자를 통해 전달할 수 있음.

    public TreeSet(Comparator<? super E> comparator)
*/
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age;
    }
}

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class SortedTreeSetWithComparable {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("Y", 37));
        tree.add(new Person("P", 53));
        tree.add(new Person("K", 11));

        for (Person p : tree)
            System.out.println(p);

        TreeSet<Person> tree2 = new TreeSet<>(new PersonComparator());
        tree2.add(new Person("Y", 37));
        tree2.add(new Person("P", 53));
        tree2.add(new Person("K", 11));

        for (Person p : tree2)
            System.out.println(p);

        // String 클래스는 본래 사전 편찬 순으로 정렬됨.
        TreeSet<String> tree3 = new TreeSet<>(new StringComparator());
        tree3.add("Box");
        tree3.add("Rabbit");
        tree3.add("Robot");

        for (String s : tree3)
            System.out.println(s);
    }
}
