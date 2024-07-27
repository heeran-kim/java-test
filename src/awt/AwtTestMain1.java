package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTestMain1 extends Frame {

    public static void main(String[] args) {
        new AwtTestMain1();
    }

    public AwtTestMain1() {
//        setSize(new Dimension(300, 200));
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
