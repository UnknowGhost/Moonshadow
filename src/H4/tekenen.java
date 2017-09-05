package H4;//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(20, 50, 130, 50 );
        g.drawLine(20, 50, 100, 130 );
        g.drawLine(20, 160, 130, 50 );
    }
}




