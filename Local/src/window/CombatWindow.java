package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
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

        ButtonAttack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage(count);
                count++;
                if(count>2){count = 0;}
            }
        });
    }

    /**
     * https://www.youtube.com/watch?v=OTTIsOSzSts used to inspire image methods
     * @return
     */
    public String[] getImages(){
        File file = new File(String.valueOf(getClass().getResource("/images").getFile()));
        return file.list();
    }

    public void showImage(int indexIn){
        String[] imagesList = getImages();
        String imageName = imagesList[indexIn];
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/" + imageName));
        Image image = icon.getImage().getScaledInstance(800, 275, Image.SCALE_SMOOTH);
        LabelStats.setText(null);
        LabelStats.setIcon(new ImageIcon(image));
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