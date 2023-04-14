/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customertables;


import config.dbconnector;
import dashinternal.reservepage;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import restoframes.dashboard;

/**
 *
 * @author ellan
 */
public class reserveInfo extends javax.swing.JFrame {

    /**
     * Creates new form customerinfo
     */
    public reserveInfo() {
        initComponents();
    }
    
    public void close(){
        this.dispose();
        dashboard dash = new dashboard();
        dash.setVisible(true);
        reservepage cp = new reservepage();
        dash.dashboardpane.add(cp).setVisible(true);
   }
    
        Color enter  = new Color(136,8,8);
        Color exit = new Color(74,4,4);
        Color plate = new Color(100,4,4);
        
         int validateregister(){
            int result;
            if(reserveid.getText().isEmpty() || userid.getText().isEmpty() || customerid.getText().isEmpty() || contact.getText().isEmpty() || bookstatus.getSelectedItem().equals(null) || userstatus.getSelectedItem().equals(null)){
                JOptionPane.showMessageDialog(null, "Required Inputs!");
                result = 0;
                }else{
                    result = 1;
                    }
                    return result;
            }
        
        public String action;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        bookstatus = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        done = new javax.swing.JLabel();
        reserveid = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        userstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(100, 4, 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(74, 4, 4));
        minimize.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("—");
        minimize.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 30));

        close.setBackground(new java.awt.Color(74, 4, 4));
        close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        close.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 30));

        customerid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        customerid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4)));
        customerid.setEnabled(false);
        jPanel1.add(customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 310, 30));

        bookstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bookstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Onhold", "Cancelled" }));
        jPanel1.add(bookstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 310, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Contact");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Customer ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Customer Info");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 30));

        confirm.setBackground(new java.awt.Color(74, 4, 4));
        confirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        done.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        done.setForeground(new java.awt.Color(240, 240, 240));
        done.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        done.setText("Azzaz");
        confirm.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 20));

        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 120, 40));

        reserveid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        reserveid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4)));
        reserveid.setEnabled(false);
        jPanel1.add(reserveid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 310, 30));

        userid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4)));
        userid.setEnabled(false);
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 310, 30));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("User ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("User status");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Reservation ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        contact.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4), new java.awt.Color(74, 4, 4)));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 310, 30));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Status");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        userstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        userstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", "Inactive" }));
        jPanel1.add(userstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 310, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(enter);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(exit);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        close();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(enter);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(exit);
    }//GEN-LAST:event_closeMouseExited

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
       if(action.equals("Add")){
           
          
            dbconnector dbc = new dbconnector();
           int result = dbc.insertdata("INSERT INTO tbl_reserve(res_id, user_id, cus_id, res_contact, res_status, res_userstatus) "
                   + "VALUES ('"+reserveid.getText()+"', '"+userid.getText()+"', '"+customerid.getText()+"', '"+contact.getText()+"',"
                           + " '"+bookstatus.getSelectedItem()+"', '"+userstatus.getSelectedItem()+"' )");
           if(result==1){
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
               close();
           }else{
                    JOptionPane.showMessageDialog(null, "Successfully Failed!");
                }
            
    
           
       }else if(action.equals("Edit")){
           dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_reserve SET res_id = '"+reserveid.getText()+"'"
                    + ", user_id = '"+userid.getText()+"', cus_id = '"+customerid.getText()+"'"
                            + ", res_contact = '"+bookstatus.getSelectedItem()+"', res_userstatus = '"+userstatus.getSelectedItem()+"' "
                                    + "WHERE cus_id = '"+reserveid.getText()+"'   ");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "No Actions Performed!");
                close();
       }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(enter);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(exit);
    }//GEN-LAST:event_confirmMouseExited

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
            java.util.logging.Logger.getLogger(reserveInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserveInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserveInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserveInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserveInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> bookstatus;
    private javax.swing.JPanel close;
    public javax.swing.JPanel confirm;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField customerid;
    public javax.swing.JLabel done;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel minimize;
    public javax.swing.JTextField reserveid;
    public javax.swing.JTextField userid;
    public javax.swing.JComboBox<String> userstatus;
    // End of variables declaration//GEN-END:variables
}
