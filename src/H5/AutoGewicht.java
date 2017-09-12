package H5;
import java.awt.*;
import java.applet.*;

public class AutoGewicht extends Applet {
    int hoogteXAs;
    int gewichtValarie;
    int gewichtJeroen;
    int gewichtHans;

    public void init() {
        hoogteXAs = 180;
        gewichtValarie = 120;
        gewichtJeroen = 90;
        gewichtHans = 10;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(30, hoogteXAs, 200, hoogteXAs);
        g.drawLine(30, 50,30,180);
        g.drawString("0", 20, 180);
        g.drawString("20",15, 160);
        g.drawString("40",15, 140);
        g.drawString("60",15, 120);
        g.drawString("80",15, 100);
        g.drawString("100", 10, 80);
        g.drawString("120", 10, 60);
        g.setColor(Color.blue);
        g.fillRect(40, hoogteXAs-gewichtJeroen, 20, gewichtJeroen);
        g.drawString("Jeroen",30, 200);
        g.setColor(Color.red);
        g.fillRect(80, hoogteXAs-gewichtHans,20,gewichtHans);
        g.drawString("Hans",75, 200);
        g.setColor(Color.magenta);
        g.fillRect(120, hoogteXAs-gewichtValarie, 20,gewichtValarie );
        g.drawString("valarie",115, 200);



    }

}
