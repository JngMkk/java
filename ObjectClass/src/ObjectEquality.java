class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum) obj).num;
    }
}

// ==: 참조 값 비교(메모리)
// equals(): 내용 비교
public class ObjectEquality {
    public static void main(String[] args) {
        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if (num1.equals(num2))
            System.out.println("num1, num2 동일");
        else
            System.out.println("num1, num2 동일 x");

        if (num1.equals(num3))
            System.out.println("num1, num3 동일");
        else
            System.out.println("num1, num3 동일 x");

        System.out.println(num1 == num3);
        System.out.println(num1);
    }
}
