package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class opdr3 extends Applet {
    Button knop;
    TextField textvakken[];


    public void init() {
        textvakken = new TextField[5];
        for (int teller = 0; teller < textvakken.length; teller++) {
            textvakken[teller] = new TextField(5);
            add(textvakken[teller]);
        }

        knop = new Button("PULL");
        knop.addActionListener(new Volgorde());
        add(knop);
    }

    class Volgorde implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getallen[] = new int[5];
            for (int i = 0; i < textvakken.length; i++) {
                getallen[i] = Integer.parseInt(textvakken[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < textvakken.length; i++) {
                textvakken[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}
