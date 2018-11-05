/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JLabel;
/**
 *
 * @author federicoponcedeleon
 */
public class HomeInterface extends javax.swing.JFrame {

    MenuInterface menu;
    /**
     * Creates new form HomeInterface
     */
    public HomeInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
        menu = new MenuInterface();
        menu.setVisible(false);
        menu.setLocationRelativeTo(this);
    }
        
    public void setColor(JLabel label){
        label.setBackground(new Color(204,204,204));
    }
    
    public void resetColor(JLabel label){
        label.setBackground(Color.white);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        popupMenu4 = new java.awt.PopupMenu();
        menuBar5 = new java.awt.MenuBar();
        menu9 = new java.awt.Menu();
        menu10 = new java.awt.Menu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        menuBar6 = new java.awt.MenuBar();
        menu11 = new java.awt.Menu();
        menu12 = new java.awt.Menu();
        popupMenu5 = new java.awt.PopupMenu();
        popupMenu6 = new java.awt.PopupMenu();
        popupMenu7 = new java.awt.PopupMenu();
        popupMenu8 = new java.awt.PopupMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        menuIcon = new javax.swing.JLabel();
        agregarGasto = new javax.swing.JLabel();
        agregarReunion = new javax.swing.JLabel();
        agregarCompra = new javax.swing.JLabel();
        agregarCompra1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        popupMenu1.setLabel("popupMenu1");

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        popupMenu4.setLabel("popupMenu4");

        menu9.setLabel("File");
        menuBar5.add(menu9);

        menu10.setLabel("Edit");
        menuBar5.add(menu10);

        jMenuItem2.setText("jMenuItem2");

        jMenu7.setText("jMenu7");

        menu11.setLabel("File");
        menuBar6.add(menu11);

        menu12.setLabel("Edit");
        menuBar6.add(menu12);

        popupMenu5.setLabel("popupMenu5");

        popupMenu6.setLabel("popupMenu6");

        popupMenu7.setLabel("popupMenu7");

        popupMenu8.setLabel("popupMenu8");

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenuItem3.setText("jMenuItem3");

        jMenu10.setText("jMenu10");

        jMenu11.setText("File");
        jMenuBar4.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar4.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar5.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar5.add(jMenu14);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-icon.png"))); // NOI18N
        menuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIconMouseClicked(evt);
            }
        });
        getContentPane().add(menuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -30, 100, 120));

        agregarGasto.setBackground(new java.awt.Color(51, 51, 51));
        agregarGasto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agregarGasto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregarGasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill-icon.png"))); // NOI18N
        agregarGasto.setText("Agregar gasto");
        agregarGasto.setToolTipText("");
        agregarGasto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(243, 238, 238), java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        agregarGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarGastoMouseEntered(evt);
            }
        });
        getContentPane().add(agregarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 80));

        agregarReunion.setBackground(new java.awt.Color(204, 204, 204));
        agregarReunion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agregarReunion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregarReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meeting-icon.png"))); // NOI18N
        agregarReunion.setText("Agregar reunion");
        agregarReunion.setToolTipText("");
        agregarReunion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(243, 238, 238), java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        agregarReunion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarReunionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarReunionMouseExited(evt);
            }
        });
        getContentPane().add(agregarReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 80));

        agregarCompra.setBackground(new java.awt.Color(51, 51, 51));
        agregarCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agregarCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/look-up-icon.png"))); // NOI18N
        agregarCompra.setText("<html> \n<p> Cuentas por</p>\t\n<p> pagar</p>\t\n</html>");
        agregarCompra.setToolTipText("");
        agregarCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(243, 238, 238), java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        getContentPane().add(agregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 80));

        agregarCompra1.setBackground(new java.awt.Color(51, 51, 51));
        agregarCompra1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agregarCompra1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregarCompra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/purchase-icon.png"))); // NOI18N
        agregarCompra1.setText("Agregar compra");
        agregarCompra1.setToolTipText("");
        agregarCompra1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(243, 238, 238), java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        getContentPane().add(agregarCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 270, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 160, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 320, 450));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 320, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIconMouseClicked
        menu.setVisible(true);
    }//GEN-LAST:event_menuIconMouseClicked

    private void agregarReunionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarReunionMouseEntered
        setColor(agregarReunion);
    }//GEN-LAST:event_agregarReunionMouseEntered

    private void agregarReunionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarReunionMouseExited
        resetColor(agregarReunion);
    }//GEN-LAST:event_agregarReunionMouseExited

    private void agregarGastoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarGastoMouseEntered
        setColor(agregarGasto);
    }//GEN-LAST:event_agregarGastoMouseEntered
    private void agregarGastoMouseExited(java.awt.event.MouseEvent evt) {                                           
        resetColor(agregarGasto);
    }  
    private void agregarCompraMouseEntered(java.awt.event.MouseEvent evt) {                                          
        setColor(agregarCompra);
    }                                         
    private void agregarCompraMouseExited(java.awt.event.MouseEvent evt) {                                           
        resetColor(agregarCompra);
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
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarCompra;
    private javax.swing.JLabel agregarCompra1;
    private javax.swing.JLabel agregarGasto;
    private javax.swing.JLabel agregarReunion;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private java.awt.Menu menu1;
    private java.awt.Menu menu10;
    private java.awt.Menu menu11;
    private java.awt.Menu menu12;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.Menu menu9;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    private java.awt.MenuBar menuBar5;
    private java.awt.MenuBar menuBar6;
    private javax.swing.JLabel menuIcon;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    private java.awt.PopupMenu popupMenu4;
    private java.awt.PopupMenu popupMenu5;
    private java.awt.PopupMenu popupMenu6;
    private java.awt.PopupMenu popupMenu7;
    private java.awt.PopupMenu popupMenu8;
    // End of variables declaration//GEN-END:variables
}
