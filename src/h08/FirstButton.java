package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstButton extends Applet {
    Button knop1;
    Button knop2;
    TextField teksvak;
    int string;

    public void init() {
        knop1 = new Button("OK");
        knop2 = new Button("Reset");

        teksvak = new TextField("click hier", 20);

        add(knop1);
        add(teksvak);
        add(knop2);

    }

    public void paint(Graphics g) {
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                String s = teksvak.getText();
                string = Integer.parseInt(s);
                s = "";
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = teksvak.getText();
            s = "";
        }

    }
}







