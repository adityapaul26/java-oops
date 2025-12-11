// Create an interface Playable with two methods:
//
// void play();
//
// void pause();
//
// Create two classes MusicPlayer and VideoPlayer that implement Playable:
//
// MusicPlayer should print:
//
// "Playing music" and "Music paused"
//
// VideoPlayer should print:
//
// "Playing video" and "Video paused"
//
// In the main method:
//
// Store both objects in a Playable[] array
//
// Use a loop to call play() and pause() on each object (demonstrate runtime
// polymorphism through interface reference)

import java.util.*;

interface Playable {
    void play();

    void pause();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Playing music...");
    }

    public void pause() {
        System.out.println("Music paused...");
    }
}

class VideoPlayer implements Playable {
    public void play() {
        System.out.println("Playing video...");
    }

    public void pause() {
        System.out.println("Video paused...");
    }
}

public class PlayMainInter {
    public static void main(String[] args) {
        Playable[] players = new Playable[2];
        players[0] = new MusicPlayer();
        players[1] = new VideoPlayer();

        for (Playable p : players) {
            p.play();
            p.pause();
            System.out.println();
        }
    }
}
