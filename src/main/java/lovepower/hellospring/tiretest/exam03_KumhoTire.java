package lovepower.hellospring.tiretest;

import lovepower.hellospring.tiretest.exam01_Tire;

public class exam03_KumhoTire implements exam01_Tire {
    @Override
    public void roll() {
        System.out.println("금호타이어");
    }
}
