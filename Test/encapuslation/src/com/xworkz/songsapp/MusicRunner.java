package com.xworkz.songsapp;

import com.xworkz.songsapp.musicapp.Music;
import com.xworkz.songsapp.songs.Songs;

public class MusicRunner {

    public static void main(String[] args) {

        Music music = new Music();

        music.setSongName("pushpa song");
        String song = music.getSongName();
        System.out.println("the song name is : " + song);

    }
}
