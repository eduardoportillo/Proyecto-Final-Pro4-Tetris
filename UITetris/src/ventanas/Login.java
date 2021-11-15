package ventanas;

import socketclient.Client;

public class Login extends javax.swing.JFrame {
    
    Client client = null;
    
    public Login() {
        initComponents();
        this.setSize(360, 490);
        this.setLocationRelativeTo(null);
        client = new Client();
        intLabelIpServer(client.getServerIp());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgAvatar = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelIpServer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 51, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setName("LoginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(340, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Avatars.png"))); // NOI18N
        getContentPane().add(imgAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 170, -1));

        login.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 36)); // NOI18N
        login.setForeground(new java.awt.Color(153, 0, 153));
        login.setText("Login");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 70));

        nombreTF.setName("nombreTF"); // NOI18N
        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 160, 30));

        nombre.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 24)); // NOI18N
        nombre.setText("Nombre:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 30));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 100, 40));

        labelIpServer.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 16)); // NOI18N
        labelIpServer.setForeground(new java.awt.Color(255, 255, 255));
        labelIpServer.setToolTipText("");
        getContentPane().add(labelIpServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondologin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed

    }//GEN-LAST:event_nombreTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        client.setNameClienteSesion(nombreTF.getText());
        Lobby lobby = new Lobby();
        lobby.setVisible(true);
        
//        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void intLabelIpServer(String ipServer) {
        labelIpServer.setText("El servidor se encuentra en el Host: " + ipServer);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgAvatar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelIpServer;
    private javax.swing.JLabel login;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTF;
    // End of variables declaration//GEN-END:variables
}
