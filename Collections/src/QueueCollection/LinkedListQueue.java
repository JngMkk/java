package QueueCollection;

import java.util.LinkedList;
import java.util.Queue;

/*
    boolean add(E e): 넣기
    E remove(): 꺼내기
    E element(): 확인하기

    위 세 메서드는 꺼낼 인스턴스가 없을 때 혹은 저장 공간이 부족할 때 예외를 발생시킴.
    반면에 Queue<E> 인터페이스의 다음 세 메서드는 동일한 상황에서 예외를 발생시키지 않고 해당 상황을 알리기 위한 특정 값(null 또는 false)을 반환함.

    boolean offer(E e): 넣기, 넣을 공간 부족하면 false 반환
    E poll(): 꺼내기, 꺼낼 대상 없으면 null 반환
    E peek(): 확인하기, 확인할 대상 없으면 null 반환
*/
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        System.out.println("next: " + que.peek());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println("next: " + que.peek());
        System.out.println(que.poll());
    }
}
