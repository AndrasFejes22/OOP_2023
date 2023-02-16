package abstractAnimalPackage;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.move();
        dog1.bark();

        AbstractAnimal dog2 = new Dog();
        dog2.move();
        //dog2.bark(); //not okay

        Fish fish = new Fish();
        System.out.println();
        System.out.println("----moveAnimals----");
        moveAnimals(dog1);
        moveAnimals(dog2);
        moveAnimals(fish);
    }

    public static void moveAnimals(AbstractAnimal animal){
        animal.move();
    }
}
