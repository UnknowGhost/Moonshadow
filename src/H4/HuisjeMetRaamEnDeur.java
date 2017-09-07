package H4;
import java.awt.*;
import java.applet.*;

public class HuisjeMetRaamEnDeur extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.drawRect(120, 150, 120, 100);
        g.drawRect(140, 190, 30, 20);
        g.drawLine(240, 150, 180, 50);
        g.drawLine(120, 150,180,50);
        g.drawRect(210, 200, 20, 50);
        g.drawRect(165, 115, 30,25);
        g.drawRect(190, 65, 15, 30);

    }
}





