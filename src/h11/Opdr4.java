package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {

    int getal1;
    int antwoord;

    public void init() {
        getal1 = 3;

    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;

        for ( int getal2 = 0; getal2 < 100; getal2++) {
            g.drawString("" + antwoord, x, y);
            getal1 = 3;
            antwoord = getal1*getal2;

            x += 20;
        }


    }

    }


