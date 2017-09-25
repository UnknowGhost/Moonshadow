package H6;

import java.awt.*;
import java.applet.*;

public class Getallen extends Applet{
    int a;
    int b;



    public void init(){
        a = 10;
        b = 20;



    }

    public void paint(Graphics graphics){

        graphics.drawString("de uitkomst is: " + - (a + b), 50, 50);
    }





}





