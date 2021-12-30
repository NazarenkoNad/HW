/**
 * Java 1. Homework #6
 *
 * @author Nazarenko Nadezhda
 * @version 29.12.2021
 */
package homework7;
import java.util.Scanner;

public class HomeWork7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Харви", 5, false);
        allCats[1] = new Cat("Муська", 25, false);
        allCats[2] = new Cat("Мурзик", 10, false);
        allCats[3] = new Cat("Котя", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " остался голодный!");
            }
        }
        plate.info();
        System.out.println("Сколько добавить еды котикам?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}