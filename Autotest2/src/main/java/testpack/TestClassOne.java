package testpack;

public class TestClassOne {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        car.go();
        car.stop();
        System.out.println();
        plane.go();
        plane.stop();
        plane.setSpeed(500);
        System.out.println();
        
    }
}
