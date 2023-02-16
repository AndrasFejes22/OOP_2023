package animalPackage;

public class Cat extends Animal{

    private int weight;

    public Cat(String name, int age, boolean isDomestic, int weight) {
        super(name, age, isDomestic);
        this.weight = weight;
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }


    public void giveSound() {
        System.out.println("Cat is meowing...");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving...");
    }
}
