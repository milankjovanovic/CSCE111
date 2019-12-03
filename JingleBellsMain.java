/*
Milan Jovanovic
Brenna Casey
Bailey Jones
Matthew Stasia
*/

import javax.swing.*;
import java.awt.*;

public class JingleBellsMain extends JFrame {
  // Create panels
  private JPanel pane = new JPanel();
  private JPanel textPane = new JPanel();

  // Create buttons and JLabel
  private JButton websiteButton = new JButton("Website");
  private JButton videoButton = new JButton("Video");
  private JButton animationButton = new JButton("Animation");
  private JButton triviaGameButton = new JButton("Trivia Game");
  private JLabel jlabel = new JLabel("Jingle Bells");

  // Milan Jovanovic
  public JingleBellsMain() {
    super("Jingle Bells");

    // Setup JLabel
    jlabel.setFont(new Font("Verdana",1,20));
    jlabel.setForeground(Color.white);
    textPane.add(jlabel);

    // Add buttons to the panel
    pane.add(videoButton);
    pane.add(animationButton);
    pane.add(websiteButton);
    pane.add(triviaGameButton);


    // Brenna Casey
    getContentPane().setBackground(new Color(43, 119, 197));

    // Make the JPanels transparent
    pane.setOpaque(false);
    textPane.setOpaque(false);

    pane.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 175));
    // Set the button sizes
    websiteButton.setPreferredSize(new Dimension(100, 30));
    videoButton.setPreferredSize(new Dimension(100, 30));
    animationButton.setPreferredSize(new Dimension(100, 30));
    triviaGameButton.setPreferredSize(new Dimension(100, 30));

    // Add the panels to the JFrame
    add(textPane, BorderLayout.NORTH);
    add(pane, BorderLayout.CENTER);

    // Setup the JFrame    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(600, 600));
    setResizable(false);
    pack();
  }//end JingleBellsMain





  // Milan Jovanovic
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (UnsupportedLookAndFeelException e) {
      System.err.println("Could not set look and feel");
    } catch (ClassNotFoundException e) {
      System.err.println("Could not set look and feel");
    } catch (InstantiationException e) {
      System.err.println("Could not set look and feel");
    } catch (IllegalAccessException e) {
      System.err.println("Could not set look and feel");
    }//end try-catch

    // Create JFrame
    JingleBellsMain main = new JingleBellsMain();
    main.run(); // Setup buttons
    main.setVisible(true);
  }//end main

  // Milan Jovanovic
  private void run() {
    // Setup classes
    WebsiteClass websiteClass = new WebsiteClass("http://people.tamu.edu/~milankjovanovic/JingleBells/JingleBellsSong.html");
    VideoClass videoClass = new VideoClass("https://www.youtube.com/watch?v=fkhKg-WLohk");
    TriviaGame triviaGameClass = new TriviaGame();
    AnimationClass animationClass = new AnimationClass(this);

    // Pair buttons to their respective classes
    websiteButton.addActionListener(websiteClass);
    videoButton.addActionListener(videoClass);
    triviaGameButton.addActionListener(triviaGameClass);
    animationButton.addActionListener(animationClass);
  }//end run
}//end class
