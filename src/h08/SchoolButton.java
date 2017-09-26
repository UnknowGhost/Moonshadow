package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;

public class SchoolButton extends Applet {
    int getal1;
    int getal2;
    int getal3;
    int getal4;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;


    public void init() {
        getal1 = 0;
        getal2 = 0;
        getal3 = 0;
        getal4 = 0;
        knop1 = new Button("mannan");
        knop2 = new Button("potentiële mannen");
        knop3 = new Button("vrouwen");
        knop4 = new Button("potentiële vrouwen");
        knop1.addActionListener( new knop1() );
        knop2.addActionListener( new knop2() );
        knop3.addActionListener( new knop3() );
        knop4.addActionListener( new knop4() );
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);


    }

    public void paint(Graphics graphics) {
        graphics.drawString(String.valueOf(getal1), 10, 50);
        graphics.drawString(String.valueOf(getal2), 130, 50);
        graphics.drawString(String.valueOf(getal3), 210, 50);
        graphics.drawString(String.valueOf(getal4), 320, 50);

    }

    class knop1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = getal1 + 1;
            repaint();

        }
    }

    class knop2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal2 = getal2 + 1;
            repaint();
        }
    }


    class knop3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal3 = getal3 + 1;
            repaint();


        }


    }

    class knop4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal4 = getal4 + 1;
            repaint();

        }
    }

}
