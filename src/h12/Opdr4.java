package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.red;

public class Opdr4 extends Applet {
    boolean gevonden;
    int invoer;
    int gezocht;
    int index;
    int[] getallen = {21, 5, 15, 19, 3, 2,11 , 8, 12, 0, 2 ,9};
    Button knop;
    TextField tekstvak;

    public boolean zoeken(int zoek) {
        int teller = 0;
        for (Integer getal : getallen) {
            if (getal.equals(zoek)) {
                index = teller;
                System.out.println("Gevonden");
                return true;
            }
            teller++;
        }
        return false;
    }
    public void init() {
        tekstvak = new TextField(5);

        knop = new Button("OK");

        add(tekstvak);
        add(knop);
        knop.addActionListener( new Knop() );


    }
    public static Integer getIntegerFromTextBox(TextField textBox) {
        Integer integer;

        if (textBox.getText().trim().equals("")) {
            integer = 0;
        } else {
            integer = Integer.parseInt(textBox.getText());
        }

        return integer;
    }
    class Knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(zoeken( getIntegerFromTextBox(tekstvak))){
                gevonden = true;
                repaint();
            }else{
                gevonden = false;
                repaint();
            }
            System.out.println("Button pressed");

        }
    }


    public void paint(Graphics g) {
        //g.drawString("Gevonden", 50, 50);
        if(gevonden) {
            g.drawString("Gevonden " + index, 50, 50);
        }else{
            g.drawString("Niet gevonden", 50, 50);
        }
    }
}
