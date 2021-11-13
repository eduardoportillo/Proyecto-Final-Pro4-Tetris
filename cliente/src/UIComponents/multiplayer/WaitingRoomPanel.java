package UIComponents.multiplayer;

import java.awt.Color;

import javax.swing.JPanel;

import UIComponents.IndexFrame;

public class WaitingRoomPanel extends JPanel{


    public WaitingRoomPanel(IndexFrame indexFrame){
        this.setVisible(true);
        this.setLayout(null);
        this.setBounds(indexFrame.getDimension());
        this.setSize(this.getSize().width, 50);;
        this.setBackground(Color.BLUE);
    }

}
