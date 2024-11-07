import university.Professor;
import university.Student;

public class Main {
    public static void main(String[] args) {
        University univ = new University();

        univ.addProfessors(new Professor("Rahul"));
        univ.addProfessors(new Professor("Rohan"));
        univ.addProfessors(new Professor("Rohit"));

        univ.addStudents(new Student("Priyam"));
        univ.addStudents(new Student("Priyanka"));

        univ.show();
    }
}
