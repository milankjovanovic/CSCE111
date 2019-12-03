/*
Milan Jovanovic
UIN929003483
CSCE 111 - 505
11/25/2019
Made on a PC
*/

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {
  Clip sound;

  public Music(String fileName) throws Exception {
    sound = AudioSystem.getClip();
    sound.open(AudioSystem.getAudioInputStream(new File(fileName)));
  }//end Music

  // Starts the music
  public void startMusic() {
    sound.start();
  }//end startMusic

  // Stops the music
  public void stopMusic() {
    sound.stop();
  }//end stopMusic
}//end class
