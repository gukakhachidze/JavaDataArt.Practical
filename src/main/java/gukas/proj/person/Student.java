package gukas.proj.person;

public class Student extends Person {

    private int studentId;
    private String university;
    private String program;

    public Student(int studentId, String university, String program, int age, String name){

        setProgram(program);
        setStudentId(studentId);
        setUniversity(university);
        setAge(age);
        setName(name);
    }

    @Override
    public void printDetails() {

        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("University: " + university);
        System.out.println("Program: " + program);
        System.out.println("Student Id: " +studentId);
    }

    public void setStudentId(int id){
        if (id <= 0) {
            System.out.println("Zero or less than zero cannot be id. ");
        }else{
           studentId = id;
        }
    }

    public void setUniversity(String uni){
        if (uni.isBlank() || uni.isEmpty()){
            System.out.println("Please enter university..!");
        }else{
            university = uni;
        }
    }

    public void setProgram(String program){
        if (program.isBlank() || program.isEmpty()){
            System.out.println("Please enter program..!");
        }else{
            this.program = program;
        }
    }

    public void setAge(int age){
        if (age < 0 ){
            System.out.println("Age cannot be less than zero!");
        }else {
            this.age = age;
        }
    }

    public void setName(String name){
        if (name.isBlank() || name.isEmpty()){
            System.out.println("Please enter name..!");
        }else{
            this.name = name;
        }
    }
}
