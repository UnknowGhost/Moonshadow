package Huisje;

import java.applet.Applet;
import java.awt.*;

public class Huisje extends Applet{


    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(70,240,200,150);

        g.drawLine(70,240,170,130);
        g.drawLine(270,240,170,130);


    }
}
