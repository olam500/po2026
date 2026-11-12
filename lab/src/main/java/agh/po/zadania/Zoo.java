package agh.po.zadania;
import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;
import java.util.Random;


public class Zoo {
    Animal[] animals = new Animal[100];
    Random rand = new Random();
int los;
    for(i = 0; i <100 ; i++){
        los = rand.nextInt(3);
        if(los == 0){
            animals[i] = new Dog();
        } else if (los == 1) {
            animals[i] = new Parrot();
        } else{
            animals[i] = new Snake();
        }


    }

}
