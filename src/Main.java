/*Создать класс Person с 3-мя полями(имя,возраст,зарплата).Переопределить для этого класса toString(чтобы выдавал всю информацию по человеку),equals(),hashCode().

        Создать класс Cat и добавить в Person поле этого типа(Cat).Соответственно изменить toString().

        В Main создать объект Person,клонировать его,и поменять для копии имя.Проверить в консоли с помощью toString что имена оригинала и копии действительно разные.*/

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nikita");
        person.setAge(22);
        person.setSalary(1000);
        person.getName();
        person.getAge();
        person.getSalary();
        person.toString();
        System.out.println(person.toString());
        System.out.println(person.toString("Cat"));
        Person first = new Person();
        first.setName("Andrey");
        first.toString();
    }
}