import javax.swing.*;
import java.awt.*;

public class JingleBellsMain extends JFrame {
  private JPanel pane = new JPanel();

  private JButton websiteButton = new JButton("Website");
  private JButton videoButton = new JButton("Video");
  private JButton animationButton = new JButton("Animation");
  private JButton triviaGameButton = new JButton("Trivia Game");

  public JingleBellsMain() {
    super("Jingle Bells");

    pane.add(videoButton);
    pane.add(animationButton);
    pane.add(websiteButton);
    pane.add(triviaGameButton);

    add(pane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(500, 500));
    pack();
  }












  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (UnsupportedLookAndFeelException e) {
    } catch (ClassNotFoundException e) {
    } catch (InstantiationException e) {
    } catch (IllegalAccessException e) {
    }
    JingleBellsMain main = new JingleBellsMain();
    main.run();
    main.setVisible(true);
  }

  private void run() {
    WebsiteClass websiteClass = new WebsiteClass("http://people.tamu.edu/~milankjovanovic/JingleBells/JingleBellsSong.html");
    VideoClass videoClass = new VideoClass("https://www.youtube.com/watch?v=fkhKg-WLohk");
    TriviaGame triviaGameClass = new TriviaGame();

    websiteButton.addActionListener(websiteClass);
    videoButton.addActionListener(videoClass);
    triviaGameButton.addActionListener(triviaGameClass);
  }
}
