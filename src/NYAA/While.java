package NYAA;

import java.awt.*;
import java.applet.*;


public class While extends Applet {

    int som;
    int getal1;
    int getal2;

    public void init() {
        getal1 = 0;
        getal2 = 1;
        som = getal1 + getal2;

    }

   public void paint(Graphics g) {
        int x = 0;
        int y = 20;

       for (int i = 0; i < 1000; i++) {
           g.drawString("" + som, x, y);
           getal1 = getal2;
           getal2 = som;
           som = getal1 + getal2;
           x += 30;

       }

   }
}
