package animalPackage;

public class Animal {

    private String name;
    private int age;
    private boolean isDomestic;

    public Animal(String name, int age, boolean isDomestic) {
        this.name = name;
        this.age = age;
        this.isDomestic = isDomestic;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public void sleep(){
        System.out.println("Animal is sleeping...");
    }

    public void move(){
        System.out.println("Animal is moving..");
    }
}
