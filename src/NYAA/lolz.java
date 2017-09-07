package NYAA;/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class lolz extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(100,150,120,100);
        g.drawLine(100, 150,160,70);
        g.drawLine(220,150, 240,180);

    }

}