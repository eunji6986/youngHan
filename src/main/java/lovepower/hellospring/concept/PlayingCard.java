package lovepower.hellospring.concept;

public interface PlayingCard extends Movable, Attackable{
    //클래스와 달리 Object가 최고 조상이 아니다
    //interface의 조상은 interface만 가능하다

    public static final int CLOVER =1;
    public int HEART =2;
    static int DIAMOND =3;
    final int SPADE =4;

    abstract String getCardNumber();
    abstract String getCardKind(); //추상메서드


}
