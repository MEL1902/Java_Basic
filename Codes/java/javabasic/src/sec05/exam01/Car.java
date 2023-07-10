package sec05.exam01;

public class Car { //클래스 멤버 필드,생성자,메소드
    //필드
    String model;
    int speed;

    //생성자
    Car(String model) {
        this.model = model;
    }

    //메소드 ()
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for(int i=10; i<=50; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속: " + speed + "km/h)");
        }
    }
}
