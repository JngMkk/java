package common;

public class Box<T> {
    protected T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    @Override
    public String toString() {
        return obj.toString();
    }
}
