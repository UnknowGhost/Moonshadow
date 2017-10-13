package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet{
    int hoogteXas;
    int valerie, hoogtev1, hoogtev2, hoogtestaafv;
    int jeroen, hoogtej1, hoogtej2, hoogtestaafj;
    int hans, hoogteh1, hoogteh2, hoogtestaafh;

    TextField valerieg;
    TextField jeroeng;
    TextField hansg;

    Button knop1;

    int v;
    int j;
    int h;

    public void init() {

        valerieg = new TextField("",5);
        add(valerieg);

        jeroeng = new TextField("",5);
        add(jeroeng);

        hansg = new TextField("",5);
        add(hansg);

        knop1 = new Button("toon");
        knop1.addActionListener(new Knop1());

        add(knop1);


    }


    public void paint(Graphics g) {
        hoogteXas = 240;

        valerie = v;
        jeroen = j;
        hans = h;

        hoogtestaafv = valerie ;
        hoogtev2 = hoogtestaafv;
        hoogtev1 = hoogteXas - hoogtev2;

        hoogtestaafj = jeroen ;
        hoogtej2 = hoogtestaafj;
        hoogtej1 = hoogteXas - hoogtej2;

        hoogtestaafh = hans ;
        hoogteh2 = hoogtestaafh;
        hoogteh1 = hoogteXas - hoogteh2;

        g.drawLine(30,40,30,240);
        g.drawLine(30,hoogteXas,270,hoogteXas);

        g.drawString("0",20,240);
        g.drawString("20",13,220);
        g.drawString("40",13,200);
        g.drawString("60",13,180);
        g.drawString("80",13,160);
        g.drawString("100",7,140);
        g.drawString("120",7,120);
        g.drawString("140",7,100);
        g.drawString("160",7,80);
        g.drawString("180",7,60);

        g.drawRect(50,hoogtev1,40,hoogtev2);
        g.drawRect(110,hoogtej1,40,hoogtej2);
        g.drawRect(170,hoogteh1,40,hoogteh2);

        g.drawString("Valerie",50,260);
        g.drawString("Jeroen",110,260);
        g.drawString("Hans",175,260);

    }

    class Knop1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            v = Integer.parseInt(valerieg.getText());
            j = Integer.parseInt(jeroeng.getText());
            h = Integer.parseInt(hansg.getText());
            repaint();
        }
    }
}
