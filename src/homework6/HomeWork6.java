/**
 * Java 1. Homework #6
 *
 * @author Nazarenko Nadezhda
 * @version 25.12.2021
 */
package homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.Run(150));
            System.out.println(animal.Run(250));
            System.out.println(animal.Run(550));
            System.out.println(animal.Swim(5));
            System.out.println(animal.Swim(15));
        }

    }

}
