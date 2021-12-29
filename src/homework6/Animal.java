/**
 * Java 1. Homework #6
 *
 * @author Nazarenko Nadezhda
 * @version 25.12.2021
 */

package homework6;

abstract class Animal implements IAnimal {
    protected String view;
    protected int runLimit;
    protected int swimLimit;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        view = getClass().getSimpleName();
    }

    public String getView() {
        return view;
    }

    @Override
    public String Run(int distance) {
        if (distance > runLimit) {
            return view + " couldn`t run " + distance;
        } else {
            return view + " successfully run " + distance;
        }
    }

    @Override
    public String Swim(int distance) {
        if (distance > swimLimit) {
            return view + " couldn`t swim " + distance;
        } else {
            return view + " successfully swim " + distance;
        }
    }

    @Override
    public String toString() {
        return view + " runLimit: " + runLimit + " swimLimit " + swimLimit;
    }
}
