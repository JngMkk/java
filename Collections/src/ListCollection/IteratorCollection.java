package ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    Collection<E>가 Iterable<T>를 상속함.
    따라서 Collection<E>를 구현하는 자바의 제네릭 클래스는 Iterable<T>의 다음 추상 메서드를 모두 구현함.

        Iterator<T> iterator()

    이 메서드는 '반복자(iterator)'라는 것을 반환함.
    반복자는 저장된 인스턴스를 순차적으로 참조할 때 사용하는 인스턴스.

    반복자를 통해 호출할 수 있는 Iterator<E>의 메서드
        - boolean hasNext(): next 메서드 호출 시 참조 값 반환 가능 여부 확인
        - E next(): 다음 인스턴스의 참조 값을 반환
        - void remove(): next 메서드 호출을 통해 반환했던 인스턴스 삭제

    반복자는 next를 호출할 때마다 첫 번째 인스턴스를 시작으로 다음 인스턴스의 참조 값을 차례로 반환함.
    그리고 더 이상 반환할 대상이 없을 때 NoSuchElementException 예외를 발생시킴.
    for-each 문을 통한 순차 접근과 달리 반복자를 이용하면 반복 중간에 특정 인스턴스를 삭제하는 것이 가능.

    반복자는 생성과 동시에 첫 번째 인스턴스를 가리키고, next가 호출될 때마다 가리키는 대상이 다음 인스턴스로 옮겨짐.

    for-each문 또한 컴파일 과정에서 반복자를 이용하는 코드로 수정됨.

        for (String s : lst) -> for (Iterator<String> itr = lst.iterator(); itr.hasNext();)
*/
public class IteratorCollection {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Toy");
        lst.add("Box");
        lst.add("Robot");
        lst.add("Box");

        Iterator<String> itr = lst.iterator();      // 반복자 획득

        // 반복자를 이용한 순차 접근
        while (itr.hasNext())
            System.out.print(itr.next() + "\t");
        System.out.println();

        itr = lst.iterator();
        String str;
        while (itr.hasNext()) {
            str = itr.next();
            if (str.equals("Box"))
                itr.remove();
        }

        itr = lst.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + "\t");
        System.out.println();
    }
}
