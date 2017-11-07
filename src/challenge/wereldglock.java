package challenge;

import java.applet.Applet;
import java.awt.*;

public class wereldglock extends Applet {
    int ontario;
    int hiroshima;
    int chernobyl;
    int melbourne;

    TextField textvak;

    Button knop1;

    String ontario2;
    String hiroshima2;
    String chernbyl2;
    String melbourne2;

    public void init() {
    textvak = new TextField("", 5);

    knop1 = new Button("Toon tijden");

    add(textvak);
    add(knop1);

    ontario2 = ("");
    hiroshima2 = ("");
    chernbyl2 = ("");
    melbourne2 = ("");


    }

    public void paint(Graphics g) {
        g.drawString("Voer hier u uur(en) in",15,20);


    }
}


