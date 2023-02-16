package abstractAnimalPackage;

public abstract class AbstractAnimal {

    private String name;
    private int age;
    private boolean isDomestic;

    public AbstractAnimal(String name, int age, boolean isDomestic) {
        this.name = name;
        this.age = age;
        this.isDomestic = isDomestic;
    }
    public AbstractAnimal() {

    }


    public void eat(){
        System.out.println("Animal is eating...");
    }

    public void sleep(){
        System.out.println("Animal is sleeping...");
    }

    public abstract void move();

    public String getName() {
        return name;
    }




}
