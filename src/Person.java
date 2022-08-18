public class Person {
    private String name;
    private int age;
    private int salary;
    Cat cat;


    public void setName(String name) {
        System.out.println("Имя:  " + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Возраст: " + age);
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        System.out.println("Зарплата: " + salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст:" + getAge() + " Зарплата: " + getSalary();
    }

    public String toString(String a) {
        return "Имя: " + getName() + " Возраст:" + getAge() + " Зарплата: " + getSalary() + " ноль потому что нн задано значение кота " + cat;
    }
}

