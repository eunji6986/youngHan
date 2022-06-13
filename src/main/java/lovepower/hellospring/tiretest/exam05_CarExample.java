package lovepower.hellospring.tiretest;

public class exam05_CarExample {
    public static void main(String[] args) {

        exam04_Car myCar = new exam04_Car();
        myCar.run();

        myCar.frontLeft = new exam03_KumhoTire();
        myCar.frontRight= new exam03_KumhoTire();
        myCar.run();
    }

}
