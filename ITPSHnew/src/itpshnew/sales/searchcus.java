/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.sales;



/**
 *
 * @author Thareendra
 */
public class searchcus extends javax.swing.JFrame {

    /**
     * Creates new form searchcus
     */
    public searchcus() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchcus_gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        save_btn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        cancel_btn1 = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        close_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 237, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save_btn.setBackground(new java.awt.Color(48, 214, 48));
        save_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Save_40px.png"))); // NOI18N
        save_btn.setText("  Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel1.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 170, 45));

        jPanel8.setBackground(new java.awt.Color(100, 199, 150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Customer Id");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));
        jPanel8.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 260, 25));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("First Name");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Last Name");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Phone Number 1");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Phone Number 2");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Gender");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Address");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("City");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Loyalty leevl");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Loyalty Discount");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, 30));
        jPanel8.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 25));
        jPanel8.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 260, 25));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, 25));
        jPanel8.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 260, 25));

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 260, 25));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 260, 25));
        jPanel8.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 260, 25));

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 260, 25));

        jRadioButton3.setBackground(new java.awt.Color(100, 199, 150));
        searchcus_gender.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Male");
        jPanel8.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(100, 199, 150));
        searchcus_gender.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("Female");
        jPanel8.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 550));

        cancel_btn1.setBackground(new java.awt.Color(48, 214, 48));
        cancel_btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Edit_30px.png"))); // NOI18N
        cancel_btn1.setText("  Edit");
        cancel_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 170, 45));

        cancel_btn.setBackground(new java.awt.Color(48, 214, 48));
        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cancel_Subscription_30px.png"))); // NOI18N
        cancel_btn.setText("  Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 170, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 650));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Close_Window_50px.png"))); // NOI18N
        close_lbl.setText("        ");
        close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lblMouseClicked(evt);
            }
        });
        jPanel3.add(close_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Search customer");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        this.dispose();//close only current window
    }//GEN-LAST:event_save_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void close_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblMouseClicked
        dispose();//close only current window
    }//GEN-LAST:event_close_lblMouseClicked

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void cancel_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_btn1ActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(searchcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchcus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton cancel_btn1;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JButton save_btn;
    private javax.swing.ButtonGroup searchcus_gender;
    // End of variables declaration//GEN-END:variables
}
