/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import Controllers.LoginController;
import Controllers.MainController;
import Models.User;
import java.awt.Color;

/**
 *
 * @author federicoponcedeleon
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtError.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUserPass = new javax.swing.JPasswordField();
        txtRepeatPass = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 60, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/person-icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 70, 100, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-icon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 230, 110, 110));

        txtUserId.setToolTipText("Usuario");
        getContentPane().add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 210, 25));

        txtAddress.setToolTipText("Dirección");
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 210, 25));

        txtMail.setToolTipText("Correo electrónico");
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 210, 25));

        txtName.setToolTipText("Nombre");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 210, 25));

        txtUserPass.setText("jPasswordField1");
        txtUserPass.setToolTipText("Contraseña");
        getContentPane().add(txtUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, 25));

        txtRepeatPass.setText("jPasswordField2");
        txtRepeatPass.setToolTipText("Repetir contraseña");
        getContentPane().add(txtRepeatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 210, 25));

        btnRegister.setText("Registrar");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 70, 25));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arroba-icon.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 320, 90, 70));

        txtError.setForeground(new java.awt.Color(255, 0, 0));
        txtError.setText("cambiar");
        getContentPane().add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-icon.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-icon.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/name.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 130, 90, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 160, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 430));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrarse");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -20, 90, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        LoginInterface login = new LoginInterface();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName.getText(),
               userName = txtUserId.getText(),
               mail = txtMail.getText(),
               address = txtAddress.getText(),
               firstPass = txtUserPass.getText(),
               secondPass = txtRepeatPass.getText();
        if (!firstPass.equals(secondPass)) {
            txtError.setText("Las contraseñas no coinciden");
            txtError.setForeground(Color.red);
        }
        else {
            LoginController lc = LoginController.instance();
            
            User newUser = lc.registerUser(userName, firstPass, name, address, mail);
            if (newUser != null) {
                MainController mc = MainController.instance();
                mc.setCurrentUser(newUser);
                HomeInterface hf = new HomeInterface();
                hf.setVisible(true);
                this.setVisible(false);
                dispose();
            } 
            else {
                txtError.setText("No se ha logrado registrar");
                txtError.setForeground(Color.red);
            }
        }
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtRepeatPass;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JPasswordField txtUserPass;
    // End of variables declaration//GEN-END:variables
}
