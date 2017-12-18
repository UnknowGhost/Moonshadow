package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
    Button button;

    int invoer;
    int antwoord;

    public void init() {
        tekstvak = new TextField(5);
        button = new Button("OK");
        button.addActionListener(new Listner());

        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {
        int y = 20;

        for (int tafel = 0; tafel <= 10; tafel++) {
            antwoord = tafel * invoer;

            g.drawString(tafel + " X " + invoer + " = " + antwoord, 50, y);

            y += 20;
        }
    }

    class Listner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String string = tekstvak.getText();
            invoer = Integer.parseInt(string);

            repaint();
        }
    }
}

