/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.financialsystem;

import itpshnew.DateTimeFunctions;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.text.DateFormatSymbols;

/**
 *
 * @author isira
 */
public class MonthFinancialSystem extends FinancialSystem {

    /**
     * Creates new form MonthFinancialSystem
     */
    public MonthFinancialSystem() {
        super();
    }
    
    @Override
    public void pubInit()
    {
        initComponents();
        loaded = true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        month_pan = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        hr_cost1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        other_costs1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        repair_rev1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        repair_cost1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        repair_prof1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        sales_rev1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sales_cost1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        sales_prof1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dis_rev1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        dis_cost1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        dis_prof1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        search_month = new com.toedter.calendar.JMonthChooser();
        search_year = new com.toedter.calendar.JYearChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tot_rev1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tot_cost1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tot_prof1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1070, 450));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        month_pan.setBackground(new java.awt.Color(202, 254, 227));
        month_pan.setMinimumSize(new java.awt.Dimension(1060, 710));
        month_pan.setPreferredSize(new java.awt.Dimension(1076, 718));
        month_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(100, 199, 150));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Monthly HR costs:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Monthly utility costs:");

        other_costs1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hr_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(other_costs1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(other_costs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hr_cost1)
                        .addComponent(jLabel33)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        month_pan.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1110, -1));

        jPanel6.setBackground(new java.awt.Color(100, 199, 150));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Monthly repair income:");

        repair_rev1.setName(""); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Monthly repair costs:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Monthly repair profit:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Monthly sales income:");

        sales_rev1.setName(""); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Monthly sales costs:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Monthly sales profit:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Monthly distribution revenue:");

        dis_rev1.setName(""); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Monthly distribution costs:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Monthly distribution profit:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(sales_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sales_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sales_prof1))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_rev1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(repair_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(dis_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(dis_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addComponent(dis_prof1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                .addContainerGap())
        );

        month_pan.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 40, 1110, -1));

        jPanel5.setBackground(new java.awt.Color(100, 199, 150));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Year:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Month:");

        search.setBackground(new java.awt.Color(48, 214, 48));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search_month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(121, 121, 121))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(search_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(search_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addGap(99, 99, 99))
        );

        month_pan.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 340, 130));

        jPanel4.setBackground(new java.awt.Color(100, 199, 150));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Monthly total income:");

        tot_rev1.setEditable(false);
        tot_rev1.setName(""); // NOI18N
        tot_rev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tot_rev1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Monthly total costs:");

        tot_cost1.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Monthly total profit:");

        tot_prof1.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tot_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tot_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_rev1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_cost1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_prof1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18))
        );

        month_pan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 340, -1));

        jButton1.setBackground(new java.awt.Color(48, 214, 48));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        month_pan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 180, -1));

        jButton2.setBackground(new java.awt.Color(48, 214, 48));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Calculate Results");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        month_pan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        jButton3.setBackground(new java.awt.Color(48, 214, 48));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Generate Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        month_pan.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));

        jButton4.setBackground(new java.awt.Color(48, 214, 48));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        month_pan.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(month_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(month_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String month = new DateFormatSymbols().getMonths()[search_month.getMonth()];
        String year = ""+search_year.getYear();

        try
        {
            s = conn.createStatement();
            s.execute("SELECT 1 FROM financial_reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
            if(s.getResultSet().next())
            {
                ResultSet rs = s.executeQuery("SELECT * FROM financial_reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
                rs.next();
                double s_totrev = rs.getDouble("Total_revenue"), s_totcost = rs.getDouble("Total_costs"), s_totprof = rs.getDouble("Total_profit");
                JOptionPane.showMessageDialog(this, "<html><b>Financial values for "+month+" "+year+"</b></html>\n\nTotal income: "
                    +s_totrev+"\nTotal costs: "+s_totcost+"\nTotal profit: "+s_totprof,
                    "Results found", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "A financial record for "+month+" "+year+" does not exist.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "An error occurred while searching.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void calculateResults()
    {
        RepRev = RepCost = RepProf = 0;
        SalesRev = SalesCost = SalesProf = 0;
        DisRev = DisCost = DisProf = 0;
        HRCost = UtilityCost = 0;
        TotRev = TotCost = TotProf = 0;
        try
        {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM daily_finances"
                    + " WHERE Month='"+DateTimeFunctions.getMonth()+"' AND Year="+DateTimeFunctions.getYear());
            while(rs.next())
            {
                RepRev += rs.getFloat("Rep_inc");
                RepCost += rs.getFloat("Rep_cost");
                SalesRev += rs.getFloat("Sales_inc");
                SalesCost += rs.getFloat("Sales_cost");
                DisRev += rs.getFloat("Dis_inc");
                DisCost += rs.getFloat("Dis_cost");
                HRCost += rs.getFloat("HR_cost");
                UtilityCost += rs.getFloat("Other_cost");
            }
            RepProf = RepRev - RepCost;
            SalesProf = SalesRev - SalesCost;
            DisProf = DisRev - DisCost;
            rs = s.executeQuery("SELECT NetSalary FROM monthlysal WHERE Month='"+DateTimeFunctions.getMonth()+"'");
            while(rs.next())
                HRCost += rs.getFloat("NetSalary");
            
            TotRev = RepRev + SalesRev + DisRev;
            TotCost = RepCost + SalesCost + DisRev + HRCost + UtilityCost;
            TotProf = TotRev - TotCost;
            
            repair_rev1.setText(Float.toString(RepRev).replaceAll("\\.0*$", ""));
            repair_cost1.setText(Float.toString(RepCost).replaceAll("\\.0*$", ""));
            repair_prof1.setText(Float.toString(RepProf).replaceAll("\\.0*$", ""));
            sales_rev1.setText(Float.toString(SalesRev).replaceAll("\\.0*$", ""));
            sales_cost1.setText(Float.toString(SalesCost).replaceAll("\\.0*$", ""));
            sales_prof1.setText(Float.toString(SalesProf).replaceAll("\\.0*$", ""));
            dis_rev1.setText(Float.toString(DisRev).replaceAll("\\.0*$", ""));
            dis_cost1.setText(Float.toString(DisCost).replaceAll("\\.0*$", ""));
            dis_prof1.setText(Float.toString(DisProf).replaceAll("\\.0*$", ""));
            hr_cost1.setText(Float.toString(HRCost).replaceAll("\\.0*$", ""));
            other_costs1.setText(Float.toString(UtilityCost).replaceAll("\\.0*$", ""));
            tot_rev1.setText(Float.toString(TotRev).replaceAll("\\.0*$", ""));
            tot_cost1.setText(Float.toString(TotCost).replaceAll("\\.0*$", ""));
            tot_prof1.setText(Float.toString(TotProf).replaceAll("\\.0*$", ""));
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "There was an error while retrieving financial values to calculate results.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
    }
    
    private void updateResults()
    {
        try
        {
            RepRev = Float.parseFloat(repair_rev1.getText());
            RepCost = Float.parseFloat(repair_cost1.getText());
            RepProf = RepRev - RepCost;
            repair_prof1.setText(Float.toString(RepProf).replaceAll("\\.0*$", ""));
            
            SalesRev = Float.parseFloat(sales_rev1.getText());
            SalesCost = Float.parseFloat(sales_cost1.getText());
            SalesProf = SalesRev - SalesCost;
            sales_prof1.setText(Float.toString(SalesProf).replaceAll("\\.0*$", ""));
            
            DisRev = Float.parseFloat(dis_rev1.getText());
            DisCost = Float.parseFloat(dis_cost1.getText());
            DisProf = DisRev - DisCost;
            dis_prof1.setText(Float.toString(DisProf).replaceAll("\\.0*$", ""));
            
            HRCost = Float.parseFloat(hr_cost1.getText());
            
            UtilityCost = Float.parseFloat(other_costs1.getText());
            
            TotRev = RepRev + SalesRev + DisRev;
            TotCost = RepCost + SalesCost + DisCost + HRCost + UtilityCost;
            TotProf = TotRev - TotCost;
            tot_rev1.setText(Float.toString(TotRev).replaceAll("\\.0*$", ""));
            tot_cost1.setText(Float.toString(TotCost).replaceAll("\\.0*$", ""));
            tot_prof1.setText(Float.toString(TotProf).replaceAll("\\.0*$", ""));

            JOptionPane.showMessageDialog(this, "The financial values have been successfully updated.",
                    "Financial values updated", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void generateReport()
    {
        if(TotProf == 0 && TotRev == 0 && TotCost == 0)
        {
            JOptionPane.showMessageDialog(this, "You have not generated the required financial values. Please click the \"Calculate Results\" button to do so.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String month = DateTimeFunctions.getMonth();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        try
        {
            Statement s = conn.createStatement();
            String title, message;
            s.execute("SELECT * FROM financial_reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
            if(s.getResultSet().next())
            {
                s.execute("UPDATE financial_reports SET Total_revenue="+TotRev+", Total_costs="+TotCost+", Total_profit="+TotProf
                        +" WHERE Month_issued='"+month+"' AND Year_issued="+year);
                title = "Update successful";
                message = "The financial report for the current month and year has been updated.";
            }
            else
            {
                s.execute("INSERT INTO financial_reports VALUES('"+month+"',"+year+","+TotRev+","+TotCost+","+TotProf+")");
                title = "Insertion successful";
                message = "The financial report for the current month and year has been inserted.";
            }
            JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
            genIReport();
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "An error occurred while writing the financial report to the database.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tot_rev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tot_rev1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tot_rev1ActionPerformed
           
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateResults();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calculateResults();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generateReport();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void clear()
    {
        repair_rev1.setText("");
        repair_cost1.setText("");
        repair_prof1.setText(""); 
        sales_rev1.setText("");
        sales_cost1.setText("");
        sales_prof1.setText("");
        dis_rev1.setText("");
        dis_cost1.setText("");
        dis_prof1.setText("");
        hr_cost1.setText("");
        tot_rev1.setText("");
        tot_cost1.setText("");
        tot_prof1.setText("");
        other_costs1.setText("");
    }

    @Override
    public void genIReport()
    {
        try
        {
            JasperCompileManager.compileReportToFile("reports/monthfinances.jrxml", "reports/monthfinances.jasper");
            JasperFillManager.fillReportToFile("reports/monthfinances.jasper",
                    "reports/monthfinances.jrprint", null, conn);
            JasperViewer.viewReport("reports/monthfinances.jrprint", false, false);
        }
        catch(JRException e)
        {
            JOptionPane.showMessageDialog(this, "Unable to generate report.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dis_cost1;
    private javax.swing.JTextField dis_prof1;
    private javax.swing.JTextField dis_rev1;
    private javax.swing.JTextField hr_cost1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel month_pan;
    private javax.swing.JTextField other_costs1;
    private javax.swing.JTextField repair_cost1;
    private javax.swing.JTextField repair_prof1;
    private javax.swing.JTextField repair_rev1;
    private javax.swing.JTextField sales_cost1;
    private javax.swing.JTextField sales_prof1;
    private javax.swing.JTextField sales_rev1;
    private javax.swing.JButton search;
    private com.toedter.calendar.JMonthChooser search_month;
    private com.toedter.calendar.JYearChooser search_year;
    private javax.swing.JTextField tot_cost1;
    private javax.swing.JTextField tot_prof1;
    private javax.swing.JTextField tot_rev1;
    // End of variables declaration//GEN-END:variables
}