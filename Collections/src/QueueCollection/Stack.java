package QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

/*
    스택의 구현

    자바는 기본 자료구조 대부분을 지원함. 스택 자료구조도 컬렉션 클래스 Stack<E>를 통해 지원하고 있음.
        public class Stack<E> extends Vector<E>

    그러나 Stack<E>는 자바 초기에 정의된 클래스로써 지금은 이전 코드와의 호환성 유지를 위해 존재하는 클래스일 뿐임.
    Stack<E>는 동기화된 클래스로 멀티 쓰레드에 안전하지만, 그만큼의 성능의 저하가 발생함.
    때문에 이 클래스의 사용은 권할 만한 일이 아님. 대신에 자바 6에서 스택을 대신할 수 있는 Deque가 포함됨.

    public interface Deque<E> extends Queue<E>

    void addFirst(E e)
    E removeFirst()
    E getFirst()
    void addLast(E e)
    E removeLast()
    E getLast()

    위 메서드들은 꺼낼 대상이 없을 때 혹은 공간이 부족해서 넣지 못할 때 예외를 발생시킴.

    boolean offerFirst(E e): 공간 부족하면 false
    E pollFirst(): 꺼낼 대상 없으면 null
    E peekFirst(): 확인할 대상 없으면 null
    boolean offerLast(E e)
    E pollLast()
    E peekLast()
*/
public class Stack {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();

        deq.offerFirst("Box");
        deq.offerFirst("Toy");
        deq.offerFirst("Robot");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
