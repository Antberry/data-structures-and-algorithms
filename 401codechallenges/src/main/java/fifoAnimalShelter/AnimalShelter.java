package fifoAnimalShelter;

import org.checkerframework.checker.units.qual.A;
import stacksandqueues.Queue;

public class AnimalShelter {

    Queue<Animal> animalshelter;

    public AnimalShelter(){
        animalshelter = new Queue<Animal>();
    }

    public void enqueue(Animal animal){
        animalshelter.enqueue(animal);
    }

    public Object dequeue(String pref){
        if(pref != "dog" || pref != "cat"){
            return null;
        }

        while(((Animal)animalshelter.peek()).getType() != pref && ((Animal)animalshelter.peek()).getType() != pref){
            animalshelter.dequeue();
        }
         return ((Animal)animalshelter.peek()).getType();
    }

}
