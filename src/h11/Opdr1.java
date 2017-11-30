package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr1 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int x = 0;
        int teller = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 30, x, 200);
            g.drawString("" + teller, x , 215);
        }



    }

}
