/**
 * Java 1. Homework #3
 *
 * @author Nazarenko Nadezhda
 * @version 22.12.2021
 */
package homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Employee e = new Employee("Ivan", "Sidorov", "Petrovich", 60, 45000,
                "accountant","sid.ivan@ai.ru", "777788888");

        //5. Создать массив из 5 сотрудников.
        Employee[] employees = {e,
                new Employee("Vitaliy", "Petrov", "Ivanovich", 35, 40000,
                        "director", "pet.vit@mail.ru", "777788889"),
                new Employee("Arman", "Amirov", "Achmetovich", 38, 35000,
                        "redactor","amir.a@mail.ru", "65656666"),
                new Employee("Genadiy", "Pupkin", "Dmitreevich", 42, 41000,
                                "producer","pupkon.g@mail.ru", "123456789"),
                new Employee("Vadim", "Nazarenko", "Vitalevich", 18, 20000,
                        "developer","nazarenkon.nad@mail.ru", "87778910653"),
                new Employee("Olga", "Medvedeva", "Nikolaevna", 49, 24000,
                        "accountant","medved.o@mail.ru", "65345997")
        };

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getAllInfo());

    }
}