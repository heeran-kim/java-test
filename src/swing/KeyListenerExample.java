package swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends JFrame implements KeyListener {
    private JTextField textField;

    public KeyListenerExample() {
        setTitle("KeyListener Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.addKeyListener(this);

        add(textField);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("e.getKeyChar() = " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("e.getKeyChar() = " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("e.getKeyChar() = " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyListenerExample example = new KeyListenerExample();
            example.setVisible(true);
        });
    }
}
