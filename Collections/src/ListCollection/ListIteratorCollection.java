package ListCollection;

import java.util.*;

/*
    List<E>를 구현하는 클래스의 인스턴스들만 얻을 수 있는 '양방향 반복자'가 있음.
    양방향 반복자는 배열이나 연결 리스트와 같은 자료구조의 특성상 가능한 일.

        E next(): 다음 인스턴스의 참조 값 반환
        boolean hasNext(): next 메서드 호출 시 참조 값 반환 가능 여부
        void remove(): next 메서드 호출을 통해 반환했던 인스턴스 삭제
        E previous(): 이전 인스턴스의 참조 값 반환
        boolean hasPrevious(): previous 메서드 호출 시 참조 값 반환 가능 여부
        void add(E e): 인스턴스 추가 (현재 위치)
        void set(E e): 인스턴스 변경
*/
public class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Toy", "Box", "Robot", "Box");
        lst = new ArrayList<>(lst);

        // 양방향 반복자
        ListIterator<String> lit = lst.listIterator();
        String str;

        while (lit.hasNext()) {
            str = lit.next();
            System.out.print(str + " ");
            if (str.equals("Toy"))
                lit.add("Toy2");
        }
        System.out.println();

        while (lit.hasPrevious()) {
            str = lit.previous();
            System.out.print(str + " ");
            if (str.equals("Robot"))
                lit.add("Robot2");
        }
        System.out.println();

        for (Iterator<String> it = lst.iterator(); it.hasNext();)
            System.out.print(it.next() + " ");
        System.out.println();
    }
}
