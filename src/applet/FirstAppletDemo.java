package applet;

import java.applet.Applet;
import java.awt.*;

/*
<APPLET CODE = FirstAppletDemo.class
WIDTH = 200
HEIGHT = 200>
</APPLET>
 */

public class FirstAppletDemo extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Java Applet Demo", 60, 200);
    }
}
