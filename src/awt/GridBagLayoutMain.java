package awt;

import javax.swing.*;
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
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 400;
        gbc.weighty = 50;
        JPanel title = new JPanel();
        title.setBackground(Color.WHITE);
        add(title, gbc);

        // gbc.gridx = 1;
        // gbc.gridy = 0;
        // add(new Button("Button 2"), gbc);

        // 400 x 300
        // 100 x 200 pixel
        GridBagConstraints gbc_board = new GridBagConstraints();
        gbc_board.gridx = 0;
        gbc_board.gridy = 1;
        JPanel board = new JPanel();
        board.setBackground(Color.BLACK);
        board.setPreferredSize(new Dimension(100, 200));
        add(board, gbc_board);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 300;
        gbc.weighty = 200;
        JPanel score = new JPanel();
        score.setBackground(Color.RED);
        add(score, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 400;
        gbc.weighty = 50;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JPanel(), gbc);

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
