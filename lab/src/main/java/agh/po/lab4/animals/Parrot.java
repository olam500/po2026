package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        this.name = name;
        this.legs = 2;
    }

    @Override
    public String getDescription() {
        return "Papuga " + name + " ma " + legs + " nogi";
    }
    @Override
    public void makeSound() {
        System.out.println("Kra, kra");

    }
}