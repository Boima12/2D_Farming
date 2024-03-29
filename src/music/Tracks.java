package music;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class Tracks {
	private boolean IsPlaying = false;
	private boolean IsPause = true;
	private AudioInputStream audioPath1;
	private Clip track1;
	private long clipTimePosition;
	
	private String song1;
	private String song2;
	private String song3;
	
	public Tracks() {
		try {
			String sc1 = new File(".").getCanonicalPath();
			
			this.song1 = sc1 + "/src/music/horror_background.wav";
			this.song2 = sc1 + "/src/music/farm1_nicopatty.wav";
			this.song3 = sc1 + "/src/music/win_farland.wav";
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setTrack(String path) {
		if (IsPlaying == true) {
			System.out.println(audioPath1 + " is Playing!");
			return;
		}
		
		try {
			File audioFile1 = new File(path);
			audioPath1 = AudioSystem.getAudioInputStream(audioFile1);
			
			track1 = AudioSystem.getClip();
			track1.open(audioPath1);
			
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