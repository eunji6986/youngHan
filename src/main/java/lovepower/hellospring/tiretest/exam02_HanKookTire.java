package lovepower.hellospring.tiretest;

import lovepower.hellospring.tiretest.exam01_Tire;

public class exam02_HanKookTire implements exam01_Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어");
    }
}
