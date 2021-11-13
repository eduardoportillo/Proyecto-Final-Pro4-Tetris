package UIComponents;

import java.awt.event.*;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuPanel extends JPanel {

    JButton btnMultiplayer = new JButton("Multijugador");
    
    IndexFrame indexFrame;

    Login Login;

    public MenuPanel(IndexFrame indexFrame) {
        this.indexFrame = indexFrame;
        init();
        createBtnMultiplayer();
    }
    private void init(){
        this.setLayout(null);
        this.add(btnMultiplayer);
        this.setBounds(indexFrame.getDimension());
        this.setBackground(Color.CYAN);
    }
    private void createBtnMultiplayer() {
        btnMultiplayer.setBounds(100, 300, 200, 100);
        btnMultiplayer.setVisible(true);
        btnMultiplayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPanelLogin();
            }
        });
    }



    public void openPanelLogin() {
        Login = new Login(this.indexFrame);
        this.indexFrame.getMenuPanel().setVisible(false);
        this.indexFrame.add(Login);
    }
}
