package SetCollection;

import java.util.HashSet;

class Num2 {
    private int num;
    public Num2(int n) { num = n; }
    @Override
    public String toString() {
        return String.valueOf(num);
    }
    @Override
    public int hashCode() {
        return num % 3;
    }
    @Override
    public boolean equals(Object obj) {
        return num == ((Num2)obj).num;
    }
}

public class HashSetEquality2 {
    public static void main(String[] args) {
        HashSet<Num2> set = new HashSet<>();
        set.add(new Num2(8888));
        set.add(new Num2(8888));
        set.add(new Num2(8888));
        System.out.println("인스턴스 수: " + set.size());

        for (Num2 n : set)
            System.out.print(n.toString() + " ");
        System.out.println();
    }
}
