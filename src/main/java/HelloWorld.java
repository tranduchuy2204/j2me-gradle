import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;

public class HelloWorld extends MIDlet {
  private Display display;
  private Form form;

  public void startApp() {
    display = Display.getDisplay(this);
    form = new Form("Hello World");
    form.append(new StringItem(null, "Hello, J2ME!"));
    display.setCurrent(form);
  }

  public void pauseApp() {}

  public void destroyApp(boolean unconditional) {}
}
