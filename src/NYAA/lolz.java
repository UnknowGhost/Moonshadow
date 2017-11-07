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
    int y;

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawString("justin",50,70);
        g.drawString("Zonneveld",50,85);


    }

}