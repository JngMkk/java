## 언제 와일드카드에 제한을 걸어야 하는가?

### 상한 제한의 목적 / 하한 제한의 목적

```java
// Box.java
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
```

```java
// Toy.java
package common;

public class Toy {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}
```

```java
// BoxHandler.java
package common;

public class BoxHandler {
    public static void outBox(Box<Toy> box) {
        Toy t = box.get();
        System.out.println(t);
    }

    public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
    }
}
```

```java
// BoundedWildcardBase.java
import common.Box;
import common.BoxHandler;
import common.Toy;

public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
```

```
위 예제에서 관심에 두어야 할 부분은 BoxHandler 클래스에 정의된 두 메서드.

public static void outBox(Box<Toy> box) {
        Toy t = box.get();
        System.out.println(t);
}

public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
}

outBox는 상자에서 물건을 꺼낼 때 사용하는 메서드. 반면, inBox는 상자에 물건을 넣을 때 사용하는 메서드.
둘 다 잘 정의되었고 잘 동작함.
그러나 잘 만들어진 코드는 "필요한 만큼만 기능을 허용하여, 코드의 요류가 컴파일 과정에서 최대한 발견되도록 함." 조건을 만족해야 함.

outBox 메서드는 매개변수 box를 대상으로 get은 물론 set의 호출도 가능함.
따라서 "outBox 메서드 내에서 실수로 set 메서드를 호출하여 임의의 인스턴스를 넣음" 같은 유형의 오류를 범할 수 있음.
이러한 오류는 컴파일 과정에서 발견되지 않음.
때문에 outBox 메서드를 정의할 때에는 매개변수 box를 대상으로 get은 가능하지만 set은 불가능하도록 제한을 거는 것이 좋음.
이러한 일이 필요한 만큼만 기능을 허용하여, 코드의 오류가 컴파일 과정에서 최대한 발견되도록 하는 것임.

outBox를 다음과 같이 정의하면 get은 가능하지만 set은 불가능하게 된다.

public static void outBox(Box<? extends Toy> box) {
		box.get();
		box.set(new Toy());		// 컴파일 오류
}

위의 상황에서 set 메서드 호출이 불가능한 이뉴는 매개변수로 Toy 인스턴스를 저장할 수 있는 상자만(Box<T> 인스턴스만) 전달된다는 사실을 보장할 수 없기 때문.
Toy 클래스는 다른 클래스들에 의해 얼마든지 상속될 수 있으므로 Box<Car> 등의 인자가 전달될 수 있음.
그러므로 box에 Toy 인스턴스를 담을 수 없게됨.

마찬가지로, inBox 메서드 또한 좋은 코드가 되기 위한 조건을 만족하지 못함.
이 메서드는 상자에 인스턴스를 저장하는 것이 목적이나, get 메서드를 호출하는 코드가 수행될 수 있음.
inBox 메서드를 다음과 같이 선언하면 set은 가능하지만 get은 불가능하게 됨.

public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
		Toy myToy = box.get();		// 컴파일 오류
}

컴파일 오류 발생 이유는 반환형을 Toy로 결정할 수 없기 때문.
즉 get 메서드 호출 자체는 문제 되지 않으나, 반환되는 값을 저장하기 위해 선언한 참조변수의 형을 Toy로 결정했다는 사실에서 문제가 발생.


매개변수: Box<? extends Toy> box
	-> box가 참조하는 인스턴스를 대상으로 꺼내는 작업만 허용하겠다는 의미

매개변수: Box<? super Toy> box
	-> box가 참조하는 인스턴스를 대상으로 넣는 작업만 허용하겠다는 의미
```



### 제한된 와일드카드 선언을 갖는 제네릭 메서드

```java
// Robot.java
public class Robot {
  	@Override
  	public String toString() {
      	return "I am a Robot";
    }
}

// BoundedBoxHandler.java
public class BoundedBoxHandler {
    public static void outBox(Box<? extends Toy> box) { ... }
    public static void outBox(Box<? extends Robot> box) { ... }

    public static void inBox(Box<? super Toy> box, Toy n) { ... }
    public static void inBox(Box<? super Robot> box, Robot n) { ... }
}
```

```
BoundedBoxHandler 클래스에서 위 두 메서드는 오버로딩이 성립하지 않고, 아래 두 메서드는 오버로딩이 성립된다.
아래 두 메서드는 두 번째 매개변수로 인해 성립이 되는 것.

위 두 메서드가 오버로딩이 성립되지 않는 것은 기술적인 문제에 기인함.
자바는 제네릭 등장 이전에 정의된 클래스들과의 상호 호환성 유지를 위해 컴파일 시 제네릭과 와일드카드 관련 정보를 지우는 과정을 거침.
즉 위 두 매개변수 선언은 컴파일 과정에서 다음과 같이 수정이 되고, 이로 인해 메서드의 오버로딩이 성립 불가능한 상태가 됨.
Box<? extends Toy> box -> Box box
Box<? extends Robot> box -> Box box

위와 같이 컴파일러가 제네릭 정보를 지우는 행위를 가리켜 'Type Erasure'라 함.
따라서 위와 같이 오버로딩을 하고 컴파일 하면 다음 메시지가 포함된 에러 메시지가 출력됨.
name clash: outBox(Box<? extends Robot>) and outBox(Box<? extends Toy>) have the same erasure
```

```java
// 해결 방법: 제네릭 메서드
public class BoundedBoxHandler {
  	public static void outBox(Box<? extends T> box) {...}
  	public static void inBox(box<? super T> box, T n) {...}
}
```



