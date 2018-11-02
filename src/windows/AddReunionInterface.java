/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import Controllers.FriendController;
import Controllers.MainController;
import Controllers.MeetingController;
import Controllers.UserController;
import javax.swing.JComboBox;
import Models.Friends;
import Models.User;
import java.util.ArrayList;
import projectbd.DBConnection;

/**
 *
 * @author federicoponcedeleon
 */
public class AddReunionInterface extends javax.swing.JFrame {

    private ArrayList<Friends> listOfFriends;
    private ArrayList<String> selectedFriends;
    /**
     * Creates new form AddReunionInterface
     */
    public AddReunionInterface() {
        initComponents();
        listAmigos.setListData(getFriendsList());
        listOfFriends = new ArrayList<>();
        selectedFriends = new ArrayList<>();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup3 = new javax.swing.ButtonGroup();
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        list2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtPlace = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAmigos = new javax.swing.JList<>();
        txtTime = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInvite = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        listSelectedFriends = new java.awt.List();
        date = new com.toedter.calendar.JDateChooser();
        txtError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        popupMenu1.setLabel("popupMenu1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(288, 520));
        setMinimumSize(new java.awt.Dimension(288, 520));
        setPreferredSize(new java.awt.Dimension(288, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(288, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlace.setToolTipText("");
        txtPlace.setName("txtLugar"); // NOI18N
        getContentPane().add(txtPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 25));

        txtDescription.setToolTipText("Descripción");
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 25));

        btnAccept.setText("Agregar");
        btnAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 60, 25));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map-icon.png"))); // NOI18N
        jLabel8.setToolTipText("Lugar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 70, 70));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-icon.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, 120, 160));

        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 60, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people-icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 150, 130, 190));

        listAmigos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listAmigos.setToolTipText("Invitados");
        listAmigos.setMaximumSize(new java.awt.Dimension(158, 75));
        listAmigos.setMinimumSize(new java.awt.Dimension(158, 75));
        listAmigos.setName("listAmigos"); // NOI18N
        listAmigos.setPreferredSize(new java.awt.Dimension(158, 75));
        jScrollPane1.setViewportView(listAmigos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, 50));

        try {
            txtTime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTime.setText("00:00");
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 60, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/description-icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock-icon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 180));

        btnInvite.setText("Invitar");
        btnInvite.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInviteActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvite, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 60, 25));

        jButtonRemove.setText("Eliminar");
        jButtonRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 60, 25));

        listSelectedFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSelectedFriendsActionPerformed(evt);
            }
        });
        getContentPane().add(listSelectedFriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 90));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 25));

        txtError.setForeground(new java.awt.Color(255, 0, 7));
        txtError.setText("cambiar");
        getContentPane().add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -20, 90, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 530));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map-icon.png"))); // NOI18N
        jLabel10.setToolTipText("Lugar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        //String date = jDate.getText(),
               //description = jTextDescription.getText(),
               //place = jTextPlace.getText();
        //User org = (User) jComboBoxOrganizer.getSelectedItem();
       
        
        //MeetingController mc = MeetingController.addMeeting(place, description, date, user);
        //MainController main = MainController.instance();
       //if (error) {
         //  main.showMessage("Ocurrio un error al crear la reunion");
       //}
       
    }//GEN-LAST:event_btnAcceptActionPerformed

    
    private String[] getFriendsList(){
        MainController mainC = MainController.instance();
        User loggedUser = mainC.getCurrentUser();
        this.listOfFriends = FriendController.getInstanceFriend().getFriends(loggedUser.getUserName());
        String[] output = new String[listOfFriends.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = listOfFriends.get(i).getUserId2();
        }
        return output;
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInviteActionPerformed
        String selectedFriend = listAmigos.getSelectedValue();
        selectedFriends.add(selectedFriend);
    }//GEN-LAST:event_btnInviteActionPerformed

    
    
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(AddReunionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReunionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReunionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReunionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReunionInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInvite;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.util.List list1;
    private java.util.List list2;
    private javax.swing.JList<String> listAmigos;
    private java.awt.List listSelectedFriends;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JFormattedTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
