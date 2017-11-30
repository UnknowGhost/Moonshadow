package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr8 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int width = 10;
        int height = 10;

        for (int i = 0; i < 100; i++) {
            g.drawOval(30,30,width,height);

            width += 10;
            height += 10;
        }

    }

}
