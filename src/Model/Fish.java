package Model;

import Interface.Swim;

public class Fish extends Animal implements Swim {

    public Fish(String nombre) {
        super(nombre);
    }

    @Override
    public void specialAbility() {
        System.out.println("I can swim everywhere");
    }


    @Override
    public void eat() {
        System.out.println("I eat other fishes ");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep with my eyes open ");
    }
}
