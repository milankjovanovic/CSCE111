/*
Milan Jovanovic
UIN929003483
CSCE 111 - 505
11/25/2019  
Made on a PC
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.URI;

public class WebsiteClass implements ActionListener {
  String websiteString = "";

  public WebsiteClass(String urlString) {
    websiteString = urlString;
  }//end WebsiteClass

  // Opens the website
  public void openWebsite() {
    if (Desktop.isDesktopSupported()) {
      Desktop desktop = Desktop.getDesktop();
      try {
        desktop.browse(new URI(websiteString));
      } catch (Exception e) {
        e.printStackTrace();
      }//end try-catch
    }//end if
  }//end openWebsite

  // actionPerformed is called when the associated button is pressed
  @Override
  public void actionPerformed(ActionEvent e) {
    openWebsite();
  }//end actionPerformed
}
