package second;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int course;
    public Student[] massStudent = new Student[4];

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

    public void massStudent(Student a, Student b, Student c, Student d) {
        massStudent[0] = a;
        massStudent[1] = b;
        massStudent[2] = c;
        massStudent[3] = d;
        return massStudent;
    }

    public void showMass(Student[] mass) {
       for (int i = 0; i > mass.length; i++) {
           System.out.println("Имя = " + name);
           System.out.println("Фомилия = " + surname);
           System.out.println("Возраст = " + age);
           System.out.println("Курс = " + course);
           System.out.println();
       }
    }
}


