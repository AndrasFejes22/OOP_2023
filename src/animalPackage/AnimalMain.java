package animalPackage;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Morzsi", 6, true);
        animal1.sleep();

        Animal animal2 = new Bird("Kiki", 3, true);
        System.out.println();
        System.out.println("Animal animal2/bird/:");
        animal2.eat();

        Animal animal3 = new Fish("Toto", 5, false);
        Fish fish = new Fish("Oszi", 4, false);
        System.out.println();
        System.out.println("Animal animal3/fish/:");
        animal3.eat();
        System.out.println("Animal3 class: "+animal3.getClass().getName());
        //animal3.hunt(); //ez nem jó mert az Animal class-ban nincs hunt() method
        fish.hunt();

        System.out.println();
        System.out.println("Bird bird:");
        Bird bird = new Bird("Kiki", 3, true);
        bird.eat();
        bird.brood();


    }
}
