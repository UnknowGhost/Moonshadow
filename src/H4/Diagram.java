package H4;

import java.awt.*;
import java.applet.*;

public class Diagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(30, 180, 200, 180);
        g.drawLine(30, 50,30,180);
        g.drawString("0", 20, 180);
        g.drawString("20",15, 160);
        g.drawString("40",15, 140);
        g.drawString("60",15, 120);
        g.drawString("80",15, 100);
        g.drawString("100", 10, 80);
        g.drawString("120", 10, 60);


    }

}
