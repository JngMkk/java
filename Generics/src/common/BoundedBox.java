package common;

// 인스턴스 생성 시 타입 인자로 Number 혹은 이를 상속하는 클래스만 올 수 있음.
public class BoundedBox<T extends Number> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}
