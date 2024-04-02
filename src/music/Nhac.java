package music;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.*;

public class Nhac {
    private boolean IsPlaying = false;
    private boolean IsPause = true;
    private InputStream audioPath1;
    private Clip track1;
    private long clipTimePosition;

    private String song1;
    private String song2;
    private String song3;

    public Nhac() {
        this.song1 = "horror_background.wav";
        this.song2 = "farm1_nicopatty.wav";
        this.song3 = "win_farland.wav";
    }

    public void setTrack(String path) {
        if (IsPlaying == true) {
            System.out.println(audioPath1 + " is Playing!");
            return;
        }

        try {
            // Load audio file from InputStream
            audioPath1 = getClass().getResourceAsStream(path);
            if (audioPath1 == null) {
                System.out.println("Could not load audio file: " + path);
                return;
            }

            // Open audio input stream
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioPath1);

            // Get a Clip instance
            track1 = AudioSystem.getClip();

            // Open audio clip and load samples from the audio input stream
            track1.open(audioInputStream);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playTrack() {
        if (IsPlaying == true) {
            System.out.println(audioPath1 + " is Playing!");
            return;
        }

        IsPlaying = true;

        track1.start();
        track1.loop(Clip.LOOP_CONTINUOUSLY);

    }

    public void pauseTrack() {
        if (IsPause == true) {
            System.out.println(audioPath1 + " is currently Paused!");
            return;

        } else if (IsPlaying == false) {
            return;
        }

        clipTimePosition = track1.getMicrosecondLength();
        track1.stop();

        IsPause = true;
        IsPlaying = false;

    }

    public void resumeTrack() {
        if (IsPause == false) {
            System.out.println(audioPath1 + " currently not Pause!");
            return;
        }

        track1.setMicrosecondPosition(clipTimePosition);
        track1.start();

        IsPause = false;
        IsPlaying = true;
    }

    public void stopTrack() {
        track1.stop();

        IsPlaying = false;
    }

    public void song1() {
        setTrack(song1);
    }

    public void song2() {
        setTrack(song2);
    }

    public void song3() {
        setTrack(song3);
    }
}
