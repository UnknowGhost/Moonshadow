package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet{
    TextField textvak;
    Button knop1;
    String getal;
    int y;

    public void init() {
        textvak = new TextField("" ,30);
        knop1 = new Button("enter");
        knop1.addActionListener(new Knop1());
        getal = ("");
        add(knop1);
        add(textvak);
        y = 50;


    }


    public void paint(Graphics graphics){
        graphics.drawString(getal,170,y);

    }

    class Knop1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal = textvak.getText();
            repaint();
        }
    }
}

