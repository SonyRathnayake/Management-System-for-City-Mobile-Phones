/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.hr;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author isira
 */
public class HR extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst =null;
    ResultSet rs= null;
    ResultSet rs1= null;
    /**
     * Creates new form HR1
     */
    public HR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public ArrayList<employee>tablelist1()
     {
         ArrayList<employee> tablelist1= new ArrayList<>();
            try
            {
                String x = "";//jTextField21.getText();
                String sql = "SELECT EmpID,EmpName,dob,EmpAddress,EmpEmail,EmpPhone,JobID,JobDate,Basic_Sal,otRate FROM currentemployee  where JobID='"+x+"' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                employee tb;
                while(rs.next())
                {
                    tb=new employee(rs.getString("EmpID"),rs.getString("EmpName"),rs.getString("dob"),rs.getString("EmpAddress"),rs.getString("EmpEmail"),rs.getInt("EmpPhone"),rs.getString("JobID"),rs.getString("JobDate"),rs.getDouble("Basic_Sal"),rs.getDouble("otRate"));
                    tablelist1.add(tb);
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e); 
            }
            return tablelist1;
     }
    
    public ArrayList<attendance>tablelist(){
         ArrayList<attendance> tablelist= new ArrayList<>();
            try{
             String x="";//jTextField21.getText();
             String sql="SELECT EmpID,Date,Othours,WorkingHours FROM dailyattendance ";
             pst=con.prepareStatement(sql);
             rs= pst.executeQuery();
            
          attendance tb;
            
            while(rs.next()){
                tb=new attendance(rs.getString("EmpID"),rs.getString("Date"),rs.getDouble("Othours"),rs.getDouble("WorkingHours"));
                tablelist.add(tb);
                
            }
             
            }
            catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
             
            }
            return tablelist;
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}