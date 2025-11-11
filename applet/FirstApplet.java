import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello world from applet!",100,100);
    }
}