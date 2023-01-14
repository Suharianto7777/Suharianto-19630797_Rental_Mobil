/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalMobil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author toshiba
 */
public class Laporan_Transaksi extends javax.swing.JFrame {
private Object dateFormat;
private Connection con;
private Statement stat;
private ResultSet res;
private String sql="";

private String idpenyewa,nama,idmobil,tglpinjam,tglkembali,lama;
private int harga,total;

    /**
     * Creates new form Transaksi
     */
    public Laporan_Transaksi() {
        initComponents();
        koneksi();
        kosongkan();
        TampilData(sql);
        tanggal();
    }

private void koneksi(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/19630797", "root", "");
        stat=con.createStatement();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

private void kosongkan(){

}

private void TampilData (String sql){
    DefaultTableModel t = new DefaultTableModel();
    
    t.addColumn("ID Penyewa");
    t.addColumn("Nama ");
    t.addColumn("ID Mobil");
    t.addColumn("Tanggal Pinjam");
    t.addColumn("Tanggal Kembali");
    t.addColumn("Harga");
    t.addColumn("Lama");
    t.addColumn("Total");
    Table.setModel(t);
    try {
        int i = 1;
        stat=con.createStatement();
        res=stat.executeQuery("select * from db_transaksi");
        while (res.next()) {
            t.addRow(new Object[]{
            res.getString("id_penyewa"),
            res.getString("nama_penyewa"),
            res.getString("id_mobil"),
            res.getString("tgl_pinjam"),
            res.getString("tgl_kembali"),
            res.getString("harga"),
            res.getString("lama"),
            res.getString("total"),
            });
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
    }
}
    
public void tanggal(){

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cetak = new javax.swing.JButton();
        BackHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        cetak.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cetak.setText("CETAK");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        BackHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackHome.setText("Back Home");
        BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomeActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel9.setText("LAPORAN TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(BackHome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetak)
                    .addComponent(BackHome))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        // TODO add your handling code here:
       try {
            Table.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Data Transaksi"), null);
        } catch (PrinterException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cetakActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackHomeActionPerformed

    private void TableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TableKeyPressed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int i = Table.getSelectedRow();
        if(i==-1){
        return;
        }
        String code = (String)Table.getValueAt(i,0);
        String code1 = (String)Table.getValueAt(i,1);
        String code2 = (String)Table.getValueAt(i,2);
        String code3 = (String)Table.getValueAt(i,3);
        String code4 = (String)Table.getValueAt(i,4);
        String code5 = (String)Table.getValueAt(i,5);
        String code6 = (String)Table.getValueAt(i,6);
        String code7 = (String)Table.getValueAt(i,7);
    }//GEN-LAST:event_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Laporan_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan_Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome;
    private javax.swing.JTable Table;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
