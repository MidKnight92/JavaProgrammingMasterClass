package com.viveros.steph.linkedlistchallenge;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    private static void printSongsOnAlbum(LinkedList<Song> songs){
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
    return false;
    }

    private Song findSong(String title){
        for (Song checkSong: this.songs){
            if (checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkSong = findSong(title);
        if (checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
