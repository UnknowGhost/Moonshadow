package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdr1 extends Applet {
    int[] getallen = {5, 6, 2, 9, 4, 6, 2, 6, 9, 10};
    double gemiddelde;

    public void init() {

        int totaal = 0;

        for (int i = 0; i < getallen.length; i++) {
            totaal = totaal + getallen[i];
        }
        gemiddelde = (double) totaal / getallen.length;

    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;

        for (int teller = 0; teller < getallen.length; teller ++)
            g.drawString("" + getallen[teller], x, y * teller + 5);

        g.drawString("" + gemiddelde, 20, 205 );


    }
}



