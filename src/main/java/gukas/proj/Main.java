package gukas.proj;

import gukas.proj.animal.*;
import gukas.proj.interfaces.Guitar;
import gukas.proj.interfaces.Piano;
import gukas.proj.interfaces.Playable;
import gukas.proj.library.Book;
import gukas.proj.library.Library;
import gukas.proj.media.Media;
import gukas.proj.media.Movie;
import gukas.proj.music.Playlist;
import gukas.proj.music.Song;
import gukas.proj.person.Person;
import gukas.proj.person.Student;

import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.security.AllPermission;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("Making India Awesome", "Chetan Bhagat");
        Book bookTwo = new Book("A Million Mutinies Now","V.S. Naipaul");

        Library library = new Library("Fiction");

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.showBook();

        Playlist playList = new Playlist("My Play List");
        playList.addSong(new Song("2Pac", "Dear mama"));
        playList.addSong(new Song("Eminem","Mockingbird"));
        playList.addSong(new Song("Eminem", "Mockingbird"));
        playList.showSong();
    }
}