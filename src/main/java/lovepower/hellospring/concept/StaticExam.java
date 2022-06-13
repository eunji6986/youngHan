package lovepower.hellospring.concept;

public class StaticExam {

    static int c = 10;
    public static void fun(){
        System.out.println(c);
    }
    public static void main(String[] args) {
       StaticExam.fun();
    }

}
