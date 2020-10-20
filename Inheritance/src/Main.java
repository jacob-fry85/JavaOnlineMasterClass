import com.darwinjacob.Animal;
import com.darwinjacob.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog huskey = new Dog("Huskey", 1, 5, 2, 4, 1, 1, "thick");
       /* huskey.eat();
        huskey.walk();
        huskey.run();*/
        huskey.barkSound();

        Fish shark = new Fish("Shark", 5, 50,100,2,1);

        shark.move(10);
    }
}
