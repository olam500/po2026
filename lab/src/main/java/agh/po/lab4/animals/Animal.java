package agh.po.lab4.animals;

public abstract class Animal {
    String name;
    int legs;
    public abstract String getDescription();
    public abstract void makeSound();
    public int getLegs() {
        return legs;
    }
}
