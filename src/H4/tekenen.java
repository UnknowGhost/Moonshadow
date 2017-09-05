package H4;//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class tekenen extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawString("driehoek", 20, 50 );

        g.setColor(Color.black);
        g.drawLine(100, 120, 150, 50);
        g.drawLine(150, 50, 200, 120);
        g.drawLine(100, 120, 200, 120);
    }
}




