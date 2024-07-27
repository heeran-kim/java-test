package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutMain extends Frame {

    public static void main(String[] args) {
        new GridBagLayoutMain();
    }

    private GridBagLayoutMain() {
        setTitle("Grid Bag Layout Example");
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

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new Button("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Button("Button 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new Button("Button 4"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new Button("Button 5"), gbc);

        setVisible(true);
    }

    private void centerWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }
}
