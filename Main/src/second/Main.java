package second;
import first.Console;
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

        //Student student5 = Student.createObject(); // Создаем студента задание №43
        //student5.show();  // Выводим на консоль студента

        //Student [] createMassStudent = Student.massStudent(); //Создаем массив студентов №44
        //Student.showMass(createMassStudent); //Выводим на консоль массив студентов

        //Student.studentNameAlfavit(createMassStudent); // №41 Массив студентов отсортируется в алфавитном порядке имён студентов

        //Student.showStudent(createMassStudent);

        //Student [] massivCourse = Student.showStudent2(createMassStudent);  //Задание 39
        //Student.showMass(massivCourse);

        //Student.qqqq(createMassStudent);

        //Student [] createMassStudent2 = Student.massStudent(); // #42 Создает массив студентов
        //Student.showMass(createMassStudent2); // #42 Выводит массив на консоль
        //Student.showMassNameStudent(createMassStudent2); // #42 Вызывает метод, который выводит имя которое встречается в массиве чаще всего

        //ClassFromBook.createMass(); //Работа с классом ClassFromBook

        //char [] mass = CustomString.toCharArray("wdgrthrrt"); //Работа с классом CustomString методом toCharArray #46


        //CustomString line1 = new CustomString(); //#47
        //CustomString line2 = new CustomString(); //#47
        //line1.equals(line2);   //Работа с классом CustomString методом equals #47

        //СustomChar.isDigit('2'); //Работа с классом СustomChar методом isDigit #48

        //СustomChar.isDigitBigSymbol('r'); //Работа с классом СustomChar методом isDigitBigSymbol #49

        //СustomChar.createBigSymbol('d');  //Преобразуем символ к верхнему регистру #50

        //СustomChar.createSmallSymbol('D');  //Преобразуем символ к нижнему регистру #51

        //СustomChar.showString(4,7); //Вырезаем строку и выводим оставшуюся часть #52

        СustomChar.showSubString(4,7); //Выводим из строки кусок #53
    }
}
