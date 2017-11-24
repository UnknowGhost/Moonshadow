package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    Button button;

    TextField textField;

    int invoer;

    String s;

    public void init() {
        button = new Button("OK");
        Beoordeling listner = new Beoordeling();
        button.addActionListener(listner);

        textField = new TextField(5);

        s = "";

        add(textField);
        add(button);

    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is: " + s, 50,60);

    }

    class Beoordeling implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = textField.getText();
            invoer = Integer.parseInt(s);

            switch (invoer) {
                case 1:
                    invoer = 1;
                    s = "slecht";

                case 2:
                    invoer = 2;
                    s = "slecht";

                case 3:
                    invoer = 3;
                    s = "slecht";

                    break;

                case 4:
                    invoer = 4;
                    s = "onvoldoende";

                    break;

                case 5:
                    invoer = 5;
                    s = "matig";

                    break;

                case 6:
                    invoer = 6;
                    s = "voldoende";

                case 7:
                    invoer = 7;
                    s = "voldoende";

                    break;

                case 8:
                    invoer = 8;
                    s = "goed";

                case 9:
                    invoer = 9;
                    s = "goed";

                case 10:
                    invoer = 10;
                    s = "goed";

                    break;

            }

            if (invoer > 10)
                s = "ERROR";

            if (invoer < 1)
                s = "ERROR";

            repaint();

        }
    }
}
