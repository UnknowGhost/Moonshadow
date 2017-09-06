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
    }
}





