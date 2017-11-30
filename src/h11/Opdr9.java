package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr9 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(new Color(210, 5, 235));

        int width = 50;
        int height = 50;

        int x = 50;
        int y = 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, width, height);
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            }

            x += width;
        }
        /* -- Einde For -- */

        /* -- Begin for -- */
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        /* -- Einde for -- */

        /* -- Begin For --*/

        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, width, height);
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            }

            x += width;

        }
        /* -- Einde for -- */

          /* -- Begin for -- */
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        /* -- Einde for -- */

          /* -- Begin For --*/

        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, width, height);
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            }

            x += width;

        }
        /* -- Einde For -- */

         /* -- Begin for -- */
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        /* -- Einde for -- */

          /* -- Begin For --*/

        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, width, height);
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            }

            x += width;

        }
        /* -- Einde For -- */

         /* -- Begin for -- */
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        /* -- Einde for -- */
    }
    /* -- Einde Paint -- */
}
