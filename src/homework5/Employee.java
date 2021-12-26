/**
 * Java 1. Homework #5
 *
 * @author Nazarenko Nadezhda
 * @version 22.12.2021
 */
package homework5;

class Employee {
    private String surname;
    private String name;
    private String secondName;
    private int age;
    private int salary;
    private String position;
    private String email;
    private String phone;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String surname, String name, String secondName, int age, int salary, String position, String email, String phone) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.email = email;
        this.phone = phone;
    }
    //3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    /*String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getSecondName() {
        return secondName;
    }

    int getAge() {
        return (int)age;
    }

    int getSalary() {
        return (int)salary;
    }

    String getPosition() {
        return position;
    }

    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }

    String getAllInfo() {
        return this.surname + " " + this.name + " " +this.secondName + " " +this.getAge() + " "+ this.getSalary() + " "+
             this.getPosition() + " " + this.getEmail() + " "+ this.getPhone();
    }*/
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return (name +
                "\n| Name: " + name +
                "\n| Surname: " + surname +
                "\n| SecondName: " + secondName +
                "\n| Position: " + position +
                "\n| Email: " + email +
                "\n| Phone: " + phone +
                "\n| Salary: " + salary +
                "\n| Age: " + age);
    }
}
