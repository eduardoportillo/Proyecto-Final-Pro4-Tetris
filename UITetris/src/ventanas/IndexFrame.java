/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import tetris.Tetris;

public class IndexFrame extends javax.swing.JFrame {

    public IndexFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiPlayer = new javax.swing.JLabel();
        singelPlayer = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        multiPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Multiplayer.png"))); // NOI18N
        multiPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiPlayerMouseClicked(evt);
            }
        });
        getContentPane().add(multiPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, 130));

        singelPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Singel Player.png"))); // NOI18N
        singelPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singelPlayerMouseClicked(evt);
            }
        });
        getContentPane().add(singelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo tetris.png"))); // NOI18N
        logo.setText("LogoTetris");
        logo.setName("Logo Tetris"); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singelPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singelPlayerMouseClicked
        FrameTetris tetris = new FrameTetris("");
        tetris.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_singelPlayerMouseClicked

    private void multiPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiPlayerMouseClicked
        Login login = new Login();
        login.setVisible(true);
        Tetris.multiplayer = true;
        this.dispose();
    }//GEN-LAST:event_multiPlayerMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel multiPlayer;
    private javax.swing.JLabel singelPlayer;
    // End of variables declaration//GEN-END:variables
}
