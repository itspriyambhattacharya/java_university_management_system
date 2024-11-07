package university;

public class Student {
    private String stuName;

    public Student(String name){
        this.stuName = name;
    }

    public void display(){
        System.out.println("\nStudent: "+ this.stuName);
    }
}
