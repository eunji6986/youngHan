package lovepower.hellospring.concept;

public class StaticMethod {

    long a, b;

    //인스턴스 메서드
    long add() {
        return a + b;
    }

    //static 메서드 (혹은 class 메서드)
    static long minus(long a, long b) {
        return a - b;
    }

    public static void main(String[] args) {
        StaticMethod sm = new StaticMethod();
        sm.a = 10;
        sm.b = 15;
        System.out.println(sm.add());

        System.out.println(StaticMethod.minus(15,30));
    }

    String kind;
    int number;

    static int width = 100; //폭
    static int hetght = 250; //높이
}
