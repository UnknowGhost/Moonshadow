package H4;

import java.awt.*;
import java.applet.*;

public class NederlandseFlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);
       g.fillRoundRect(30, 40, 4, 120, 4, 120);
       g.setColor(Color.red);
       g.fillRect(30, 45, 75, 15);
       g.setColor(Color.white);
       g.fillRect(30,60,75, 15);
       g.setColor(Color.blue);
       g.fillRect(30,75,75,15);



    }
}