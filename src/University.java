import university.Professor;
import university.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Professor> professors;
    private  List<Student> students;

    public University(){
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addProfessors(Professor p){
        professors.add(p);
    }

    public void addStudents(Student s){
        students.add(s);
    }

    public void show(){
        System.out.println("\nProfessors are: ");
        for(Professor p: professors){
            p.display();
        }

        System.out.println("\nStudents are: ");
        for(Student s: students){
            s.display();
        }
    }
}
