package second;
import first.Console;

import java.util.ArrayList;
public class Student {
    public String name;
    public String surname;
    public int age;
    public int course;
    public static  String [] massName = {"Петя","Ваня","Игорь","Юра","Влад","Сергей","Женя","Андрей","Миша","Гриша"};
    public static String [] massSurname = {"Данилович","Федорович","Пупкин","Грачев","Харламов","Янцевич","Грицкевич","Король","Филонюк","Ющенко"};
    public static int [] massCourse = {1,2,3,4,5};
    public static int [] massAge = {22,23,24,25,27,19,34,28,31,18};

    /**
     * Метод создания объекта(студента)
     */
    public static Student createObject(){
        Student student123 = new Student();
        student123.name = massName[(int)(Math.random() * 10)];
        student123.surname = massSurname[(int)(Math.random() * 10)];
        student123.course = massCourse[(int)(Math.random() * 5)];
        student123.age = massAge[(int)(Math.random() * 10)];
        return student123;
    }


    /**
     * Метод создания студента
     */
    public  static Student createStudent(String nameCreateStudent, String surnameCreateStudent, int ageCreateStudent, int courseCreateStudent) {
        Student student4 = new Student();
        student4.name = nameCreateStudent;
        student4.surname = surnameCreateStudent;
        student4.age = ageCreateStudent;
        student4.course = courseCreateStudent;
        return student4;
    }

    public void show() {
        System.out.println("Имя = " + name);
        System.out.println("Фомилия = " + surname);
        System.out.println("Возраст = " + age);
        System.out.println("Курс = " + course);
        System.out.println();

    }
    /**
     * Метод создания массива студентов
     */
    public static Student [] massStudent() {
        System.out.println("Введите колличество студентов");
        int i = first.Console.readFromConsoleIntValue();
        Student[] massStudent = new Student[i];
        for (int j = 0; j < massStudent.length; j++) {
            massStudent[j] = Student.createObject();
        }
        return massStudent;
    }
    /**
     * Метод вывода массива студентов
     */
    public static void showMass(Student[] mass) {
       for (int i = 0; i < mass.length; i++) {
           mass[i].show();
       }
    }
    /**
     * Метод вывода студента определенного курса
     */
    public static void showStudent(Student[] mass) {
        System.out.println("Введите курс");
        int consoleCourse = first.Console.readFromConsoleIntValue();
        for (int i = 0; i < mass.length; i++) {
            if(consoleCourse == mass[i].course){
                Student a = mass[i];
                a.show();
            }
        }
    }

    /**
     * Метод создания массива студентов определенного курса
     */
    public static Student[] showStudent2(Student[] mass) {
        int number = 0; //счетчик размера нового массива студентов определенного курса
        System.out.println("Введите курс");
        int consoleCourse = Console.readFromConsoleIntValue();
        for (int i = 0; i < mass.length; i++) {
            if (consoleCourse == mass[i].course) {
                number++;
            }
        }
        Student[] massCourse = new Student[number]; //создаем массив студентов определенного курса
        int x = 0;
        for (int i = 0; i < mass.length; i++) {
            if (consoleCourse == mass[i].course) {
                massCourse[x] = mass[i];
                x++;
            }
        }
        return massCourse;
    }

    public static void qqqq(Student[] mass) {
        int b = 0, c = 0, d = 0;

        for (int i = 1; i <= 5; i++) {            //перебираем курсы
            for (int j = 1; j < mass.length; j++) {
                if (mass[j].course == i) {
                    b = b + mass[j].age; //считаем сумму возраста всех студентов курса
                    c++;        //счетчик студентов
                }
            }
            System.out.println(b);
            if (c == 0) {
                System.out.println("На " + i + " курсе никто не обучается");
            }
            if (c != 0) {
                d = b / c; //находим средний возрвст студентов курса
                System.out.println("На " + i + " курсе средний возраст равен " + d);
            }
            b = 0;
            c = 0;
        }
    }
    /**
     * Метод сортирует массив студентов в алфавитном порядке имён студентов
     */
    public static void studentNameAlfavit(Student[] mass) {
        for (int i = 0; i < mass.length -1; i++) {
            for (int j = i+1; j <mass.length; j++) {
                if (mass[i].name.compareTo(mass[j].name) > 0) {
                    Student student = mass[i];
                    mass[i] = mass[j];
                    mass[j] = student;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            mass[i].show();
        }
    }
    /**
     * Метод выводит имя которое встречается чаще всего
     */
    public static void showMassNameStudent(Student[] mass) {
        int a = 0, b = 0;
        String topName = new String();
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i].name.equals(mass[j].name) == true) {
                    b++;
                }
            }
            if (b > a) {
                a = b;
                topName = mass[i].name;
            }
            b = 0;
        }
        System.out.println("В данном массиве слудентов, имя " + topName + " встречается больше всего" );
    }
}


