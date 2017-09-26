package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button knop1;
    TextField tv1;
    double s;
    double andwoord;
    Label label;



    public void init() {
        tv1 = new TextField("", 30);
        knop1 = new Button("ok");
        knop1.addActionListener(new TekstvakListener());
        label = new Label("Klik ok OK of Enter voor de prijs inclusief BTW");
        add(tv1);
        add(knop1);
        add(label);


    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(andwoord), 50, 70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            andwoord = s * 1.21;
            repaint();
        }
    }
}