import javax.swing.*;
import java.awt.*;

public class JingleBellsMain extends JFrame {
  private JPanel pane = new JPanel(new BorderLayout());

  private JButton websiteButton = new JButton("Website");
  private JButton videoButton = new JButton("Video");

  public JingleBellsMain() {
    super("Jingle Bells");

    pane.add(websiteButton, BorderLayout.CENTER);
    pane.add(videoButton, BorderLayout.WEST);

    add(pane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(500, 500));
    pack();
  }












  public static void main(String[] args) {
    JingleBellsMain main = new JingleBellsMain();
    main.run();
    main.setVisible(true);
  }

  private void run() {
    WebsiteClass websiteClass = new WebsiteClass("https://www.google.com/");
    VideoClass videoClass = new VideoClass();

    websiteButton.addActionListener(websiteClass);
    videoButton.addActionListener(videoClass);
  }
}
