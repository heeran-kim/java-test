package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutMain extends Frame {

    private TextField textField;
    private Label label;
    private Button button;

    public static void main(String[] args) {
        new BorderLayoutMain();
    }

    public BorderLayoutMain() {
        setTitle("Border Layout Example");
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

        setLayout();

        addLabel();
        addTextField();
        addButton();
        setVisible(true); // after implementing all functions
    }

    private void setLayout() {
        // setLayout(new FlowLayout());
        setLayout(new BorderLayout());
    }

    private void addButton() {
        button = new Button("Click Me");
        button.addActionListener(e -> {
            String text = textField.getText();
            System.out.println(text);
            label.setText(text);
        });
        add(button, BorderLayout.EAST);
    }

    private void addLabel() {
        label = new Label("Enter Text");
        add(label, BorderLayout.CENTER);
    }

    private void addTextField() {
        textField = new TextField(20);
        add(textField, BorderLayout.NORTH);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
