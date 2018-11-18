package second;

public class Main {
    public static void main(String[] args) {
        Student student;
        Student student1 = new Student();
        student1.name = "Максим";
        student1.surname = "Данилович";
        student1.age = 27;
        student1.course = 3;

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

        Student student5 = Student.createObject(); // Создаем студента задание №43
        student5.show();  // Выводим на консоль студента

        Student [] createMassStudent = Student.massStudent(); //Создаем массив студентов №44
        Student.showMass(createMassStudent); //Выводим на консоль массив студентов

        Student.studentNameAlfavit(createMassStudent);
        //student1.show();
        //student2.show();
        //student3.show();
        //student4.show();

        //Student.showStudent(createMassStudent);

        //Student [] massivCourse = Student.showStudent2(createMassStudent);  //Задание 39
        //Student.showMass(massivCourse);

        //Student.qqqq(createMassStudent);

    }
}
