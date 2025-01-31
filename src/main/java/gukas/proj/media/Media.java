package gukas.proj.media;

public abstract class Media {

    protected String title;
    protected String genre;

    public abstract void play();

    public void printDetail(){
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
    }
}
