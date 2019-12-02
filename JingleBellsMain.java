import javax.swing.*;
import java.awt.*;

public class JingleBellsMain extends JFrame {
  private JPanel pane = new JPanel();
  private JPanel textPane = new JPanel();

  private JButton websiteButton = new JButton("Website");
  private JButton videoButton = new JButton("Video");
  private JButton animationButton = new JButton("Animation");
  private JButton triviaGameButton = new JButton("Trivia Game");
  private JLabel jlabel = new JLabel("Jingle Bells");

  public JingleBellsMain() {
    super("Jingle Bells");

    jlabel.setFont(new Font("Verdana",1,20));
    jlabel.setForeground(Color.white);
    textPane.add(jlabel);
    pane.add(videoButton);
    pane.add(animationButton);
    pane.add(websiteButton);
    pane.add(triviaGameButton);


    // setBackground(new Color(43, 119, 197));
    getContentPane().setBackground(new Color(43, 119, 197));
    pane.setOpaque(false);
    textPane.setOpaque(false);
    pane.setLayout( new FlowLayout(FlowLayout.CENTER, 3, 175));
    websiteButton.setPreferredSize( new Dimension(100, 30));
    videoButton.setPreferredSize( new Dimension(100, 30));
    animationButton.setPreferredSize( new Dimension(100, 30));
    triviaGameButton.setPreferredSize( new Dimension(100, 30));

    add(textPane, BorderLayout.NORTH);
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
    AnimationClass animationClass = new AnimationClass();

    websiteButton.addActionListener(websiteClass);
    videoButton.addActionListener(videoClass);
    triviaGameButton.addActionListener(triviaGameClass);
    animationButton.addActionListener(animationClass);
  }
}
