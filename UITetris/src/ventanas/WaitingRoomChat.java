package ventanas;

import chat.Mensaje;
import java.io.File;
import java.nio.file.Files;
import java.util.Base64;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import listas.ListaMensajes;
import org.json.JSONObject;
import socketclient.SocketSession;

public class WaitingRoomChat extends javax.swing.JFrame {
    JSONObject jsonSendMensaje;
    
    public WaitingRoomChat() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PanelMensajes = new javax.swing.JPanel();
        PanelSessions = new javax.swing.JPanel();
        JLChat = new javax.swing.JLabel();
        JLJugadores = new javax.swing.JLabel();
        sendMensajePanel = new javax.swing.JPanel();
        TFMensaje = new javax.swing.JTextField();
        enviarMensaje = new javax.swing.JButton();
        enviarImagen = new javax.swing.JButton();
        jugadorListo = new javax.swing.JCheckBox();
        mensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sala De Espera");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PanelMensajes.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout PanelMensajesLayout = new javax.swing.GroupLayout(PanelMensajes);
        PanelMensajes.setLayout(PanelMensajesLayout);
        PanelMensajesLayout.setHorizontalGroup(
            PanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        PanelMensajesLayout.setVerticalGroup(
            PanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PanelMensajes);

        PanelSessions.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout PanelSessionsLayout = new javax.swing.GroupLayout(PanelSessions);
        PanelSessions.setLayout(PanelSessionsLayout);
        PanelSessionsLayout.setHorizontalGroup(
            PanelSessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        PanelSessionsLayout.setVerticalGroup(
            PanelSessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        JLChat.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        JLChat.setText("Chat:");

        JLJugadores.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        JLJugadores.setText("Jugadores:");

        sendMensajePanel.setBackground(new java.awt.Color(255, 255, 0));

        TFMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMensajeActionPerformed(evt);
            }
        });
        TFMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFMensajeKeyPressed(evt);
            }
        });

        enviarMensaje.setText("Enviar");
        enviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarMensajeActionPerformed(evt);
            }
        });

        enviarImagen.setText("Enviar Imagen");
        enviarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarImagenActionPerformed(evt);
            }
        });

        jugadorListo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jugadorListo.setText("Listo Para Comenzar Partida.");
        jugadorListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadorListoActionPerformed(evt);
            }
        });

        mensajeError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout sendMensajePanelLayout = new javax.swing.GroupLayout(sendMensajePanel);
        sendMensajePanel.setLayout(sendMensajePanelLayout);
        sendMensajePanelLayout.setHorizontalGroup(
            sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMensajePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sendMensajePanelLayout.createSequentialGroup()
                        .addComponent(enviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enviarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jugadorListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        sendMensajePanelLayout.setVerticalGroup(
            sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMensajePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(sendMensajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadorListo)
                    .addComponent(mensajeError))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(JLChat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(sendMensajePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLChat, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelSessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMensajePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFMensajeActionPerformed

    private void enviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarMensajeActionPerformed
        jsonSendMensaje = new JSONObject();
        
        if (TFMensaje.getText().isEmpty()) {
            mensajeError.setText("El Mensaje no tiene ningun contenido, Por Favor Escriba Uno!!!");
        } else {
            System.out.println("Mensaje Enviado Con BTN Enviar");
            String mensaje = TFMensaje.getText();
            Mensaje msn = new Mensaje(mensaje);
            ListaMensajes.setMensaje(msn);
            SocketSession.getInstance("mesaje").sendObject(msn);
            TFMensaje.setText("");
            TFMensaje.requestFocus();
            mensajeError.setText("");
        }

    }//GEN-LAST:event_enviarMensajeActionPerformed

    private void TFMensajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFMensajeKeyPressed

        jsonSendMensaje = new JSONObject();
        
        if (TFMensaje.getText().isEmpty()) {
            mensajeError.setText("El Mensaje no tiene ningun contenido, Por Favor Escriba Uno!!!");

        } else {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                System.out.println("Mensaje Enviado Con Enter");
                String mensaje = TFMensaje.getText();
                Mensaje msn = new Mensaje(mensaje);
                ListaMensajes.setMensaje(msn);
                SocketSession.getInstance("mesaje").sendObject(msn);
                TFMensaje.setText("");
                TFMensaje.requestFocus();
                mensajeError.setText("");
            }
        }


    }//GEN-LAST:event_TFMensajeKeyPressed

    private void enviarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileFilter(filter);
        int seleccion = fileChooser.showOpenDialog(sendMensajePanel);

        File abreimg = fileChooser.getSelectedFile();
        try {
            byte[] filecont = Files.readAllBytes(abreimg.toPath());
            String b64 = Base64.getEncoder().encodeToString(filecont);
            Mensaje msn = new Mensaje("@", b64);
            ListaMensajes.setMensaje(msn);
            SocketSession.getInstance("mesaje").sendObject(msn);
        } catch (Exception Exception) {
            System.out.println(Exception);
        }
    }//GEN-LAST:event_enviarImagenActionPerformed

    private void jugadorListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadorListoActionPerformed

        if (jugadorListo.isSelected() == true) {
            System.out.println("Este Jugador esta listo");
        } else {
            System.out.println("Este Jugador NO esta listo");
        }
    }//GEN-LAST:event_jugadorListoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WaitingRoomChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaitingRoomChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaitingRoomChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaitingRoomChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaitingRoomChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLChat;
    private javax.swing.JLabel JLJugadores;
    private javax.swing.JPanel PanelMensajes;
    private javax.swing.JPanel PanelSessions;
    private javax.swing.JTextField TFMensaje;
    private javax.swing.JButton enviarImagen;
    private javax.swing.JButton enviarMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jugadorListo;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JPanel sendMensajePanel;
    // End of variables declaration//GEN-END:variables
}
