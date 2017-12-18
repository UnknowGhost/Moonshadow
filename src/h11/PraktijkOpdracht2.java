package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht2 extends Applet {
    Button button;

    int tafel;
    int antwoord;

    public void init() {
        button = new Button("OK");
        button.addActionListener(new Listner());
        tafel = 1;

        add(button);
    }

    public void paint(Graphics g) {
        int y = 20;
        for (int keer = 1; keer <= 10; keer++) {
            antwoord = tafel * keer;

            g.drawString(keer + " X " + tafel + " = " + antwoord, 50, y);

            y += 20;
        }
    }

    class Listner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel++;
            if (tafel >= 11) {
                tafel = 1;
            }
            repaint();
        }
    }
}
