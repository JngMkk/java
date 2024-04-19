package SetCollection;

import java.util.HashSet;

class Num {
    private int num;
    public Num(int n) { num = n; }
    @Override
    public String toString() { return String.valueOf(num); }
}

/*
    HashSet<E>이 판단하는 동일 인스턴스 기준은 Object 클래스에 정의되어 있는 다음 두 메서드의 호출 결과를 근거로 함.
        public boolean equals(Object obj)
        public int hashCode()

    HashSet<E>의 인스턴스 존재 여부 탐색 과정
        1. Object 클래스에 정의된 hashCode 메서드의 반환 값을 기반으로 부류 결정
        2. 선택된 부류 내에서 equals 메서드를 호출하여 동등 비교
*/
public class HashSetEquality {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(8888));
        set.add(new Num(8888));
        set.add(new Num(8888));

        System.out.println("인스턴스 수: " + set.size());

        for (Num n : set)
            System.out.print(n.toString() + " ");
        System.out.println();
    }
}
