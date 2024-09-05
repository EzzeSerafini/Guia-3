package Model;

import Interface.Fly;
import Interface.Swim;
import Interface.Walk;

public class Duck extends Animal implements Fly, Walk, Swim {

    public Duck(String nombre) {
        super(nombre);
    }

    @Override
    public void specialAbility() {
        System.out.println("I can doo everything, , fly, walk and swim");
        System.out.println("I'm the best");

    }

    @Override
    public void sleep() {
        System.out.println("Usually when i go to sleep, i keep one eye open");
    }

    @Override
    public void eat() {
        System.out.println("Ican eat fish and grains");
    }

}
