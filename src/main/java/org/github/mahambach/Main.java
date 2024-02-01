package org.github.mahambach;

public class Main {
    public static void main(String[] args) {
        Playable carl = new MusicPlayer();
        Playable bob = new VideoPlayer();
        MediaController.playMedia(bob);
        MediaController.playMedia(carl);

    }
}