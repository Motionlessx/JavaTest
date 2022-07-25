package testpack;

public class Plane implements TestInt{
    @Override
    public void go() {
        System.out.println("Fly");
    }

    @Override
    public void stop() {
        System.out.println("Stop fly");
    }
    public void setSpeed(int speedx) {
        System.out.println("Speed: " + speedx);
    }
}
