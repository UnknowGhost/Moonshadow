package Huisje;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knoprepaint extends Applet{
    TextField tv1;
    TextField tv2;

    Button knop1;
    Button knop2;

    String s;

    int getal1;
    int getal2;

    public void init(){
        tv1 = new TextField("",5);
        tv2 = new TextField("",5);

        knop1 = new Button("dick");
        knop1.addActionListener(new Knop1());
        knop2 = new Button("pussy");
        knop2.addActionListener(new Knop2());

        s = "";

        add(tv1);
        add(tv2);

        add(knop1);
        add(knop2);

    }

    public void paint(Graphics g){
        g.drawString(s,50,50);

    }

    class Knop1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tv1.getText();
            s = tv2.getText();

            getal1 = Integer.parseInt(s);
            getal2 = Integer.parseInt(s);

            repaint();
        }
    }

    class Knop2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tv1.getText();
            s = tv2.getText();

            getal1 = Integer.parseInt(s);
            getal2 = Integer.parseInt(s);

            repaint();
        }
    }
}