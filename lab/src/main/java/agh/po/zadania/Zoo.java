package agh.po.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public Zoo() {
        Random rand = new Random();
        int los;
        for (int i = 0; i < 100; i++) {
            los = rand.nextInt(3);
            if (los == 0) {
                animals[i] = new Dog("Burek");
            } else if (los == 1) {
                animals[i] = new Parrot("Ara");
            } else {
                animals[i] = new Snake("Kaa");
            }
        }
    }

    public int countLegs() {
        int sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Suma nóg: " + zoo.countLegs());

        for (Animal animal : zoo.animals) {
            int legs = animal.getLegs();
            System.out.println(animal.getDescription());
            animal.makeSound();
        }
    }
}