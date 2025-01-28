package gukas.proj;

import gukas.proj.animal.Animal;
import gukas.proj.animal.Cat;
import gukas.proj.animal.Chiken;
import gukas.proj.animal.Dog;
import gukas.proj.person.Person;
import gukas.proj.person.Student;


public class Main {
    public static void main(String[] args) {
//        Cat bootsy = new Cat();
//        bootsy.makeSound();
//        Animal chk = new Chiken();
//        kruxo.makeSound();
//        Dog max = new Dog();
//        max.makeSound();
//
//
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        makeAnimalSound(dog);
//        makeAnimalSound(cat);
//    }
//
//    public static void makeAnimalSound(Animal animal){
//        System.out.println("Trying to make animal sound..");
//        animal.makeSound();
        Student george = new Student(1,"Ilia State University", "Bussines", 29, "George");
        george.printDetails();
        george.setName(" ");
        george.printDetails();
    }
}