/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import Controllers.BillController;
import Controllers.MainController;
import Controllers.PurchaseController;
import Models.Bill;
import Models.MeetingPurchase;
import Models.PersonalPurchase;
import Models.PurchaseLine;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author federicoponcedeleon
 */
public class PurchaseInformationInterface extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseInformationInterface
     */
    public PurchaseInformationInterface() {
        initComponents();
    }
    
    private MeetingPurchase meeting;
    private PersonalPurchase personal;
    
    public void setPersonal(PersonalPurchase personal) {
        this.personal = personal;
        this.meeting = null;
    }

    public void setMeeting(MeetingPurchase meeting) {
        this.meeting = meeting;
        this.personal = null;
    }
    
    public void showPurchase(boolean meeting) {
        PurchaseController pc = PurchaseController.instance();
        BillController billc = BillController.instance();
        
        ArrayList<PurchaseLine> list;
        if (meeting) {
            if (pc.getMeetingPurchase(this.meeting.getMeetingId()) == null) { //is not paid yet
                jButtonPay.setVisible(true);
                jButtonAdd.setVisible(true);
                jButtonRemove.setVisible(true);
                jButtonDeletePurchase.setVisible(true);
            }
            else {
                jButtonPay.setVisible(false);
                jButtonAdd.setVisible(false);
                jButtonRemove.setVisible(false);
                jButtonDeletePurchase.setVisible(false);
            }
            jLabelDescription.setText(this.meeting.getDescription());
            MeetingPurchase purchase = pc.getMeetingPurchase(this.meeting.getIdCompra());
            if (purchase == null) {
                jLabelShowMessage.setText("No se pudieron obtener las lineas de compra");
                jLabelShowMessage.setForeground(Color.red);
                return;
            }
            list = pc.getAllLines(purchase.getIdCompra());
            
        }
        else {
            if (pc.getPersonalPurchase(this.personal.getIdCompra()) == null) { //is not paid yet
                jButtonPay.setVisible(true);
                jButtonAdd.setVisible(true);
                jButtonRemove.setVisible(true);
                jButtonDeletePurchase.setVisible(true);
            }
            else {
                jButtonPay.setVisible(false);
                jButtonAdd.setVisible(false);
                jButtonRemove.setVisible(false);
                jButtonDeletePurchase.setVisible(false);
            }
            jLabelDescription.setText(this.personal.getDescription());
            PersonalPurchase purchase = pc.getPersonalPurchase(this.personal.getIdCompra());
            if (purchase == null) {
                jLabelShowMessage.setText("No se pudieron obtener las lineas de compra");
                jLabelShowMessage.setForeground(Color.red);
                return;
            }
            list = pc.getAllLines(purchase.getIdCompra());
        }
        int i = 0;
            
            for (PurchaseLine line : list) {
                jTableShow.setValueAt(line.getProductName(), i, 0);
                jTableShow.setValueAt(line.getQuantity(), i, 1);
                i++;
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableShow = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonAccept = new javax.swing.JButton();
        jButtonDeletePurchase = new javax.swing.JButton();
        jButtonPay = new javax.swing.JButton();
        jLabelShowMessage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 90, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/description-icon.png"))); // NOI18N
        jLabel2.setToolTipText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 90, 70));

        jTableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ));
        jTableShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableShow);
        if (jTableShow.getColumnModel().getColumnCount() > 0) {
            jTableShow.getColumnModel().getColumn(0).setResizable(false);
            jTableShow.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 210));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N
        jLabel12.setToolTipText("Inicio");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -10, 160, 90));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -10, 90, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelDescription.setText("Descripcion");
        jLabelDescription.setToolTipText("Descripcion");
        getContentPane().add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 25));

        jButtonAdd.setText("+");
        jButtonAdd.setToolTipText("Agregar");
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 40, 30));

        jButtonRemove.setText("-");
        jButtonRemove.setToolTipText("Quitar");
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 40, 30));

        jButtonAccept.setText("Aceptar");
        jButtonAccept.setToolTipText("Aceptar");
        getContentPane().add(jButtonAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 80, -1));

        jButtonDeletePurchase.setText("Eliminar");
        jButtonDeletePurchase.setToolTipText("Eliminar compra");
        getContentPane().add(jButtonDeletePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 80, -1));

        jButtonPay.setText("Pagar");
        jButtonPay.setToolTipText("Pagar compra");
        jButtonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, 30));

        jLabelShowMessage.setText("Esto se cambia");
        getContentPane().add(jLabelShowMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MainController main = MainController.instance();
        main.getMenu().setVisible(true);
        main.getMenu().setPreviousInterface(this);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        MainController main = MainController.instance();
        main.getHome().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTableShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowMouseClicked
        
    }//GEN-LAST:event_jTableShowMouseClicked

    private void jButtonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayActionPerformed
        PayConfirmation pay = new PayConfirmation();
        pay.setVisible(true);
        if (this.personal != null) {
            pay.setPersonalPurchase(this.personal);
        }
        else {
            pay.setMeetingPurchase(this.meeting);
        }
    }//GEN-LAST:event_jButtonPayActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseInformationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseInformationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseInformationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseInformationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseInformationInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDeletePurchase;
    private javax.swing.JButton jButtonPay;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelShowMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableShow;
    // End of variables declaration//GEN-END:variables
}
