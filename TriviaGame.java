/*
Brenna Casey
527007881
11/26/19
Source:http://www.americanmusicpreservation.com/jinglebellssong.htm
*/
import javax.swing.*;
import java.awt.event.*;

class TriviaGame implements ActionListener {
  public void game() {
    final JPanel panel = new JPanel();
    JOptionPane.showMessageDialog(null, "                                              " +
    "Welcome!\nFor this game you will be quizzed on the song Jingle Bells by Frank Sina" +
    "tra.\nRespond true or false to each statement and see how much you know!");
    final JRadioButton button1 = new JRadioButton("true");
    final JRadioButton button2 = new JRadioButton("false");
    final JRadioButton button3 = new JRadioButton("true");
    final JRadioButton button4 = new JRadioButton("false");
    final JRadioButton button5 = new JRadioButton("true");
    final JRadioButton button6 = new JRadioButton("false");
    final JRadioButton button7 = new JRadioButton("true");
    final JRadioButton button8 = new JRadioButton("false");
    final JRadioButton button9 = new JRadioButton("true");
    final JRadioButton button10 = new JRadioButton("false");
    JOptionPane.showMessageDialog(null, "Question 1)\nThis song was recorded in 1948");
    panel.add(button1);
    panel.add(button2);
    JOptionPane.showMessageDialog(null, panel);
    int Score = 0;

   if(button1.isSelected()) {
      JOptionPane.showMessageDialog(null, "You are correct! ");
      Score = Score + 20;
    }// end if
    else {
      JOptionPane.showMessageDialog(null, "You are incorrect ");
    }// end else
    panel.remove(button1);
    panel.remove(button2);
    panel.add(button3);
    panel.add(button4);
    JOptionPane.showMessageDialog(null, "Question 2)\nJingle Bells was originally intended to be a Thanksgiving song.");
    JOptionPane.showMessageDialog(null, panel);
    if(button3.isSelected()) {
       JOptionPane.showMessageDialog(null, "You are correct! ");
       Score = Score + 20;
     }// end if
     else {
       JOptionPane.showMessageDialog(null, "You are incorrect ");
     }// end else
     panel.remove(button3);
     panel.remove(button4);
     panel.add(button5);
     panel.add(button6);
     JOptionPane.showMessageDialog(null, "Question 3)\nJingle Bells was first written and published in the 20th Century.");
     JOptionPane.showMessageDialog(null, panel);
     if(button5.isSelected()) {
        JOptionPane.showMessageDialog(null, "You are incorrect. Jingle Bells was first published by James Lord Pierpont in 1857.");
      }// end if
      else {
        JOptionPane.showMessageDialog(null, "You are correct! ");
        Score = Score + 20;
      }// end else
      panel.remove(button5);
      panel.remove(button6);
      panel.add(button7);
      panel.add(button8);
      JOptionPane.showMessageDialog(null, "Question 4)\nJames Lord Pierpont wrote the original version of Jingle Bells while living in Florida.");
      JOptionPane.showMessageDialog(null, panel);
      if(button7.isSelected()) {
         JOptionPane.showMessageDialog(null, "You are incorrect. There is debate as to whether Jingle Bells was written in Massachusetts or Georgia,\n" +
         "though it is known for certain that it was not written in Florida which is where Pierpont died.");
       }// end if
       else {
         JOptionPane.showMessageDialog(null, "You are correct! ");
         Score = Score + 20;
       }// end else
       panel.remove(button7);
       panel.remove(button8);
       panel.add(button9);
       panel.add(button10);
       JOptionPane.showMessageDialog(null, "Question 5)\nJingle Bells was the first song to be played in space.");
       JOptionPane.showMessageDialog(null, panel);
       if(button9.isSelected()) {
          JOptionPane.showMessageDialog(null, "You are correct! ");
          Score = Score + 20;
        }// end if
        else {
          JOptionPane.showMessageDialog(null, "You are incorrect. ");
        }// end else
        JOptionPane.showMessageDialog(null, "Your Score is: " + Score);
        switch (Score) {
          case 0:
            JOptionPane.showMessageDialog(null, "You missed every question!");
            break;
          case 20:
            JOptionPane.showMessageDialog(null, "You only got one right!");
            break;
          case 40:
          JOptionPane.showMessageDialog(null, "You don't know very much");
            break;
          case 60:
            JOptionPane.showMessageDialog(null, "Almost passing");
            break;
          case 80:
            JOptionPane.showMessageDialog(null, "You did pretty good!");
            break;
          case 100:
            JOptionPane.showMessageDialog(null, "Good job! You were perfect!");
        }// end switch
        JOptionPane.showMessageDialog(null, "Thanks for Playing!");
  }// end game
  @Override
  public void actionPerformed(ActionEvent e) {
    game();
  }
}// end class
