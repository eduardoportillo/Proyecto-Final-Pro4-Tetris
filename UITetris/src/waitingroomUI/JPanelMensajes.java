package waitingroomUI;

import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import listas.ListaMensajes;
import chat.Mensaje;
import socketclient.SocketSession;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class JPanelMensajes extends JPanel implements PropertyChangeListener {
    
    JList listaMensajeRecibido;
    
    ArrayList<Mensaje> mensaje = ListaMensajes.getListasessiones();
    
    int heightScroll = 0;
    private PanelChat panelchat;
    
    public JPanelMensajes(PanelChat panelchat) {
        this.panelchat = panelchat;
//        mensaje.addObserver(this);
//        SocketSession.getInstance().addObserver(this); // [ ] ver si no da problema si retorna una instancia directo
        initPanelParticipantes();
        mensajeLabel();
    }
    
    private void initPanelParticipantes() {
        this.setBounds(0, 0, 200, heightScroll);
        this.setLayout(null);
        this.repaint();
        this.validate();
        this.setBackground(new Color(253, 250, 246));
        this.setVisible(true);
        this.repaint();
        
    }
    
    private void mensajeLabel() {
        int tHeight = 30;
        int heightTotal = 0;
        this.removeAll();
        
        for (int i = 0; i < ListaMensajes.getListasessiones().size(); i++) {
            Mensaje msn = ListaMensajes.getListasessiones().get(i);
            if (msn.getImagen() != null) {
                try {
                    byte[] btoData = Base64.getDecoder().decode(msn.getImagen());
                    ByteArrayInputStream input = new ByteArrayInputStream(btoData);
                    BufferedImage img = ImageIO.read(input);
                    ImageIcon icon = new ImageIcon(img);
                    JLabel mensaje = new JLabel();
                    mensaje.setIcon(icon);
                    mensaje.setBounds(10, heightTotal, 200, 200);
                    heightTotal += 200;
                    mensaje.setVisible(true);
                    this.add(mensaje);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            } else {
                JLabel mensaje = new JLabel(msn.getMensaje());
                mensaje.setBounds(10, heightTotal, 200, tHeight);
                heightTotal += tHeight;
                mensaje.setVisible(true);
                this.add(mensaje);
            }
            
            heightTotal += 20;
            
        }
        heightScroll = heightTotal;
        
    }
    
    public int getScrollHeight() {
        return heightScroll;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        mensajeLabel();
        this.panelchat.resize();
    }
}
