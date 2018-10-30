package second;

public class Main {
    public static void main(String[] args) {

        Student Max = new Student();
        Student Yura = new Student();
        Student Vlad = new Student();

        Max.createStudent();
        Yura.createStudent();
        Vlad.createStudent();

        Max.show();
        Yura.show();
        Vlad.show();

    }
}
