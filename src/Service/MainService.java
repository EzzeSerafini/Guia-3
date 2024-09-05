package Service;

import Model.Animal;
import Model.Duck;
import Model.Fish;
import Model.Bat;

public class MainService {

    public static void main(String[] args) {
        // Crear objetos de las clases Duck, Fish, y Bat
        Animal duck = new Duck("Steve");
        Animal fish = new Fish("Moe");
        Animal bat = new Bat("Larry");

        // Duck - Llamada a los métodos
        System.out.println("Duck:");
        duck.specialAbility();
        duck.eat();
        duck.sleep();
        System.out.println();

        // Fish - Llamada a los métodos
        System.out.println("Fish:");
        fish.specialAbility();
        fish.eat();
        fish.sleep();
        System.out.println();

        // Bat - Llamada a los métodos
        System.out.println("Bat:");
        bat.specialAbility();
        bat.eat();
        bat.sleep();
        System.out.println();
    }
}
