public class Staff {

    private String  name;
    int age;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;

    Staff(String name, int age, String position, String email, String phoneNumber, int salary)
    {
        this.name = name;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    public void info()
    {
        System.out.println("ФИО сотрудника:" + " "+ name);
        System.out.println("Возраст:" + " " + age);
        System.out.println("Должность:" + " " + position);
        System.out.println("Электронная почта:" + " " + email);
        System.out.println("Номер телефона:" + " " + phoneNumber);
        System.out.println("Заработная плата:" + " " + salary + " " + "рублей");
    }
}
