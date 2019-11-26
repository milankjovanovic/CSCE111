import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.URI;

public class WebsiteClass implements ActionListener {
  String websiteString = "";

  public WebsiteClass(String urlString) {
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
