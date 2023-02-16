package animalPackage;

public class Fish extends Animal{

    public Fish(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    public void move(){
        System.out.println("Fish swimming..");
    }

    public void eat(){
        System.out.println("Fish is eating...");
    }

    public void hunt(){
        System.out.println("Fish is hunting...");
    }


}
