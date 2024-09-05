package Model;

public abstract class Animal {
    protected String nombre;

    public void eat() {
        System.out.println("This animal is eating.");
    }

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    public abstract void specialAbility();
    public Animal(String nombre) {
        this.nombre = nombre;
    };
}
