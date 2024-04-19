import java.util.*;

/*
    List<E>를 구현한 컬렉션 클래스들은 저장된 인스턴스를 정렬된 상태로 유지하지 않음.
    대신에 정렬을 해야 한다면 다음 메서드를 사용할 수 있음.
        public static <T extends Comparable<? super T>> void sort(List<T> list)

    위의 메서드는 Collections 클래스에 정의되어 있는 제네릭 메서드.
    분석하면,
        public static <T> void sort(List<T> list)
            -> 메서드 호출 시점에 T가 결정되므로 List<T>의 인스턴스는 모두 전달 가능

        public static <T extends Comparable<T>> void sort(List<T> list)
            -> T는 Comparable<T> 인터페이스를 구현한 상태여야 함.
*/
public class sortCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        lst = new ArrayList<>(lst);

        // 정렬 이전
        for (String s : lst)
            System.out.print(s + " ");
        System.out.println();

        // 정렬
        Collections.sort(lst);

        for (String s : lst)
            System.out.print(s + " ");
        System.out.println();
    }
}
