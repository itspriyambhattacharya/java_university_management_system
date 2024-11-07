package university;

public class Professor {
    private String profName;

    public Professor(String name){
        this.profName = name;
    }

    public void display(){
        System.out.println("\nProfessor: "+ this.profName);
    }
}
