
# University Management System

A simple Java application to simulate a university system, where professors and students are managed in lists and displayed. This project demonstrates core object-oriented programming (OOP) principles like encapsulation, modularity, and basic Java package structure.

---

## Table of Contents

1. [Overview](#overview)
2. [Folder Structure](#folder-structure)
3. [Classes and Files](#classes-and-files)
4. [Setup and Execution](#setup-and-execution)
5. [Usage](#usage)
6. [Code Explanation](#code-explanation)
   - [Professor Class](#professor-class)
   - [Student Class](#student-class)
   - [University Class](#university-class)
   - [Main Class](#main-class)
7. [Future Enhancements](#future-enhancements)

---

## Overview

This project is a basic Java application that showcases how to manage entities (in this case, professors and students) using lists. Each entity has simple attributes, like a name, and methods to add and display information.

This project follows a modular approach by organizing code into packages, which helps with organization and scalability as the project grows.

---

## Folder Structure

```plaintext
UniversityManagementSystem/
├── src/
│   ├── university/
│   │   ├── Professor.java
│   │   ├── Student.java
│   │   └── University.java
│   └── Main.java
├── README.md
└── .gitignore
```

- `src/`: Contains all Java source files.
- `university/`: Package containing the core classes of the system (`Professor`, `Student`, `University`).
- `Main.java`: Entry point for running the application.

---

## Classes and Files

1. **Professor.java** - Defines the Professor entity with a name and display functionality.
2. **Student.java** - Defines the Student entity with a name and display functionality.
3. **University.java** - Manages lists of professors and students, providing methods to add and display them.
4. **Main.java** - The main class to demonstrate the functionality of adding and displaying professors and students.

---

## Setup and Execution

### Prerequisites

- Java Development Kit (JDK) installed.
- An IDE like IntelliJ IDEA or Eclipse, or a text editor like Visual Studio Code.

### Execution

1. Clone the repository:
   ```bash
   git clone https://github.com/itspriyambhattacharya/java_university_management_system.git
   ```
2. Open the project in your preferred IDE or editor.
3. Compile and run the `Main.java` file to execute the application.

---

## Usage

The application adds professors and students to the university and displays them. To add additional professors or students, modify the `Main.java` file by creating new instances of `Professor` or `Student` and adding them using the `addProfessors()` or `addStudents()` methods.

---

## Code Explanation

### Professor Class

**File**: `src/university/Professor.java`

The `Professor` class represents a professor entity with a private field for the professor's name (`profName`). This class includes:
- **Constructor**: Takes a single parameter (`name`) to initialize the professor's name.
- **display() Method**: Outputs the professor's name.

#### Code:

```java
public class Professor {
    private String profName;

    public Professor(String name) {
        this.profName = name;
    }

    public void display() {
        System.out.println("\nProfessor: " + this.profName);
    }
}
```

---

### Student Class

**File**: `src/university/Student.java`

The `Student` class represents a student entity with a private field for the student's name (`stuName`). This class includes:
- **Constructor**: Takes a single parameter (`name`) to initialize the student's name.
- **display() Method**: Outputs the student's name.

#### Code:

```java
public class Student {
    private String stuName;

    public Student(String name) {
        this.stuName = name;
    }

    public void display() {
        System.out.println("\nStudent: " + this.stuName);
    }
}
```

---

### University Class

**File**: `src/university/University.java`

The `University` class manages lists of professors and students and provides methods to add and display them.

- **Fields**:
  - `professors`: A list to store `Professor` objects.
  - `students`: A list to store `Student` objects.
  
- **Constructor**: Initializes the lists for professors and students.
  
- **Methods**:
  - `addProfessors(Professor p)`: Adds a `Professor` instance to the professors list.
  - `addStudents(Student s)`: Adds a `Student` instance to the students list.
  - `show()`: Iterates over and displays all professors and students in their respective lists.

#### Code:

```java
public class University {
    private List<Professor> professors;
    private List<Student> students;

    public University() {
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addProfessors(Professor p) {
        professors.add(p);
    }

    public void addStudents(Student s) {
        students.add(s);
    }

    public void show() {
        System.out.println("\nProfessors are: ");
        for (Professor p : professors) {
            p.display();
        }

        System.out.println("\nStudents are: ");
        for (Student s : students) {
            s.display();
        }
    }
}
```

---

### Main Class

**File**: `src/Main.java`

The `Main` class serves as the entry point of the application. It:
1. Creates a `University` instance.
2. Adds several `Professor` and `Student` instances to the university.
3. Calls the `show()` method to display the professors and students.

#### Code:

```java
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
```

---

## Future Enhancements

1. **Additional Attributes**: Expand the `Professor` and `Student` classes to include more attributes, such as department, ID, and courses.
2. **Enhanced Display**: Add methods to display additional details of each professor and student.
3. **Database Integration**: Connect the application to a database for persistent storage of professors and students.
4. **User Interface**: Build a GUI or web interface for user interaction.

---

This concludes the repository documentation. The project demonstrates basic Java OOP principles, including class design, package usage, and encapsulation.
