package H4;
import java.awt.*;
import java.applet.*;

public class Arc extends Applet {




    public void paint(Graphics g) {
      setBackground(Color.blue);

      g.setColor(Color.yellow);
      g.fillArc(100,100,150,130,0,360);

    }
}

