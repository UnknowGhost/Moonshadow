package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    String[] telefoonNummers;
    String[] namen;
    TextField tekstvak;
    TextField tekstvak2;
    Button knop;
    int teller;

    public void init() {
        teller = 0;
        telefoonNummers = new String[10];
        namen = new String[10];

        tekstvak = new TextField(5);
        tekstvak2 = new TextField(10);
        knop = new Button("OK");

        add(tekstvak);
        add(tekstvak2);
        add(knop);
        knop.addActionListener(new ButtonListner());
    }

    class ButtonListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[teller] = tekstvak.getText();
            telefoonNummers[teller] = tekstvak2.getText();
            teller++;
            tekstvak.setText("");
            tekstvak2.setText("");
            System.out.println("Button pressed");
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        int y = 80;
        if (teller > 9) {
            for (int i = 0; i < namen.length; i++) {
                g.drawString("" + namen[i], 80, y);
                g.drawString("" + telefoonNummers[i], 150, y);
                y += 20;
            }
        }

    }
}
