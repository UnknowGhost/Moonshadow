package H6;

import java.awt.*;
import java.applet.*;


public class Seconds extends Applet {
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;
            int seconds;
                    int hour;
                            int day;
                                    int year;



    public void init() {
        seconds = 60;
        hour = 60;
        day = 24;
        year = 365;



        uitkomst1 = seconds*hour;
        uitkomst2 = seconds*hour*day;
        uitkomst3 = seconds*hour*day*year;



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst1, 20, 20);
        g.drawString("De uitkomst is: " + uitkomst2, 20,40);
        g.drawString("De uitkomst is: " + uitkomst3, 20, 60);



    }


}
