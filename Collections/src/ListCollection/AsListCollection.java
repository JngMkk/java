package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


// Exception in thread "main" java.lang.UnsupportedOperationException: remove

/*
    배열보다는 컬렉션 인스턴스가 좋음 (컬렉션 변환)

    배열과 ArrayList<E>는 특성이 유사함. 그런데 대부분의 경우 배열보다 ArrayList<E>가 더 좋음.
    첫 번째 이유로 인스턴스의 저장과 삭제가 편함.
    두 번째 이유로 '반복자'를 쓸 수 있음.
    단 배열처럼 선언과 동시에 초기화를 할 수 없어서 초기에 무엇인가를 채워 넣는 일이 조금 번거로움.
    하지만 다음과 같이 컬렉션 인스턴스를 생성할 수 있어서 문제가 되지 않음.
        List<String> lst = Arrays.asList("Toy", "Box", "Robot", "Box");
            -> 인자로 전달된 인스턴스들을 저장한 컬렉션 인스턴스의 생성 및 반환

    그런데 이렇게 생성된 컬렉션 인스턴스는 새로운 인스턴스의 추가나 삭제가 불가능함.
    물론 반복자의 생성은 가능하나 이를 통해서도 참조만 가능할 뿐임.
    따라서 새로운 인스턴스의 추가나 삭제가 필요한 상황이라면 다음 생성자를 기반으로 ArrayList<E> 인스턴스를 생성해야 함.
        class ArrayList<E> {
            public ArrayList(Collection<? extends E> c) { ... }
        }

    해석하면,
        public ArrayList(Collections<E> c)
            -> Collection<E>를 구현한 컬렉션 인스턴스를 인자로 전달받음.
            -> 그리고 E는 인스턴스 생성 과정에서 결정되므로 무엇이든 될 수 있음.

        public ArrayList(Collection<? extends E> c)
            -> 매개변수 c로 전단될 컬렉션 인스턴스에서는 참조만(꺼내기만) 가능함.

    List<String> lst = Arrays.asList("Toy", "Box", "Robot", "Box");
    lst = new ArrayList<>(lst);

    위와 같이 ArrayList<E> 인스턴스를 생성하면, 생성자로 전달된 컬렉션 인스턴스에 저장된 모든 데이터가 새로 생성되는 ArrayList<E> 인스턴스에 복사됨.
*/
public class AsListCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Toy", "Box", "Robot", "Box");
        lst = new ArrayList<>(lst);

        for (Iterator<String> it = lst.iterator(); it.hasNext();)
            System.out.print(it.next() + "\t");
        System.out.println();

        for (Iterator<String> it = lst.iterator(); it.hasNext();)
            if (it.next().equals("Box"))
                it.remove();

        for (Iterator<String> it = lst.iterator(); it.hasNext();)
            System.out.print(it.next() + "\t");
        System.out.println();
    }
    /*
        Toy Box Robot Box
        Box Robot Robot2 Box Toy2 Toy
        Toy Toy2 Box Robot2 Robot Box
    */
}
