class Cakee {
    public int size;
    public Cakee(int size) {
        this.size = size;
    }
    public void showCakeSize() {
        System.out.println("Cake Size: " + this.size);
    }
}

class CheeseCakee extends Cakee {
    public int size;
    public CheeseCakee(int size1, int size2) {
        super(size1);
        this.size = size2;
    }
    public void showCakeSize() {
        super.showCakeSize();
        System.out.println("Cheese Size: " + this.size);
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        CheeseCakee c1 = new CheeseCakee(5, 7);
        Cakee c2 = c1;

        // 인스턴수 변수는 오버라이딩 되지 않는다.
        System.out.println("Cake Size: " + c2.size);
        System.out.println("----------------------------");
        System.out.println("Cheese Size: " + c1.size);
        System.out.println("----------------------------");
        c1.showCakeSize();
        System.out.println("----------------------------");
        // 오버라이딩 하면, 참조변수의 형에 상관없이 오버라이딩 한 메서드가 오버라이딩 된 메서드를 대신하게 됨.
        c2.showCakeSize();
    }
}
