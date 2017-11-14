/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author isira
 */
public class TodayFinancialSystem extends FinancialSystem {

    /**
     * Creates new form TodayFinancialSystem2
     */
    public TodayFinancialSystem()
    {
        super();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        today_pan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        repair_rev = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repair_cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        repair_prof = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sales_rev = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sales_cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sales_prof = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dis_rev = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dis_cost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dis_prof = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        tot_rev = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tot_cost = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tot_prof = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        hr_cost = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        other_costs = new javax.swing.JTextField();
        updateToday = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        today_pan.setBackground(new java.awt.Color(202, 254, 227));
        today_pan.setMinimumSize(new java.awt.Dimension(1076, 718));
        today_pan.setPreferredSize(new java.awt.Dimension(1076, 718));
        today_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(100, 199, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Today's repair income:");

        repair_rev.setEditable(false);
        repair_rev.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Today's repair costs:");

        repair_cost.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Today's repair profit:");

        repair_prof.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Today's sales income:");

        sales_rev.setEditable(false);
        sales_rev.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Today's sales costs:");

        sales_cost.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Today's sales profit:");

        sales_prof.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Today's distribution revenue:");

        dis_rev.setEditable(false);
        dis_rev.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Today's distribution costs:");

        dis_cost.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Today's distribution profit:");

        dis_prof.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(repair_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(dis_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dis_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(dis_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(repair_rev)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(sales_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sales_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sales_prof)
                            .addComponent(jLabel8))
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        today_pan.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1090, -1));

        jPanel7.setBackground(new java.awt.Color(100, 199, 150));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Today's total income:");

        tot_rev.setEditable(false);
        tot_rev.setName(""); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Today's total costs:");

        tot_cost.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Today's total profit:");

        tot_prof.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tot_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tot_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel28))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18))
        );

        today_pan.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 340, -1));

        jPanel3.setBackground(new java.awt.Color(100, 199, 150));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Today's HR costs:");

        hr_cost.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Today's other costs:");

        other_costs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                other_costsActionPerformed(evt);
            }
        });

        updateToday.setBackground(new java.awt.Color(48, 214, 48));
        updateToday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateToday.setText("Update");
        updateToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTodayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(other_costs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(updateToday, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hr_cost)
                            .addGap(3, 3, 3))
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(other_costs)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel16))
                        .addGap(3, 3, 3)))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateToday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        today_pan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1100, 70));

        add(today_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void pubInit()
    {
        initComponents();
        initToday();
    }
    
    private void initToday()
    {
        try
        {
            Statement s = conn.createStatement();
            ResultSet rs;
            RepRev = 300;
            RepCost = 300;
            RepProf = RepRev - RepCost;
            rs = s.executeQuery("SELECT net_amount FROM bill WHERE Date = CURDATE()");
            while(rs.next())
                SalesRev += rs.getFloat("net_amount");
            rs = s.executeQuery("SELECT totalCost FROM reorder");
            while(rs.next())
                SalesCost += rs.getFloat("totalCost");
            SalesProf = SalesRev - SalesCost;
            rs = s.executeQuery("SELECT item_cost FROM shipping_rec WHERE Day="
                    +DateTimeFunctions.getDay()+" AND Month='"
                    +DateTimeFunctions.getMonth()+"' AND Year="
                    +DateTimeFunctions.getYear()+" AND ship_type='Retail'");
            while(rs.next())
                DisRev += rs.getFloat("item_cost");
            rs = s.executeQuery("SELECT item_cost, Shipping_Cost FROM shipping_rec"
                    + " WHERE Day="+DateTimeFunctions.getDay()
                    +" AND Month='"+DateTimeFunctions.getMonth()
                    +"' AND Year="+DateTimeFunctions.getYear()+" AND ship_type='Vendor'");
            while(rs.next())
                DisCost += rs.getFloat("item_cost") + rs.getFloat("Shipping_Cost");
            DisProf = DisRev - DisCost;
            rs = s.executeQuery("SELECT hour(ExitTime-Shift_eTime) AS Overtime_hours, dailyRate, otRate"
                    + " FROM dailyattendance da, currentemployee ce, salaryrate sr"
                    + " WHERE da.EmpID=ce.EmpID AND ce.JobID=sr.JobID AND Date=STR_TO_DATE('"
                    +DateTimeFunctions.getDate()+"', '%d %m %y')");
            while(rs.next())
                HRCost += rs.getInt("Overtime_hours") * rs.getFloat("otRate") + rs.getFloat("dailyRate");
            TotRev = RepRev + SalesRev + DisRev;
            TotCost = RepCost + SalesCost + DisCost + HRCost;
            TotProf = TotRev - TotCost;
            rs = s.executeQuery("SELECT Other_cost FROM daily_finances WHERE Day="
                    +DateTimeFunctions.getDay()+" AND Month='"
                    +DateTimeFunctions.getMonth()+"' AND Year="
                    +DateTimeFunctions.getYear());
            if(rs.next() && rs.getFloat("Other_Cost") != 0)
                OtherCost = rs.getFloat("Other_Cost");
            repair_rev.setText(Float.toString(RepRev).replaceAll("\\.0*$", ""));
            repair_cost.setText(Float.toString(RepCost).replaceAll("\\.0*$", ""));
            repair_prof.setText(Float.toString(RepProf).replaceAll("\\.0*$", ""));
            sales_rev.setText(Float.toString(SalesRev).replaceAll("\\.0*$", ""));
            sales_cost.setText(Float.toString(SalesCost).replaceAll("\\.0*$", ""));
            sales_prof.setText(Float.toString(SalesProf).replaceAll("\\.0*$", ""));
            dis_rev.setText(Float.toString(DisRev).replaceAll("\\.0*$", ""));
            dis_cost.setText(Float.toString(DisCost).replaceAll("\\.0*$", ""));
            dis_prof.setText(Float.toString(DisProf).replaceAll("\\.0*$", ""));
            hr_cost.setText(Float.toString(HRCost).replaceAll("\\.0*$", ""));
            other_costs.setText(Float.toString(OtherCost).replaceAll("\\.0*$", ""));
            tot_rev.setText(Float.toString(TotRev).replaceAll("\\.0*$", ""));
            tot_cost.setText(Float.toString(TotCost).replaceAll("\\.0*$", ""));
            tot_prof.setText(Float.toString(TotProf).replaceAll("\\.0*$", ""));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Unable to retrieve values from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void other_costsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_other_costsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_other_costsActionPerformed

    private void updateTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTodayActionPerformed
        try
        {
            OtherCost = Float.parseFloat(other_costs.getText());
            TotCost = RepCost + SalesCost + DisCost + HRCost + OtherCost;
            TotProf = TotRev - TotCost;
            Statement s = conn.createStatement();
            s.execute("SELECT 1 FROM daily_finances WHERE Day="
                    +DateTimeFunctions.getDay()+" AND Month='"+DateTimeFunctions.getMonth()
                    +"' AND Year="+DateTimeFunctions.getYear());
            if(s.getResultSet().next())
            {
                s.execute("UPDATE daily_finances SET Rep_inc="+RepRev+", Rep_cost="+RepCost
                    +", Rep_prof="+RepProf+", Sales_inc="+SalesRev+", Sales_cost="+SalesCost
                    +", Sales_prof="+SalesCost+", Dis_inc="+DisRev+", Dis_cost="+DisCost
                    +", Dis_prof="+DisProf+", HR_cost="+HRCost
                    +", Other_cost="+OtherCost
                    +", Tot_cost="+TotCost+", Tot_prof="+TotProf
                    +" WHERE Day="+DateTimeFunctions.getDay()+" AND Month='"+DateTimeFunctions.getMonth()
                    +"' AND Year="+DateTimeFunctions.getYear());
                JOptionPane.showMessageDialog(this, "Successfully updated record for "
                        +DateTimeFunctions.getDate()+" to database.", "Update successful", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                s.execute("INSERT INTO daily_finances VALUES("+DateTimeFunctions.getDay()
                    +", '"+DateTimeFunctions.getMonth()+"', "+DateTimeFunctions.getYear()+", "
                    +RepRev+", "+RepCost+", "+RepProf+", "+SalesRev+", "+SalesCost+", "+SalesProf
                    +", "+DisRev+", "+DisCost+", "+DisProf+", "+HRCost+", "+OtherCost
                    +", "+TotRev+", "+TotCost+", "+TotProf+")");
                JOptionPane.showMessageDialog(this, "Successfully inserted record for "
                        +DateTimeFunctions.getDate()+".", "Insertion successful", JOptionPane.INFORMATION_MESSAGE);
            }
            tot_cost.setText(Float.toString(TotCost).replaceAll("\\.0*$", ""));
            tot_prof.setText(Float.toString(TotProf).replaceAll("\\.0*$", ""));
            genIReport();
        }
        catch(NumberFormatException ne)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store a blank or invalid number. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to insert/update record for "
                    +DateTimeFunctions.getDate()+" to database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateTodayActionPerformed

    @Override
    public void genIReport()
    {
        try
        {
            JasperCompileManager.compileReportToFile("reports/todayfinances.jrxml", "reports/todayfinances.jasper");
            JasperFillManager.fillReportToFile("reports/todayfinances.jasper",
                    "reports/todayfinances.jrprint", new HashMap(), conn);
            JasperViewer jv = new JasperViewer("reports/todayfinances.jrprint", false);
            jv.setVisible(true);
        }
        catch(JRException e)
        {
            JOptionPane.showMessageDialog(this, "Unable to generate report.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dis_cost;
    private javax.swing.JTextField dis_prof;
    private javax.swing.JTextField dis_rev;
    private javax.swing.JTextField hr_cost;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField other_costs;
    private javax.swing.JTextField repair_cost;
    private javax.swing.JTextField repair_prof;
    private javax.swing.JTextField repair_rev;
    private javax.swing.JTextField sales_cost;
    private javax.swing.JTextField sales_prof;
    private javax.swing.JTextField sales_rev;
    private javax.swing.JPanel today_pan;
    private javax.swing.JTextField tot_cost;
    private javax.swing.JTextField tot_prof;
    private javax.swing.JTextField tot_rev;
    private javax.swing.JButton updateToday;
    // End of variables declaration//GEN-END:variables
}
