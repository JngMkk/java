package ListCollection;

import java.util.ArrayList;
import java.util.List;

/*
    public ArrayList(): 10개의 인스턴스를 저장할 수 있는 공간을 미리 확보
    public ArrayList(int initialCapacity): 인자로 전달된 수의 인스턴스를 저장할 수 있는 공간을 미리 확보

    저장해야 할 인스턴스 수가 대략 계산이 된다면 위의 생성자를 통해서 적장한 길이의 배열을 미리 만들어 두는 것이 성능 향상에 도움이 됨.

    장점
        - 저장된 인스턴스 참조가 빠름 (랜덤 접근)

    단점
        - 저장 공간을 늘리는 과정에서 시간이 비교적 많이 소요됨.
        - 배열 중간에 위치한 인스턴스 삽입, 삭제 과정에서 많은 연산이 필요할 수 있음.
*/
public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Toy");
        lst.add("Box");
        lst.add("Robot");

        for (int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i) + "\t");
        System.out.println();

        lst.remove(0);

        for (int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i) + "\t");
        System.out.println();

        // EnhancedFor
        for (String s : lst)
            System.out.print(s + "\t");
        System.out.println();

        /*
            for-each문을 통한 순차적 접근의 대상이 되려면, 해당 컬렉션 클래스는 다음 인터페이스를 구현해야 함.

            public interface Iterable<T>

            Collection<E>가 Iterable<T>를 상속하고, ArrayList<E>, LinkedList<E> 클래스는 Collection<E> 인터페이스를 구현하고 있음.

            public interface Collection<E> extends Iterable<E>

            이렇듯 Iterable<T>를 직접 혹은 간접적으로 구현하는 클래스의 인스턴스를 대상으로 for-each문을 구성할 수 있음.
        */
    }
}
