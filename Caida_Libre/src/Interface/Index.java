package Interface;

import Animacion.Animacion;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bola_papel = new javax.swing.JLabel();
        Button_mover = new Button_TexField.Button();
        Jtex_seg = new Button_TexField.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 230, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bola_papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/bola_papel-2.png"))); // NOI18N
        jPanel1.add(bola_papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 50, 50));

        Button_mover.setText("Pulse");
        Button_mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_moverActionPerformed(evt);
            }
        });
        jPanel1.add(Button_mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 150, -1));
        jPanel1.add(Jtex_seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_moverActionPerformed
        Animacion.bajar(0, 210, Integer.parseInt(Jtex_seg.getText()), 1, bola_papel);
    }//GEN-LAST:event_Button_moverActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_TexField.Button Button_mover;
    private Button_TexField.TextField Jtex_seg;
    private javax.swing.JLabel bola_papel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
