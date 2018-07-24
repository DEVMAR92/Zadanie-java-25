package app;

import data.Student;
import data.Teacher;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Andrzej", "Nowak", 20,
                "Wrocław", "Kościuszki", 23, 4.34);

        Student student2 = new Student("Robert", "Mak", 21,
                "Poznań", "Grunwaldzka", 34, 3.95);

        ///////////////////////////////////////////////////////////////////////////////

        Teacher teacher1 = new Teacher("Tadeusz", "Owczarek", 45,
                "Oława", "Piłsudzkiego", 55, 3400, "Historia");
        Teacher teacher2 = new Teacher("Arkadiusz", "Wąs", 50,
                "Wrocław", "Długa", 2, 2800, "Wychowanie Fizyczne");

        ///////////////////////////////////////////////////////////////////////////////

        student1.showInfo();
        student2.showInfo();

        teacher1.showInfo();
        teacher2.showInfo();
    }
}
