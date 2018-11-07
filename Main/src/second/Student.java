package second;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int course;

    /**
     * Метод создания студента
     */
    public  static Student createStudent(String nameCreateStudent, String surnameCreateStudent, int ageCreateStudent, int courseCreateStudent) {
        Student student4 = new Student();
        student4.name = nameCreateStudent;
        student4.surname = surnameCreateStudent;
        student4.age = ageCreateStudent;
        student4.age = courseCreateStudent;
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
    public static Student [] massStudent(Student a, Student b, Student c, Student d) {
        Student[] massStudent = new Student[4];
        massStudent[0] = a;
        massStudent[1] = b;
        massStudent[2] = c;
        massStudent[3] = d;
        return massStudent;
    }
    /**
     * Метод вывода массива студентов
     */
    public static void showMass(Student[] mass) {
       for (int i = 0; i < mass.length; i++) {
           System.out.println("Имя = " + mass[i].name);
           System.out.println("Фомилия = " + mass[i].surname);
           System.out.println("Возраст = " + mass[i].age);
           System.out.println("Курс = " + mass[i].course);
           System.out.println();
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
}


