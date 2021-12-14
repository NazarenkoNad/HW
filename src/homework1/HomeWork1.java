/**
 * Java 1. Homework #1
 *
 * @author Nazarenko Nadezhda
 * @version 11.12.2021
 */
package homework1;

// 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в
    // cтолбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
    // эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”;
    static void checkSumSign() {
        int a = 5;
        int b = 10;
        System.out.println("Summ is " + (a + b >= 0 ? "positive" : "negative"));
    }

    //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее
    // любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение
    // “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    // если больше 100 (100 исключительно) - “Зеленый”
    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 || value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
    // то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    static void compareNumbers() {
        int a = 12;
        int b = 10;
        //     if (c >= m) {
        //        System.out.println("a >= b");
        //    } else {
        //        System.out.println("a < b");
        //    }
        System.out.println("result" + (a >= b ? "(a >= b)" : "(a < b)"));
    }
}

