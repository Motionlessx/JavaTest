public class Human {
    public Head head;

    public Human() {
        this.head = new Head();
    }

    public void say() {
        System.out.println("zxc" + head.voice);
    }

    class Head {
        String voice = "sdsd";
    }
}