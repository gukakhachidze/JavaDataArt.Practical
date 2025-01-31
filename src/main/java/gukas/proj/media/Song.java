package gukas.proj.media;

public class Song extends Media implements Downloadable {

    public Song(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing a song..");
    }

    @Override
    public void download() {
        System.out.println("Downloading " + title + " song");
    }
}
