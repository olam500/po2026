package agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake(String name) {
        this.name = name;
        this.legs = 0;
    }

    @Override
    public String getDescription() {
        return "Waz " + name + " ma " + legs + " nog";
    }
    @Override
    public void makeSound() {
        System.out.println("Ssssss");

    }
}