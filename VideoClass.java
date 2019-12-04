/*
Matthew Stasia
CSCE 111 - 505
Made on a PC
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.URI;

public class VideoClass implements ActionListener {
  String websiteString = "";

  public VideoClass(String urlString) {
    websiteString = urlString;
  }

  public void openWebsite() {
    if (Desktop.isDesktopSupported()) {
      Desktop desktop = Desktop.getDesktop();
      try {
        desktop.browse(new URI(websiteString));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    openWebsite();
  }
}
