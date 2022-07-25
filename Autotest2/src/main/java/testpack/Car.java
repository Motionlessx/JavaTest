package testpack;

public class Car implements TestInt{
    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
