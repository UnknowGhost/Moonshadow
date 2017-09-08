package H4;

import java.awt.*;
import java.applet.*;

public class Dobelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    setBackground(Color.white);

    g.setColor(Color.black);
    g.drawRect(140, 100, 90,90);
    g.drawLine(140, 100, 160, 60);
    g.drawLine(230,100,250,60);
    g.drawLine(230,190,250,145);
    g.drawLine(250,60,160,60);
    g.drawLine(250, 145, 250, 60);
    g.fillOval(150, 110, 20, 20);
    g.fillOval(200,110,20,20);
    g.fillOval(150, 160, 20,20);
    g.fillOval(200,160,20,20);
    g.fillOval(160, 65, 15,15);
    g.fillOval(155, 85, 15,15);
    g.fillOval(220, 65, 15,15);
    g.fillOval(215, 85, 15, 15);
    g.fillOval(187,73,15,15);
    g.fillOval(235, 125,15,13);



    }
}