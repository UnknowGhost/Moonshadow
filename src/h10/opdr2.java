package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr2 extends Applet{
    Button knop1;
    TextField textvak;
    TextField textvak2;
    int hoogstegetal;
    int invoer;
    int laagstegetal;
    String tekst;

    public void init(){
        knop1 = new Button("enter");
        InvoerListener listener = new InvoerListener();
        knop1.addActionListener(listener);
        add(knop1);

        textvak = new TextField("",5);
        textvak.addActionListener(listener);
        add(textvak);

        hoogstegetal = Integer.MIN_VALUE;
        laagstegetal = Integer.MAX_VALUE;

        tekst = "";
    }

    public void paint(Graphics g) {

        g.drawString("Het hoogste getal is: " + hoogstegetal,50,50);
        g.drawString("het laagste getal is: " + laagstegetal,50,70);
    }

    class InvoerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoerGebruiker = textvak.getText();
            invoer = Integer.parseInt(invoerGebruiker);
            if (invoer > hoogstegetal) {
                hoogstegetal = invoer;
                repaint();
            }

            if (invoer < laagstegetal) {
                laagstegetal = invoer;

                repaint();
            }

        }

    }
}

