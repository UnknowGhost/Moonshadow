package H5;

import java.applet.Applet;
import java.awt.*;


public class Variabelen extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 120;
        hoogte = 60;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);
        g.drawLine(10,10, 90, 10);
        g.drawString("lijn",30, 25);
        g.drawRect(10, 30, breedte, hoogte);
        g.drawString("rechthoek",20, 105);
        g.setColor(opvulkleur);
        g.fillRect(160, 30,  breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(160, 30, breedte, hoogte);
        g.drawOval(10, 120,  breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(10, 120,  breedte, hoogte,0,50);
        g.setColor(lijnkleur);
        g.drawRoundRect(150, 120, breedte, hoogte, 20, 20);
        g.setColor(opvulkleur);
        g.fillOval(10, 220, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(150, 190,  100,100 ,0,360);


    }
}
