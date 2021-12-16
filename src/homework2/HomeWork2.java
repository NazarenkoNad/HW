/**
 * Java 1. Homework #2
 *
 * @author Nazarenko Nadezhda
 * @version 13.12.2021
 */
package homework2;

public class HomeWork2 {
    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 9;

        //  int c = 10;
        checkNumbers(15);

        repeatString("Hello, world", 3);

        int x = -100;

        int year = 2021;

        System.out.println("№ 1 Сумма двух чисел лежит в переделах от 10 до 20 " + checkSum(a1, a2));
        System.out.println("№ 3 Отрицательное ли число " + checkNegative(x));
        System.out.println("Високосный ли год?  " + task5(year));
    }
    //1. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    private static boolean checkSum(int a1, int a2) {
        int sum = a1 + a2;
        return sum <= 20 && sum >= 10;
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать положительное
    // ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    private static void checkNumbers(int c) {
        System.out.println("result " + (c >= 0 ? "число положительное" : "число отрицательное"));
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное.

    private static boolean checkNegative(int x) {
        return x < 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    // указанную строку, указанное количество раз;

    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
    //5. Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты
    //работы метода в консоль

    private static boolean task5(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}

