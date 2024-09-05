package Model;

import Interface.Fly;

public class Bat extends Animal implements Fly {

    public Bat(String nombre) {
        super(nombre);
    }

    @Override
    public void specialAbility() {
        System.out.println("I can fly and i produce supersonic sounds");
    }



    @Override
    public void eat() {
        System.out.println("I eat insects or fruit ");
    }

    @Override
    public void sleep() {
        System.out.println("When i sleep, I hang upside down");
    }
}
