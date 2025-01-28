package gukas.proj.person;

public class Programmer extends Person{

    private String programmingLanguage;
    private int yearsOfExperience;

    public Programmer(String name, int age, String programmingLanguage, int yearsOfExperience){

        setName(name);
        setAge(age);
        setProgrammingLanguage(programmingLanguage);
        setYearsOfExperience(yearsOfExperience);
    }
    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Years of experience: " + yearsOfExperience);
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

    public void setYearsOfExperience(int yearsOfExperience){
        if (yearsOfExperience < 0 ){
            System.out.println("Age cannot be less than zero!");
        }else {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public void setProgrammingLanguage(String programmingLanguage){
        if (programmingLanguage.isBlank() || programmingLanguage.isEmpty()){
            System.out.println("Please enter programming language..!");
        }else{
            this.programmingLanguage = programmingLanguage;
        }
    }
}
