public class MainNew {
    public static void main(String[] args) {

        Student Max = new Student();
        Max.name = "Максим";
        Max.surname = "Данилович";
        Max.age = 27;
        Max.course = 5;

        Student Yura = new Student();
        Yura.name = "Юра";
        Yura.surname = "Петров";
        Yura.age = 25;
        Yura.course = 4;

        Student Vlad = new Student();
        Vlad.name = "Влад";
        Vlad.surname = "Юдин";
        Vlad.age = 24;
        Vlad.course = 3;

        Max.show();
        Yura.show();
        Vlad.show();

    }
}
