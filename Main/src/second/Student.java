package second;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int course;

    public void createStudent(String a, String b, int c, int d) {
        System.out.println("Введите Имя");
        a = first.Console.readFromConsoleStringValue();
        name = a;

        System.out.println("Введите Фамилию");
        b = first.Console.readFromConsoleStringValue();
        surname = b;

        System.out.println("Введите возраст");
        c = first.Console.readFromConsoleIntValue();
        age = c;

        System.out.println("Введите курс");
        d = first.Console.readFromConsoleIntValue();
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


