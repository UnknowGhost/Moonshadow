package H6;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet{
    double a;
    double b;
    double c;
    double uitkomst;
    int d;
    double uitkomst2;
    int e;
    int uitkomst3;
    double f;
    double uitkomst4;





    public void init(){
         a = 5.9;
         b = 6.3;
         c = 6.9;
         uitkomst = a+b+c;
         d = 3;
         uitkomst2 = uitkomst/d;
         e = 10;
         uitkomst3 = (int) (uitkomst2*e);
         f = 10;
         uitkomst4 = uitkomst3/f;



    }


    public void paint(Graphics g){
        g.drawString("" + uitkomst4, 20,20);


    }


}
