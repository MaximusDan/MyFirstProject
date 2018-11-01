package second;

public class Main {
    public static void main(String[] args) {

        Student max = new Student();
        max.name = "Максим";
        max.surname = "Данилович";
        max.age = 27;
        max.course = 5;

        Student yura = new Student();
        yura.name = "Юра";
        yura.surname = "Данилович";
        yura.age = 25;
        yura.course = 4;

        Student vlad = new Student();
        vlad.name = "Влад";
        vlad.surname = "Юдин";
        vlad.age = 24;
        vlad.course = 3;

        max.createStudent();
        yura.createStudent();
        vlad.createStudent();

        max.show();
        yura.show();
        vlad.show();

    }
}
