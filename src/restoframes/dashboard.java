/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoframes;

import dashinternal.accountpage;
import dashinternal.customerpage;
import dashinternal.dashboardpage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }
    
        Color enter  = new Color(136,8,8);
        Color exit = new Color(74,4,4);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        account = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dashboardpane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(100, 4, 4));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account.setBackground(new java.awt.Color(74, 4, 4));
        account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account");
        account.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 90, 40));

        dashboard.setBackground(new java.awt.Color(74, 4, 4));
        dashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        report.setBackground(new java.awt.Color(74, 4, 4));
        report.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Report");
        report.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        nav.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 90, 40));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 440));

        header.setBackground(new java.awt.Color(136, 8, 8));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(136, 8, 8));
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

        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 29));

        close.setBackground(new java.awt.Color(136, 8, 8));
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

        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 29));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 750, 30));

        dashboardpane.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout dashboardpaneLayout = new javax.swing.GroupLayout(dashboardpane);
        dashboardpane.setLayout(dashboardpaneLayout);
        dashboardpaneLayout.setHorizontalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        dashboardpaneLayout.setVerticalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 750, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(enter);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(exit);
    }//GEN-LAST:event_dashboardMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(enter);
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(exit);
    }//GEN-LAST:event_reportMouseExited

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(enter);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
       account.setBackground(exit);
    }//GEN-LAST:event_accountMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        dashboardpage db = new dashboardpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        customerpage cus = new customerpage();
        dashboardpane.add(cus).setVisible(true);
    }//GEN-LAST:event_reportMouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        accountpage db = new accountpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_accountMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
         int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if(x== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(exit);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(enter);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(exit);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(enter);
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JPanel close;
    private javax.swing.JPanel dashboard;
    public javax.swing.JDesktopPane dashboardpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel minimize;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel report;
    // End of variables declaration//GEN-END:variables
}