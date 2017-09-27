package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet{
    TextField tv1;
    TextField tv2;
    Button plusknop;
    Button minknop;
    Button keerknop;
    Button deelknop;
    double s;
    double a;
    double antwoord;

    public void init(){
        tv1 = new TextField("",10);
        tv2 = new TextField("",10);
        plusknop = new Button("+");
        plusknop.addActionListener( new PlusKnop());
        minknop = new Button("-");
        minknop.addActionListener( new MinKnop());
        keerknop = new Button("x");
        keerknop.addActionListener( new KeerKnop());
        deelknop = new Button("/");
        deelknop.addActionListener( new DeelKnop());
        add(tv1);
        add(tv2);
        add(plusknop);
        add(minknop);
        add(keerknop);
        add(deelknop);
        
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(antwoord), 50, 60);
    }

    class PlusKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s+a;
            repaint();

        }
    }

    class MinKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s-a;
            repaint();

        }
    }

    class KeerKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s*a;
            repaint();

        }
    }

    class DeelKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s/a;
            repaint();

        }
    }



}
