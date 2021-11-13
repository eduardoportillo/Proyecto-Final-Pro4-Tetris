package UIComponents;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import UIComponents.multiplayer.LobbyPanel;

public class IndexFrame extends JFrame {

    Rectangle dimension = new Rectangle(400,500);
    public MenuPanel menuPanel;
    public LobbyPanel lobbyPanel;
    
    Login Login;

    public IndexFrame() {
        // this.setBounds(100, 100, 400, 500);
        this.setBounds(dimension);
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menuPanel = new MenuPanel(this);
        this.add(menuPanel);
        menuPanel.setVisible(true);
        
    }

    public LobbyPanel getLobbyPanel() {
        return lobbyPanel;
    }

    public void setLobbyPanel(LobbyPanel lobbyPanel) {
        this.lobbyPanel = lobbyPanel;
    }

    public MenuPanel getMenuPanel() {
        return menuPanel;
    }

    public void setMenuPanel(MenuPanel menuPanel) {
        this.menuPanel = menuPanel;
    }

    public Rectangle getDimension() {
        return dimension;
    }

    public void setDimension(Rectangle dimension) {
        this.dimension = dimension;
    }

    public Login getLogin() {
        return Login;
    }

    public void setLogin(Login Login) {
        this.Login = Login;
    }

}
