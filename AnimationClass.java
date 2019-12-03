/*
Bailey Jones
CSCE 111
2/12/19
UIN:326008586
Platform: MAC
*/


import java.lang.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class AnimationClass implements ActionListener{
  private JFrame mainFrame;
  private Music jingleBells;

  public static void Snowman() throws IOException, InterruptedException
  {
    //create arrays to hold each sprite
    ArrayList<String> sprite1 = new ArrayList<String>();
    ArrayList<String> sprite2 = new ArrayList<String>();


    //GetArt will open the text file and read it into a sprite array.
	  GetArt("snowman.txt", sprite1);
    GetArt("MerryChristmas.txt", sprite2);


    //using the animate class for the snowman, then printing merry christmas
    animate(sprite1);
		Thread.sleep(1000);
    cls();
    print(sprite2);



  }  //end Snowman

  public AnimationClass(JFrame main) {
    try {
      jingleBells = new Music("Jingle Bells - Frank Sinatra (1).wav");  
    } catch (Exception e) {
      System.err.println("Could not initalize song");
    }
    mainFrame = main;
  }

  @Override
  public void actionPerformed(ActionEvent t) {
    try {
      mainFrame.toBack();
      jingleBells.startMusic();
      Snowman();
      jingleBells.stopMusic();
    }
    catch (Exception r) {
      System.out.println("Cannot do that");;
    }
  }

  public static void cls(){ //clears screen - Robert Lightfoot
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {
      System.out.println("\033[H\033[2J");//for Mac
    }
  }//end cls

  public static void print(ArrayList<String> printable)
  {
    for(int k = 0; k < printable.size(); k++)
    {
   System.out.println(printable.get(k));
 }//end for
  }// end print

  //animating the snowman party
  public static void animate(ArrayList<String> printable) throws InterruptedException
  {
      // the throws InterruptedException-> sleep command for the gap between each
      int leftMove = 12;
      for(int path = 0; path < leftMove; path++)
      {
      Thread.sleep(1000);
      cls();
        for(int k = 0; k < printable.size(); k++)
        {
          for(int space = leftMove; space > path; space--)
          {
           System.out.print(" ");

         }//end for
       System.out.println(printable.get(k));

   }//end for
    }//end for
  }//end animate

  public static void GetArt(String fileName, ArrayList<String> sprite) throws IOException
 {
 //making sure that the ascii art actually exists
 try
 {
   BufferedReader in = new BufferedReader(new FileReader(fileName));
   //Then, you can use in.readLine(); to read a single line at a time. To read until the end, write a while loop as such:
   int i=0;
   String line;
   while((line = in.readLine()) != null)
   {
     sprite.add(line);
     i++;
   }
 in.close();
 // after reading a file, close the reader
 }
 // If the file is not found, tell the user you cannot use it
       catch(FileNotFoundException ex) {
           System.out.println(
               "Unable to use your art selection: '" +
               fileName + "'");
   }
 }
}
