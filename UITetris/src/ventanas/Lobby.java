package ventanas;

public class Lobby extends javax.swing.JFrame {
    
    
    public Lobby() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LobbyPanle = new javax.swing.JPanel();
        btnWaitingRoom1 = new ventanas.BtnWaitingRoom();
        createWR = new javax.swing.JButton();
        fondoLobby = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        LobbyPanle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LobbyPanle.add(btnWaitingRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jScrollPane1.setViewportView(LobbyPanle);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 400));

        createWR.setBackground(new java.awt.Color(153, 0, 153));
        createWR.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 24)); // NOI18N
        createWR.setForeground(new java.awt.Color(255, 255, 255));
        createWR.setText("Crear Sala De Espera");
        createWR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createWRActionPerformed(evt);
            }
        });
        getContentPane().add(createWR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 40));

        fondoLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoLobby.jpg"))); // NOI18N
        getContentPane().add(fondoLobby, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 490, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createWRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createWRActionPerformed
        
    }//GEN-LAST:event_createWRActionPerformed
    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LobbyPanle;
    private ventanas.BtnWaitingRoom btnWaitingRoom1;
    private javax.swing.JButton createWR;
    private javax.swing.JLabel fondoLobby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
