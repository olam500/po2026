package agh.po.lab4.animals;

public class Dog extends Animal {


    public class Dog{String name} {
        this.name = name;
        this.legs = 4;
    }

    @Override
    public String getDescription() {
        return "Pies" + name + "ma" + legs + "nogi";
    }
}