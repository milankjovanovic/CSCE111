import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {
  Clip sound = AudioSystem.getClip();

  public Music(String fileName) throws Exception {
    sound.open(AudioSystem.getAudioInputStream(new File(fileName)));
  }

  public void startMusic() {
    sound.start();
  }

  public void stopMusic() {
    sound.stop();
  }
}
