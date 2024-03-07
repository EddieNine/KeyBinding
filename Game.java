package KeyBinding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action leftAction;
    Action downAction;
    Action rightAction;

    Game() {
        frame = new JFrame("KeyBiding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        leftAction = new LeftAction();
        downAction = new DownAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "up");
        label.getActionMap().put("up", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
        label.getActionMap().put("left", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
        label.getActionMap().put("down", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
        label.getActionMap().put("right", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class LeftAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class DownAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class RightAction extends AbstractAction {

        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
