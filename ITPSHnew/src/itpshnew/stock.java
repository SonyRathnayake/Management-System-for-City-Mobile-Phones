/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import javax.swing.JFrame;

/**
 *
 * @author Thareendra
 */
public class stock extends javax.swing.JFrame {

    /**
     * Creates new form stock
     */
    public stock() {
        this.setUndecorated(true);
        //this.setAlwaysOnTop(true);
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

        sidepanel = new javax.swing.JPanel();
        topic1 = new javax.swing.JPanel();
        bar1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        topic2 = new javax.swing.JPanel();
        bar2 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        topic3 = new javax.swing.JPanel();
        bar3 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        topic4 = new javax.swing.JPanel();
        bar4 = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        topic5 = new javax.swing.JPanel();
        bar5 = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        topic6 = new javax.swing.JPanel();
        bar6 = new javax.swing.JPanel();
        name5 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        topic7 = new javax.swing.JPanel();
        bar7 = new javax.swing.JPanel();
        name6 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        topic8 = new javax.swing.JPanel();
        bar8 = new javax.swing.JPanel();
        name7 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic1.setBackground(new java.awt.Color(0, 153, 153));
        topic1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar1.setOpaque(false);

        javax.swing.GroupLayout bar1Layout = new javax.swing.GroupLayout(bar1);
        bar1.setLayout(bar1Layout);
        bar1Layout.setHorizontalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar1Layout.setVerticalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic1.add(bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText(" Home");
        topic1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Home_48px.png"))); // NOI18N
        topic1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        topic2.setBackground(new java.awt.Color(0, 153, 153));
        topic2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar2.setOpaque(false);
        bar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bar2topic2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar2Layout = new javax.swing.GroupLayout(bar2);
        bar2.setLayout(bar2Layout);
        bar2Layout.setHorizontalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar2Layout.setVerticalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic2.add(bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Sales");
        topic2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cash_Register_40px_1.png"))); // NOI18N
        topic2.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 60));

        topic3.setBackground(new java.awt.Color(0, 153, 153));
        topic3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar3.setOpaque(false);

        javax.swing.GroupLayout bar3Layout = new javax.swing.GroupLayout(bar3);
        bar3.setLayout(bar3Layout);
        bar3Layout.setHorizontalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar3Layout.setVerticalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic3.add(bar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("  Repair");
        topic3.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Maintenance_40px.png"))); // NOI18N
        topic3.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, 60));

        topic4.setBackground(new java.awt.Color(0, 153, 153));
        topic4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar4.setOpaque(false);

        javax.swing.GroupLayout bar4Layout = new javax.swing.GroupLayout(bar4);
        bar4.setLayout(bar4Layout);
        bar4Layout.setHorizontalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar4Layout.setVerticalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic4.add(bar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText(" Stock");
        topic4.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Warehouse_40px.png"))); // NOI18N
        topic4.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 290, 60));

        topic5.setBackground(new java.awt.Color(0, 153, 153));
        topic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic5MousePressed(evt);
            }
        });
        topic5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar5.setOpaque(false);
        bar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar5Layout = new javax.swing.GroupLayout(bar5);
        bar5.setLayout(bar5Layout);
        bar5Layout.setHorizontalGroup(
            bar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar5Layout.setVerticalGroup(
            bar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic5.add(bar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("           Distribution");
        name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic5MousePressed(evt);
            }
        });
        topic5.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Delivered_40px.png"))); // NOI18N
        pic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic5MousePressed(evt);
            }
        });
        topic5.add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 60));

        topic6.setBackground(new java.awt.Color(0, 153, 153));
        topic6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar6.setOpaque(false);

        javax.swing.GroupLayout bar6Layout = new javax.swing.GroupLayout(bar6);
        bar6.setLayout(bar6Layout);
        bar6Layout.setHorizontalGroup(
            bar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar6Layout.setVerticalGroup(
            bar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic6.add(bar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name5.setForeground(new java.awt.Color(255, 255, 255));
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("    Finance");
        topic6.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Money_Bag_40px.png"))); // NOI18N
        topic6.add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 60));

        topic7.setBackground(new java.awt.Color(0, 153, 153));
        topic7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar7.setOpaque(false);

        javax.swing.GroupLayout bar7Layout = new javax.swing.GroupLayout(bar7);
        bar7.setLayout(bar7Layout);
        bar7Layout.setHorizontalGroup(
            bar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar7Layout.setVerticalGroup(
            bar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic7.add(bar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name6.setForeground(new java.awt.Color(255, 255, 255));
        name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name6.setText("HR");
        topic7.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 230, 40));

        pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_User_Group_Man_Man_40px.png"))); // NOI18N
        topic7.add(pic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 290, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("City Mobile");
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 60));
        sidepanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 270, 20));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

        topic8.setBackground(new java.awt.Color(0, 153, 153));
        topic8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar8.setOpaque(false);

        javax.swing.GroupLayout bar8Layout = new javax.swing.GroupLayout(bar8);
        bar8.setLayout(bar8Layout);
        bar8Layout.setHorizontalGroup(
            bar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar8Layout.setVerticalGroup(
            bar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic8.add(bar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name7.setForeground(new java.awt.Color(255, 255, 255));
        name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name7.setText("   Web");
        topic8.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 230, 40));

        pic7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Web_Design_40px.png"))); // NOI18N
        topic8.add(pic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 290, 60));

        jLabel6.setText("Empid16428685662");
        sidepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 170, 50));

        center.setBackground(new java.awt.Color(199, 238, 238));

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        topbar.setBackground(new java.awt.Color(0, 204, 204));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Close_Window_40px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        topbar.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 49));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Minimize_Window_40px.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        topbar.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, 50));

        time.setText("Time");
        topbar.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 120, 50));

        date.setText("Date with calender");
        topbar.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bar2topic2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bar2topic2MousePressed
        /* setColor(topic2);   //set the colour
        bar2.setOpaque(true);  */

    }//GEN-LAST:event_bar2topic2MousePressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0); // cancel button
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
          //minimize label
        this.setExtendedState(JFrame.ICONIFIED);

    }//GEN-LAST:event_minimizeMouseClicked

    private void topic5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_topic5MousePressed

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
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JPanel bar3;
    private javax.swing.JPanel bar4;
    private javax.swing.JPanel bar5;
    private javax.swing.JPanel bar6;
    private javax.swing.JPanel bar7;
    private javax.swing.JPanel bar8;
    private javax.swing.JPanel center;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel time;
    private javax.swing.JPanel topbar;
    private javax.swing.JPanel topic1;
    private javax.swing.JPanel topic2;
    private javax.swing.JPanel topic3;
    private javax.swing.JPanel topic4;
    private javax.swing.JPanel topic5;
    private javax.swing.JPanel topic6;
    private javax.swing.JPanel topic7;
    private javax.swing.JPanel topic8;
    // End of variables declaration//GEN-END:variables
}
