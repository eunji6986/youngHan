package lovepower.hellospring.tiretest;

public class exam04_Car {
    exam01_Tire frontLeft = new exam02_HanKookTire();
    exam01_Tire frontRight = new exam02_HanKookTire();
    exam01_Tire backLeft = new exam02_HanKookTire();
    exam01_Tire backRight = new exam02_HanKookTire();

    void run(){
        frontLeft.roll();
        frontRight.roll();
        backLeft.roll();
        backRight.roll();
    }

}

