package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonMain extends Frame {

    public static void main(String[] args) {
        new ButtonMain();
    }

    public ButtonMain() {
        setTitle("AWT Example");
        setSize(400, 300);
        centerWindow();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        addButton();
        setVisible(true); // after implementing all functions
    }

    private void addButton() {
        setLayout(new FlowLayout()); // without this, there will be a big button
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
        add(button);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
