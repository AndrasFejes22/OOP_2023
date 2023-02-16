package animalPackage;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly...");
    }
}
