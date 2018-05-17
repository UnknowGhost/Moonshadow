package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr6 extends Applet {
    int[] getallen = {1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 7, 8, 9, 0};
    TextField tekstvak;
    Button knop;
    int invoer;
    int aantal;

    public void init() {
        tekstvak = new TextField(5);
        knop = new Button("Press");

        add(tekstvak);
        add(knop);
        knop.addActionListener(new ButtonListner());
    }


    class ButtonListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            invoer = Integer.parseInt(input);

            aantal = 0;
            for (int i = 0; i < getallen.length; i++) {
                if (invoer == getallen[i]) {
                    aantal++;
                }
            }
            System.out.println("Button pressed");
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("de waarde en aantal is: " + aantal, 60, 50);
    }
}

