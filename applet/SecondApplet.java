import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="ShapesApplet.class" width="400" height="400"></applet> */

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Drawing Shapes", 150, 50);
        g.drawLine(50, 70, 250, 70);
        g.drawRect(50, 100, 80, 50);
        g.fillRect(150, 100, 80, 50);
        g.drawOval(250, 100, 80, 50);
        g.fillOval(50, 200, 80, 50);
    }
}
