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

        //Student student4 = Student.createStudent("Вася","Вакуленко",35,1);
        //student1.show();
        //student2.show();
        //student3.show();
        //student4.show();

        //Student [] createMassStudent = Student.massStudent(student1,student2,student3,student4); //Создаем массив студентов

        Student student12 = Student.createObject();
        student12.show();
        //Student.showMass(createMassStudent);    //Выводим на консоль массив студентов

        //Student.showStudent(createMassStudent);

        //Student [] massivCourse = Student.showStudent2(createMassStudent);  //Задание 39
        //Student.showMass(massivCourse);

        //Student.qqqq(createMassStudent);

    }
}
