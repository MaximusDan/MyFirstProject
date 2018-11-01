package second;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int course;

    public void createStudent() {
        System.out.println("Введите Имя");
        String a = first.Console.readFromConsoleStringValue();
        name = a;

        System.out.println("Введите Фамилию");
        String b = first.Console.readFromConsoleStringValue();
        surname = b;

        System.out.println("Введите возраст");
        int c = first.Console.readFromConsoleIntValue();
        age = c;

        System.out.println("Введите курс");
        int d = first.Console.readFromConsoleIntValue();
        course = d;
    }

    public void show() {
        System.out.println("Имя = " + name);
        System.out.println("Фомилия = " + surname);
        System.out.println("Возраст = " + age);
        System.out.println("Курс = " + course);
        System.out.println();

    }
}


