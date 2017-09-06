package H4;

import java.awt.*;
import java.applet.*;

public class Diagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 180, 180, 180);
        g.drawLine(20, 20,20,180);
        

    }

}
