package H4;
import java.awt.*;
import java.applet.*;

public class HuisjeMetRaamEnDeur extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(120, 150, 120, 80);
        g.drawRect(140, 190, 30, 20);
        g.drawLine(240, 150, 180, 50);
        g.drawLine(120, 150,180,50);
        g.drawRect(210, 180, 20, 50);

    }
}





