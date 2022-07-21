public class Car {

    int weight;
    int maxWeight = 2500;
    int speed;
    int maxSpeed = 250;
    String color;
    static int abs = 1;


    public Car() {

    }
    public Car (int speed, int maxSpeed, String color) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.color = color;

    }

    public void drive(int speed, int weight) {
        if (speed < maxSpeed & weight < maxWeight) {
            System.out.println("Driving");
        }
        else {
            System.out.println("Cant drive");
        }
    }

}
