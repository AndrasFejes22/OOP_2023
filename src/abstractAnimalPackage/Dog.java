package abstractAnimalPackage;

public class Dog extends AbstractAnimal{
    public Dog(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    public Dog(){

    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

}
