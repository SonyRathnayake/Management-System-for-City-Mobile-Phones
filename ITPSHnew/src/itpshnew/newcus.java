/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import sales_package.customer_class;
import sales_package.dbconnect;

/**
 *
 * @author Thareendra
 */
public class newcus extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;

    
    
    public newcus() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        
        con = dbconnect.connect();
        customer_class c1 = new customer_class();         //set cus id
        cusid_box.setText(c1.cus_num());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_newcus_gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cusid_box = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        fname_box = new javax.swing.JTextField();
        lname_box = new javax.swing.JTextField();
        pnum1_box = new javax.swing.JTextField();
        pnum2_box = new javax.swing.JTextField();
        address_box = new javax.swing.JTextField();
        city_box = new javax.swing.JTextField();
        male_rbtn = new javax.swing.JRadioButton();
        female_rbtn = new javax.swing.JRadioButton();
        save_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cancel_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 237, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(100, 199, 150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Customer Id");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        cusid_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel8.add(cusid_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 220, 25));

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
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Gender");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Address");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("City");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        fname_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel8.add(fname_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 25));

        lname_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel8.add(lname_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 25));

        pnum1_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnum1_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnum1_boxActionPerformed(evt);
            }
        });
        jPanel8.add(pnum1_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 220, 25));

        pnum2_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel8.add(pnum2_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 25));

        address_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_boxActionPerformed(evt);
            }
        });
        jPanel8.add(address_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 220, 25));

        city_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        city_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_boxActionPerformed(evt);
            }
        });
        jPanel8.add(city_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 220, 25));

        male_rbtn.setBackground(new java.awt.Color(100, 199, 150));
        add_newcus_gender.add(male_rbtn);
        male_rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male_rbtn.setText("Male");
        male_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rbtnActionPerformed(evt);
            }
        });
        jPanel8.add(male_rbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        female_rbtn.setBackground(new java.awt.Color(100, 199, 150));
        add_newcus_gender.add(female_rbtn);
        female_rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        female_rbtn.setText("Female");
        female_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_rbtnActionPerformed(evt);
            }
        });
        jPanel8.add(female_rbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 460, 440));

        save_btn.setBackground(new java.awt.Color(48, 214, 48));
        save_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Save_40px.png"))); // NOI18N
        save_btn.setText("  Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel1.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 170, 45));

        cancel_btn.setBackground(new java.awt.Color(48, 214, 48));
        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cancel_Subscription_30px.png"))); // NOI18N
        cancel_btn.setText("  Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 170, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 600));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Close_Window_50px.png"))); // NOI18N
        cancel_lbl.setText("        ");
        cancel_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_lblMouseClicked(evt);
            }
        });
        jPanel3.add(cancel_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Add new customer details");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnum1_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnum1_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnum1_boxActionPerformed

    private void address_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_boxActionPerformed

    private void city_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_boxActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        
        purchase p2 = new purchase();                               // set text on purchase panel
        p2.purchase_cusid_box.setText(cusid_box.getText());
        
        String fname1 = fname_box.getText();
        String lname1 = lname_box.getText();
        String fullname = fname1 + " " + lname1;
        p2.purchase_cusname_box.setText(fullname);
        
        p2.purchase_connum_box.setText(pnum1_box.getText());
        
        String cus_id = cusid_box.getText();
        String fname = fname_box.getText();
        String lname = lname_box.getText();
        String pnum1 = pnum1_box.getText();
        String pnum2 = pnum2_box.getText();
        String address = address_box.getText();
        String city = city_box.getText();
        
        male_rbtn.setActionCommand("male");
        female_rbtn.setActionCommand("female");
        String gender = add_newcus_gender.getSelection().getActionCommand();
        
        try{
                String querry1 = "Insert INTO customer (customer_id,fname,lname,phone_num1,phone_num2,gender,address,city) values ('"+cus_id+"','"+fname+"','"+lname+"','"+pnum1+"','"+pnum2+"','"+gender+"','"+address+"','"+city+"')";
                pst = con.prepareStatement(querry1); 
                pst.execute();
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "input process doesn't work properly.");
        }
        
        
        customer_class c2 = new customer_class();           //increment the customer id
        cusid_box.setText(c2.cus_num_increment());
        
        this.setVisible(false);//close only current window
        purchase p1 = new purchase();
        
        //com.sun.awt.AWTUtilities.setWindowOpacity(p1, 1);  //reset main frame opacity
        p1.setVisible(true);
    }//GEN-LAST:event_save_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();//close only current window
        purchase p1 = new purchase();
        //p1.setOpacity(1f);
        //com.sun.awt.AWTUtilities.setWindowOpacity(p1, 1);//reset main frame opacity
        p1.setVisible(true);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void cancel_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_lblMouseClicked
        this.dispose();//close only current window
        purchase p1 = new purchase();
        //p1.setOpacity(1f);
        
        //com.sun.awt.AWTUtilities.setWindowOpacity(p1, 1);//reset main frame opacity
        p1.setVisible(true);
    }//GEN-LAST:event_cancel_lblMouseClicked

    private void male_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_rbtnActionPerformed
         //gender = "male";
    }//GEN-LAST:event_male_rbtnActionPerformed

    private void female_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_rbtnActionPerformed
        //gender = "female";
    }//GEN-LAST:event_female_rbtnActionPerformed

    //public String gender;
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
            java.util.logging.Logger.getLogger(newcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newcus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newcus().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup add_newcus_gender;
    private javax.swing.JTextField address_box;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel cancel_lbl;
    private javax.swing.JTextField city_box;
    private javax.swing.JTextField cusid_box;
    private javax.swing.JRadioButton female_rbtn;
    private javax.swing.JTextField fname_box;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField lname_box;
    private javax.swing.JRadioButton male_rbtn;
    private javax.swing.JTextField pnum1_box;
    private javax.swing.JTextField pnum2_box;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables
}
