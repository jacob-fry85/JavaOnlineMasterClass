public class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        Dog rex = new Dog("MyRex");
        Dog fluffy = new Dog("Myfluffy");
        rex.printName();
        fluffy.printName();
    }
}
