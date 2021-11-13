package UIComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import UIComponents.multiplayer.LobbyPanel;
import socket.client.Client;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel {

    JLabel labelIpServer = new JLabel();
    JLabel labelNombre = new JLabel("Nombre:");
    JTextField inputNombre = new JTextField();
    JButton btnLogin = new JButton("Login");

    IndexFrame indexFrame;

    Client client = null;

    public Login(IndexFrame indexFrame){
        this.indexFrame = indexFrame;
        this.setBounds(indexFrame.getDimension());
        client = new Client();
        intLabelIpServer(client.getServerIp());
        init();
    }

    private void init() {
        this.setBackground(Color.red);
        this.setVisible(true);
        this.setLayout(null);

        labelIpServer.setBounds(60, 10, 300, 60);

        labelNombre.setBounds(40, 350, 70, 20);
        labelNombre.setFont(new Font("Serif", Font.PLAIN, 20));

        inputNombre.setBounds(labelNombre.getX() + labelNombre.getWidth() + 5, labelNombre.getY(), 200,
                labelNombre.getHeight());

        this.add(labelIpServer);
        this.add(labelNombre);
        this.add(inputNombre);
        createBtnLogin();
    }

    public void createBtnLogin() {
        int ancho = 200;
        btnLogin.setBounds(this.getBounds().width/2-(ancho/2), labelNombre.getBounds().y+50, ancho, 30);
        this.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                openPanelLobby();
                
            }
        });
    }

    public void intLabelIpServer(String ipServer) {
        labelIpServer.setText("El servidor se encuentra en " + ipServer);
    }

    public void openPanelLobby() {
        client.setNameClienteSesion(inputNombre.getText());
        LobbyPanel LobbyPanel = new LobbyPanel(this.indexFrame);
        this.setVisible(false);
        this.indexFrame.add(LobbyPanel);
        
    }
}
