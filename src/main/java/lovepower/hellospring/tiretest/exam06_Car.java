package lovepower.hellospring.tiretest;

public class exam06_Car {
    exam01_Tire[] tires = {
            new exam02_HanKookTire(),
            new exam02_HanKookTire(),
            new exam02_HanKookTire(),
            new exam02_HanKookTire()
    };

    void run (){
        for (exam01_Tire tire : tires){
            tire.roll();
        }
    }

}
