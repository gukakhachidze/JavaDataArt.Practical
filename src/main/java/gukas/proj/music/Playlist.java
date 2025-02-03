package gukas.proj.music;

import java.util.HashSet;
import java.util.Set;

public class Playlist {

    private String playListName;
    Set<Song> songs = new HashSet<>();

    public Playlist(String playListName){
        this.playListName = playListName;
    }

    public void addSong(Song song){
        if (song == null){
            throw new RuntimeException("Not found any song..!");
        }

        songs.add(song);
    }

    public void showSong(){

        if (songs.isEmpty()){
            throw new IllegalArgumentException("Play list is a empty.");
        }

        for(Song song : songs){
            System.out.println(song.getDetail());
        }
    }
}
