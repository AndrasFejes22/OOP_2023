package animalPackage;

import java.util.ArrayList;
import java.util.List;

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
        Bird bird = new Bird("Pepe", 4, true);
        bird.eat();
        bird.brood();

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(fish);
        animals.add(bird);
        System.out.println("-----------------");
        printAnimals(animals);
        System.out.println("-----------------");
        for (int i = 0; i <animals.size(); i++){
            animals.get(i).move();
        }

        Cat cat = new Cat("Tom", 3, true, 10);
        cat.sleep();
        cat.giveSound();
        Animal myCat = new Cat("Jack", 5, true, 8);
        System.out.println("Is Jack sleeping?");
        myCat.sleep();
        //myCat.giveSound();  // nemjo
        System.out.println();
        System.out.println("----sparrow----");
        Animal sparrow1 = new Sparrow("sparrow1", 1, false);
        Sparrow sparrow2 = new Sparrow("sparrow2", 2, false);
        sparrow1.move(); //itt nincs fly
        sparrow2.fly();

        System.out.println();
        Animal[] pets = new Animal[5];
        pets[0] = animal1;
        pets[1] = fish;
        pets[2] = animal2;
        pets[3] = bird;
        pets[4] = cat;

        System.out.println("Animals in an array: ");
        for (Animal myAnimals: pets){
            System.out.println(myAnimals.getName());
        }
        System.out.println("Animals in an array/move(): ");
        for (Animal myAnimals: pets){
            myAnimals.move();
        }


    }

    public static void printAnimals (List<Animal> animals){
        for (int i = 0; i <animals.size(); i++){
            if(animals.get(i).getClass().getName().equals(Bird.class.getName())){
                System.out.println("This is a bird");
            } else {
                System.out.println(animals.get(i).getName());
            }
        }
        System.out.println();
    }
}
