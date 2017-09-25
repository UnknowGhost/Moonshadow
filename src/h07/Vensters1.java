package h07;

import java.awt.*;
import java.applet.*;

public class Vensters1 extends Applet {

    public void init() {
        Dimension dim = new Dimension(400, 300);
        this.setSize(dim);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}
