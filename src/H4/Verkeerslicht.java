package H4;

import java.awt.*;
import java.applet.*;

    public class Verkeerslicht extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.fillRoundRect(50, 80, 8,190,8,190);
            g.setColor(Color.gray);
            g.fillOval(23, 25, 60, 120);
            g.setColor(Color.red);
            g.fillOval(38, 37, 30,30);
            g.setColor(Color.orange);
            g.fillOval(38, 72, 30 ,30);
            g.setColor(Color.green);
            g.fillOval(38, 107 ,30, 30);

        }
    }


