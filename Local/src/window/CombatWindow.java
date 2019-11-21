package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatWindow {
    private JPanel PanelCombatMain;
    private JLabel LabelTitle;
    private JPanel PanelCombatants;
    private JPanel PanelStats;
    private JButton ButtonAttack;
    private JPanel PanelPlayer;
    private JPanel PanelEnemy;
    private JPanel PanelButtons;

    public CombatWindow() {
        ButtonAttack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ouch Mother Fucker!");
            }
        });
    }

    public void createAndShowGUI() {

        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());
        JFrame frame = new JFrame("Title Placeholder in combatwindow.java");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(PanelCombatMain);
        frame.pack();
        frame.setVisible(true);
    }


}