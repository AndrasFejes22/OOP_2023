package animalPackage;

public class Bird extends Animal{

    public Bird(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    public void brood(){
        System.out.println("Bird brooding...");
    }

    @Override
    public void eat(){
        System.out.println("Bird is eating...");
    }


}
