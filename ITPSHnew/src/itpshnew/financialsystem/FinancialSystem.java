/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.financialsystem;

import itpshnew.dbCon;
import java.sql.*;
import javax.swing.*;
import net.sf.jasperreports.engine.*;
/**
 *
 * @author Isira
 */
public abstract class FinancialSystem extends JPanel {

    protected Connection conn;
    protected Statement s;
    protected JasperPrint jp;
    protected boolean loaded = false;
    protected float RepRev = 0, RepCost = 0, RepProf = 0, SalesRev = 0, SalesCost = 0,
            SalesProf = 0, DisRev = 0, DisCost = 0, DisProf = 0, HRCost = 0, UtilityCost = 0,
            TotCost = 0, TotProf = 0, TotRev = 0;
    
    public FinancialSystem()
    {
        conn = dbCon.connect();
    }
    
    public abstract void pubInit();
    
    public abstract void genIReport();
    
    public boolean getLoaded()
    {
        return loaded;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
