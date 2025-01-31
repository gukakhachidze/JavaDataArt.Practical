package gukas.proj;

import gukas.proj.animal.Animal;
import gukas.proj.animal.Cat;
import gukas.proj.animal.Chiken;
import gukas.proj.animal.Dog;
import gukas.proj.interfaces.Guitar;
import gukas.proj.interfaces.Piano;
import gukas.proj.interfaces.Playable;
import gukas.proj.media.Media;
import gukas.proj.media.Movie;
import gukas.proj.media.Song;
import gukas.proj.person.Person;
import gukas.proj.person.Student;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


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
//        Student george = new Student(1,"Ilia State University", "Bussines", 29, "George");
//        george.printDetails();
//        george.setName(" ");
//        george.printDetails();
//
//        Playable instrumentOne = new Guitar();
//        Playable instrumentTwo = new Piano();
//
//        instrumentOne.play();
//        instrumentTwo.play();

        Movie movie = new Movie("Sherekilebi", "Comedy");
        Song song = new Song("2Pac - Dear Mama", "Rap");

        movie.play();
        song.play();
        movie.download();
        song.download();

        song.printDetail();

    }
}