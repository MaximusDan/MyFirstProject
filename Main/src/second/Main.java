package second;

public class Main {
    public static void main(String[] args) {
        Student student;
        Student student1 = new Student();
        student1.name = "Максим";
        student1.surname = "Данилович";
        student1.age = 27;
        student1.course = 5;

        Student student2 = new Student();
        student2.name = "Юра";
        student2.surname = "Данилович";
        student2.age = 25;
        student2.course = 4;

        Student student3 = new Student();
        student3.name = "Влад";
        student3.surname = "Юдин";
        student3.age = 24;
        student3.course = 3;

        Student student4 = Student.createStudent("Вася","Вакуленко",35,1);

        student1.show();
        student2.show();
        student3.show();
        student4.show();

        Student studentMass = new Student();

        studentMass.massStudent(student1,student2,student3,student4);

        studentMass.showMass(studentMass);
    }
}
