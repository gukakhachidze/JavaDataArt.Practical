package gukas.proj.music;

import java.util.Objects;

public class Song {
    private String artistName;
    private String songName;

    public Song(String artistName, String songName){
        this.artistName = artistName;
        this.songName = songName;
    }

    public String getDetail(){
        return "Song name: " + songName + " by " + artistName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return Objects.equals(artistName, song.artistName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, songName);
    }
}
