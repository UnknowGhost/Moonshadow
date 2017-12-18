package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr5 extends Applet {
    double totaal;
    int aantalCijfers;
    double gemiddelde;
    String beoordeling;

    Button knop;

    TextField tekstvak;

    public void init() {
        tekstvak = new TextField(5);

        knop = new Button("OK");
        Gemmiddelde listner = new Gemmiddelde();
        knop.addActionListener(listner);

       totaal = 0;
       aantalCijfers = 0;
       gemiddelde = totaal / aantalCijfers;

        add(tekstvak);
        add(knop);
        beoordeling = "";

    }

    public void paint(Graphics g) {g.drawString("het cijfer is: " + beoordeling,50,70);
        g.drawString("gemiddelde: " + gemiddelde, 50,90);
    }

    class Gemmiddelde implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double invoer = Double.parseDouble(tekstvak.getText());
            totaal += invoer;
            aantalCijfers++;
            gemiddelde = totaal / aantalCijfers;

            if (gemiddelde < 5.5)
                beoordeling = "onvoldoende";
            else beoordeling = "voldoende";

            repaint();



        }
    }

}
