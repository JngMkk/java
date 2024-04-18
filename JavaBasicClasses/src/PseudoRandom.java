import java.util.Random;

/*
    Seed 기반 난수 생성

        컴퓨터를 이용한 난수의 생성은 생각보다 어려운 일.
        컴퓨터는 알고리즘을 기반으로 일을 하기 때문에 난수를 생성하는 데에도 숨겨진 패턴이 존재할 수밖에 없음.
        비록 쉽게 파악할 수 없을지라도 분명 패턴은 존재함.
        그래서 컴퓨터가 생성하는 난수를 가리켜 'Pseudo-random number(가짜 난수)'라 함.

        Random 인스턴스를 만들 때 seed 값을 전달하면, 알고리즘이 이 숫자를 기반으로 돌아가기 때문에 이 값이 같으면 난수의 패턴은 100% 일치함.
        Random 클래스에 seed 값을 전달하지 않으면, 내부적으로 seedUniquifier() ^ System.nanoTime()을 통한 seed 값을 만듦.
        그리고 setSeed 메서드를 통해 언제든지 새로운 seed 값을 지정할 수 있음.
*/
public class PseudoRandom {
    public static void main(String[] args) {
        Random rand = new Random(12);       // 생성자로 seed 값 전달

        for (int i = 0; i < 8; i++) {
            System.out.println(rand.nextInt(1000));
        }
    }
}
