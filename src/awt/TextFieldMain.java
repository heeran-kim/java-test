package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldMain extends Frame {

    private TextField textField;
    private Label label;
    private Button button;

    public static void main(String[] args) {
        new TextFieldMain();
    }

    public TextFieldMain() {
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

        addLabel();
        addTextField();
        addButton();
        setVisible(true); // after implementing all functions
    }

    private void addButton() {
        setLayout(new FlowLayout()); // without this, there will be a big button
        button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                System.out.println(text);
                label.setText(text);
            }
        });
        add(button);
    }

    private void addLabel() {
        label = new Label("Enter Text");
        add(label);
    }

    private void addTextField() {
        textField = new TextField(20);
        add(textField);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
