package lection4;

import java.util.ArrayList;
import java.util.List;

public class Lesson4 {
    private static Object Student;

    public static void main(String[] args) {
        Student student1 = new Student(1, "Алексей", "Петренко", "Физическая культура", 4.4, 2020);
        Student student2 = new Student(2, "Роман", "Иванов", "Психология", 5.0, 2018);
        Student student3 = new Student(3, "Анна", "Холина", "Музыка", 5.0, 2017);
        Student student4 = new Student(4, "Иван", "Алекса", "Международное право", 4.2, 2019);
        Student student5 = new Student(5, "Александр", "Михайленко", "Юридический факульет", 4.0, 2020);
        Student student6 = new Student(6, "Юрий", "Матюхин", "Информационные технологии", 4.3, 2019);
        Student student7 = new Student(7, "Яна", "Токарева", "Иностранные языки", 5.0, 2020);
        Student student8 = new Student(8, "Кристина", "Тосунова", "Коммерческая деятельность", 4.2, 2021);
        Student student9 = new Student(9, "Владислав", "Улитько", "Бизнес деятельность", 5.0, 2018);
        Student student10 = new Student(10, "Дмитрий", "Михайлик", "Авиационный  факультет", 4.2, 2019);
        System.out.println(student1.toString());
    }
}

class Student{
    int ID;
    String FirstName;
    String LastName;
    String Faculty;
    double Rate;
    int Year;

    public Student(int ID, String FirstName, String LastName, String Faculty, double Rate, int Year) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Faculty = Faculty;
        this.Rate = Rate;
        this.Year = Year;
    }

    public String toString() {
        return "Студент " + FirstName + " " + LastName+ "," + "средний бал - " + Rate;
    }
}

class Group{
    private List<Student> list = new ArrayList<Student>();

    public Group() {}

    public void setStudent(Student student) {
        list.add(student);
    }

    public void getStudentByLastName(String LastName) {
        list.get(Integer.parseInt(LastName));
    }

    public void delStudentByLastName(String LastName) {
        list.remove(LastName);
    }
}
