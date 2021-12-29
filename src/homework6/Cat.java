/**
 * Java 1. Homework #6
 *
 * @author Nazarenko Nadezhda
 * @version 25.12.2021
 */

package homework6;

public class Cat extends Animal {
    Cat (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    Cat (int runLimit) {
        super (runLimit, -1);
    }

    @Override
    public String Swim(int distance) {
        return getView() + " can`t swim ";
     }

}
