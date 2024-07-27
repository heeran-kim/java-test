package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelMain extends Frame {

    public static void main(String[] args) {
        new LabelMain();
    }

    public LabelMain() {
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
        addLabel();
        setVisible(true); // after implementing all functions
    }

    private void addButton() {
        setLayout(new FlowLayout()); // without this, there will be a big button
        Button button = new Button("Click Me");
        button.addActionListener(e -> System.out.println("Button Clicked"));
        add(button);
    }

    private void addLabel() {
        Label label = new Label("Hello World...");
        add(label);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
