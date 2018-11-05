/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

/**
 *
 * @author federicoponcedeleon
 */
public class MessageContainer extends javax.swing.JFrame {

    /**
     * Creates new form MessageContainer
     */
    public MessageContainer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDeadLine = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelDescriptionIcon = new javax.swing.JLabel();
        jLabelDateIcon = new javax.swing.JLabel();
        jLabelAmountIcon = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(240, 280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeadLine.setText("4/11/2018");
        jLabelDeadLine.setToolTipText("Fecha");
        getContentPane().add(jLabelDeadLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, 40));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Bestellen informa");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alert-icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 250, 60));

        jLabelDescription.setText("Vence UTE");
        getContentPane().add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, 40));

        jLabelDescriptionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/description-icon.png"))); // NOI18N
        getContentPane().add(jLabelDescriptionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 90, 50));

        jLabelDateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-icon.png"))); // NOI18N
        jLabelDateIcon.setToolTipText("Fecha");
        getContentPane().add(jLabelDateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 90, 120, 70));

        jLabelAmountIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill.png"))); // NOI18N
        jLabelAmountIcon.setToolTipText("Monto");
        getContentPane().add(jLabelAmountIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 60));

        jLabelAmount.setText("1200");
        jLabelAmount.setToolTipText("Monto");
        getContentPane().add(jLabelAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 20));

        jButtonOk.setText("Aceptar");
        getContentPane().add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MessageContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageContainer().setVisible(true);
            }
        });
    }
    
    public void setMessage(String message) {
        jLabelDescription.setText(message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelAmountIcon;
    private javax.swing.JLabel jLabelDateIcon;
    private javax.swing.JLabel jLabelDeadLine;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelDescriptionIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
