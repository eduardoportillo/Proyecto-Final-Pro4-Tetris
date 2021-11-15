package waitingroomUI;

import javax.swing.JFrame;

public class WaitingRoomFrame extends JFrame {

    private PanelEnviarMensaje panelEnviar;
    private PanelMensajes panelMensajes;

    PanelChat PanelChat;

    public WaitingRoomFrame() {
        this.setVisible(true);
        this.setBounds(0, 0, 575, 610);
        this.setTitle("Client");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelEnviar = new PanelEnviarMensaje();
        this.add(panelEnviar);

        PanelChat = new PanelChat();
        this.add(PanelChat);
        this.repaint();
    }
}
