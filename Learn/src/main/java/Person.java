public class Person implements InterfaceMain {
public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + name);
    }
    // Person person = new Person("Bob");

//    @Override
//    public void showInfo() {
//        System.out.println("Name is " + name);
//    }
}
