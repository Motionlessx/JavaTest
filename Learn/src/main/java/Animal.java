public class Animal implements InterfaceMain {
    int id = 1;

    public Animal(int id) {
        this.id = id;
    }
   // Animal animal = new Animal(1);

    public void showInfo(){
        System.out.println("ID is " + id);
    }
}
