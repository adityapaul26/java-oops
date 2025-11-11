import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventExample extends JFrame implements ActionListener {
    JButton b;
    JLabel l;

    ActionEventExample() {
        b = new JButton("Click Me");
        l = new JLabel("Waiting for click...");
        add(b);
        add(l);
        setLayout(new FlowLayout());
        b.addActionListener(this);
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}

public class MouseEventExample extends JFrame implements MouseListener {
    JLabel l;

    MouseEventExample() {
        l = new JLabel("No Mouse Event Yet");
        add(l);
        addMouseListener(this);
        setSize(300, 150);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventExample();
    }
}

public class KeyEventExample extends JFrame implements KeyListener {
    JLabel l;

    KeyEventExample() {
        l = new JLabel("Type something...");
        add(l);
        addKeyListener(this);
        setSize(300, 150);
        setLayout(new FlowLayout());
        setVisible(true);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyEventExample();
    }
}

