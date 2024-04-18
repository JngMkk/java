package common;

public class BoundedBoxByInterface<T extends Eatable> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        System.out.println(obj.eat());
        return obj;
    }
}
