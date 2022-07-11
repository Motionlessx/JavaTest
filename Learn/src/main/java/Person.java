public class Person implements InterfaceMain {
static String name = "Bob";

    public Person(String name) {
        this.name = name;
    }
    // Person person = new Person("Bob");

    public static void showInfo() {
        System.out.println("Name is " + name);
    }
}
