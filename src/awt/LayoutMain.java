package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutMain extends Frame {

    public static void main(String[] args) {
        new LayoutMain();
    }

    public LayoutMain() {
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
        setLayout(new BorderLayout());
        addLabel();
        addTextField();
        addButton();
        setVisible(true); // after implementing all functions
    }

    private void addButton() {
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
        add(button, BorderLayout.SOUTH);
    }

    private void addLabel() {
        Label label = new Label("Enter Text");
        add(label, BorderLayout.NORTH);
    }

    private void addTextField() {
        TextField textField = new TextField(20);
        add(textField, BorderLayout.CENTER);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
