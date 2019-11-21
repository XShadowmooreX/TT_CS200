package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CombatWindow {
    private JPanel PanelCombatMain;
    private JLabel LabelTitle;
    private JPanel PanelCombatants;
    private JPanel PanelStats;
    private JButton ButtonAttack;
    private JPanel PanelPlayer;
    private JPanel PanelEnemy;
    private JPanel PanelButtons;
    private JLabel LabelStats;
    private ArrayList<Image> stickGuys = new ArrayList<>();
    private BufferedImage img = null;

    private int count;

    public CombatWindow() {
        String pic;
        this.count = 0;
        //TODO figure this image out for the panelStats
//        Icon litIcon = new ImageIcon(A0.png);
//        LabelStats.setIcon(litIcon);
        for(int i = 0; i < 3; i++) {
            pic = "A" + i + ".png";
            try {
                img = ImageIO.read(new File(pic));
            } catch (IOException e) {
            }
            stickGuys.add(img);
        }
        ButtonAttack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(count == 3){
                    count = 0;
                }
                LabelStats.setText(null);
                ImageIcon newImg = new ImageIcon(stickGuys.get(count));
                LabelStats.setIcon(newImg);
//                LabelStats.imageUpdate(stickGuys.get(count),0,-1,-1, 600, 250);
                System.out.println(("pressed count: "+ count));
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