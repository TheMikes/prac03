package collections;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public static final Student[] STUDENTS_ARRAY = {
            new Student("Daniel", 70),
            new Student("Ashley", 99),
            new Student("Christopher", 59),
            new Student("Elizabeth", 84),
            new Student("David", 69),
            new Student("Jessica", 35),
            new Student("James", 50),
            new Student("Nicole", 50),
            new Student("Michael", 76),
            new Student("Sarah", 95),
            new Student("Joseph", 32),
            new Student("Jennifer", 100),
            new Student("Joshua", 92),
            new Student("Amanda", 33)
    };

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}