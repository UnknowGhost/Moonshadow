package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Button enter;
    int maand;
    int aantaldagen;
    String maandnaam;
    int jaar;



    public void init(){
        enter = new Button("enter");
        TekstvakListner listner = new TekstvakListner();
        enter.addActionListener(listner);
        tekstvak = new TextField(10);
        tekstvak.addActionListener(listner);
        tekstvak2 = new TextField(10);
        tekstvak2.addActionListener(listner);
        add(enter);
        add(tekstvak);
        add(tekstvak2);

    }

    public void paint(Graphics g) {
        g.drawString("maand: " + maandnaam,50,50);
        g.drawString("aantal dagen: " + aantaldagen,50,70);



    }

    class TekstvakListner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            maandnaam = tekstvak.getText();
            maand = Integer.parseInt(maandnaam);

            switch (maand){
                case 1:
                    maand = 1;
                    maandnaam = "Januari";
                    aantaldagen = 31;

                    break;

                case 2:
                    maand = 2;
                    int jaartal = Integer.parseInt(tekstvak2.getText());
                    maandnaam = "Februari";
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        aantaldagen = 29;
                    } else {
                        aantaldagen = 28;
                    }

                    break;

                case 3:
                    maand = 3;
                    maandnaam = "Maart";
                    aantaldagen = 31;

                    break;

                case 4:
                    maand = 4;
                    maandnaam = "April";
                    aantaldagen = 30;

                    break;

                case 5:
                    maand = 5;
                    maandnaam = "Mei";
                    aantaldagen = 31;

                    break;

                case 6:
                    maand = 6;
                    maandnaam = "Juni";
                    aantaldagen = 30;

                    break;

                case 7:
                    maand = 7;
                    maandnaam = "Juli";
                    aantaldagen = 31;

                    break;

                case 8:
                    maand = 8;
                    maandnaam = "Augustus";
                    aantaldagen = 31;

                    break;

                case 9:
                    maand = 9;
                    maandnaam = "September";
                    aantaldagen = 30;

                    break;

                case 10:
                    maand = 10;
                    maandnaam = "October";
                    aantaldagen = 31;

                    break;

                case 11:
                    maand = 11;
                    maandnaam = "November";
                    aantaldagen = 30;

                    break;

                case 12:
                    maand = 12;
                    maandnaam = "December";
                    aantaldagen = 31;

                    break;
            }

            repaint();

        }
    }

}
