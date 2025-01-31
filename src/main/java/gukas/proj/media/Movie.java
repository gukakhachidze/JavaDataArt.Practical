package gukas.proj.media;

public class Movie extends Media implements Downloadable{

    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing a movie..");
    }

    @Override
    public void download() {
        System.out.println("Downloading " + title + " movie");
    }
}
